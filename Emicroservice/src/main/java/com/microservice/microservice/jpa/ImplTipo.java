package com.microservice.microservice.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.microservice.dao.ITipo;
import com.microservice.microservice.entities.Tipo;

@Service
public class ImplTipo implements ITipoDAO{

	@Autowired
	private ITipo iTip;

	@Override
	public Tipo get(Long id) {
		Tipo m = iTip.findById(id).get();
		return m;
	}

	@Override
	public List<Tipo> getAll() {
		return (List<Tipo>) iTip.findAll();
	}

	@Override
	public void post(Tipo entity) {
		iTip.save(entity);
	}

	@Override
	public void put(Tipo entity, long id) {
		iTip.findById(id).ifPresent((x)->{
			entity.setId(id);
			iTip.save(entity);
		});
		
	}

	@Override
	public void delete(Long id) {
		iTip.deleteById(id);
		
	}

}
