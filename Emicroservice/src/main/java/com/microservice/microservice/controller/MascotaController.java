package com.microservice.microservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microservice.microservice.entities.Mascota;
import com.microservice.microservice.jpa.IMascotaDAO;

@RestController
@RequestMapping("/mascota")
public class MascotaController{
	
	@Autowired
	private IMascotaDAO iMasc;
	
	 @GetMapping("/consulta/{id}")
	 public Mascota consulta(@PathVariable(value = "id") Long id) {		 
			 return  iMasc.get(id);
			 
	 }
}