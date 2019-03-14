package com.cliente.Cliente.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientException;
import com.cliente.Cliente.service.Iface;

@RestController
public class MascotaController {
	
	@Autowired
	public Iface iFace;
	
	@GetMapping("/{id}")
	public String mascotas(@PathVariable(value = "id")Long id) throws RestClientException, IOException {
		try {
			String consult = iFace.getDatos(id);
			return consult;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
