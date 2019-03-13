package com.microservice.microservice.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.microservice.dao.Imascota;
import com.microservice.microservice.entities.Mascota;

@Service
public class ImplMascota implements IMascotaDAO{

	@Autowired
	private Imascota iMasc;
	
	@Override
	public Mascota get(Long id) {
		Mascota m = iMasc.findById(id).get();
		return m;
	}

	@Override
	public List<Mascota> getAll() {
		return (List<Mascota>) iMasc.findAll();
	}

	@Override
	public void post(Mascota entity) {
		iMasc.save(entity);
	}

	@Override
	public void put(Mascota entity, long id) {
		iMasc.findById(id).ifPresent((x)->{
			entity.setId(id);
			iMasc.save(entity);
		});
		
	}

	@Override
	public void delete(Long id) {
		iMasc.deleteById(id);
		
	}


}
