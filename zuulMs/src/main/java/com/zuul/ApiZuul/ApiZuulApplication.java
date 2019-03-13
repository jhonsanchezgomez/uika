package com.zuul.ApiZuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuul.ApiZuul.filtros.Filtro;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ApiZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiZuulApplication.class, args);
	}
	
	@Bean
	public Filtro fil() {
		return new Filtro();
	}

}
