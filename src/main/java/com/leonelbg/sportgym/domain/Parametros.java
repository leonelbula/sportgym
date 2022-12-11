package com.leonelbg.sportgym.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="empresa")
@Getter
@Setter
@ToString
public class Parametros {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="ciudad")
	private String ciudad;
	
	@Column(name="departamento")
	private String departamento;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="email")
	private String email;

}
