package com.microservice.microservice.jpa;

import java.util.List;

import com.microservice.microservice.entities.Tipo;

public interface ITipoDAO {
	 public Tipo get(Long id);
	 public List<Tipo> getAll();
	 public void post(Tipo entity);
	 public void put(Tipo entity, long id);
	 public void delete(Long id);
}
