package com.uca.capas.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(schema="public",name="municipio")
public class Municipio {
	@Id
	@Column(name="idMunicipio")
	private Integer idMunicipio;
	
	@Column(name="nombre")
	private String nombre;
	
	@OneToMany(mappedBy="municipio", fetch = FetchType.EAGER)
	private List<Usuario> usuarios;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="idDepto")
	private Departamento departamento;
	

}
