package com.iesjandula.Unidad3.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "departamento")
public class Departamento
{
	@Id
	@Column(length = 10)
	private Long id;
	
	@Column(length = 100)
	private String nombre;
	
	public Departamento()
	{
		
	}

	public Long getId()
	{
		return id;
	}

	public void setId(long id)
	{
		this.id = id;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Departamento{" +
				"id=" + id +
				", nombre='" + nombre + '\'' +
				'}';
	}
}
