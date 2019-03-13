package com.microservice.microservice.entities;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the tbl_mascotas database table.
 * 
 */
@Service
@Entity
@Table(name="tbl_mascotas")
@NamedQuery(name="Mascota.findAll", query="SELECT m FROM Mascota m")
public class Mascota implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private int edad;

	private String nombre;

	private String raza;

	private String sexo;

	//bi-directional many-to-one association to Tipo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="tbl_tipo_id")
	@JsonIgnore
	private Tipo tblTipo;

	public Mascota() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return this.raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	@JsonIgnore
	public Tipo getTblTipo() {
		return this.tblTipo;
	}

	public void setTblTipo(Tipo tblTipo) {
		this.tblTipo = tblTipo;
	}

}