package com.microservice.microservice.entities;

import java.io.Serializable;
import javax.persistence.*;

import org.springframework.stereotype.Service;

import java.util.List;


/**
 * The persistent class for the tbl_tipo database table.
 * 
 */
@Service
@Entity
@Table(name="tbl_tipo")
@NamedQuery(name="Tipo.findAll", query="SELECT t FROM Tipo t")
public class Tipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="nombre_tipo")
	private String nombreTipo;

	//bi-directional many-to-one association to Mascota
	@OneToMany(mappedBy="tblTipo")
	private List<Mascota> tblMascotas;

	public Tipo() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombreTipo() {
		return this.nombreTipo;
	}

	public void setNombreTipo(String nombreTipo) {
		this.nombreTipo = nombreTipo;
	}

	public List<Mascota> getTblMascotas() {
		return this.tblMascotas;
	}

	public void setTblMascotas(List<Mascota> tblMascotas) {
		this.tblMascotas = tblMascotas;
	}

	public Mascota addTblMascota(Mascota tblMascota) {
		getTblMascotas().add(tblMascota);
		tblMascota.setTblTipo(this);

		return tblMascota;
	}

	public Mascota removeTblMascota(Mascota tblMascota) {
		getTblMascotas().remove(tblMascota);
		tblMascota.setTblTipo(null);

		return tblMascota;
	}

}