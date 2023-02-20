package com.iesjandula.Unidad3.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "grado")
public class Grado
{
	@Id
	@Column(length = 10)
	private Long id;
	@Column(length = 100)
	private String nombre;
	
	public Grado()
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
		return "Grado{" +
				"id=" + id +
				", nombre='" + nombre + '\'' +
				'}';
	}
}
