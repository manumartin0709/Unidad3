package com.iesjandula.Unidad3.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "curso")
public class Curso
{
	@Id
	@Column (length = 10)
	private Long id;
	@Column (length = 10)
	private Integer anyoFin;
	@Column (length = 10)
	private Integer anyoInicio;
	
	public Curso()
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

	public Integer getAnyoFin()
	{
		return anyoFin;
	}

	public void setAnyoFin(Integer anyoFin)
	{
		this.anyoFin = anyoFin;
	}

	public Integer getAnyoInicio()
	{
		return anyoInicio;
	}

	public void setAnyoInicio(Integer anyoInicio)
	{
		this.anyoInicio = anyoInicio;
	}

	@Override
	public String toString() {
		return "Curso{" +
				"id=" + id +
				", anyoFin=" + anyoFin +
				", anyoInicio=" + anyoInicio +
				'}';
	}
}
