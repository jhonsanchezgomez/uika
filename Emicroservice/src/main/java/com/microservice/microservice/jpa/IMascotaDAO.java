package com.microservice.microservice.jpa;

import java.util.List;

import com.microservice.microservice.entities.Mascota;

public interface IMascotaDAO {
	 public Mascota get(Long id);
	 public List<Mascota> getAll();
	 public void post(Mascota entity);
	 public void put(Mascota entity, long id);
	 public void delete(Long id);
}
