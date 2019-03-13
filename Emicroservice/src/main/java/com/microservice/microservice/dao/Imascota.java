package com.microservice.microservice.dao;

import org.springframework.data.repository.CrudRepository;

import com.microservice.microservice.entities.Mascota;

public interface Imascota extends CrudRepository<Mascota, Long>{

}
