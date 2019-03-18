package com.cliente.Cliente.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "http://apizuul.netflix.svc:8080/apiZuul")
public interface Iface {
	
	@RequestMapping(method = RequestMethod.GET, value = "mascota/consulta/{id}")
	public String getDatos(@PathVariable (value = "id")Long id);
}
