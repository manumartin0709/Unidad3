package com.iesjandula.Unidad3.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table (name = "asignatura")
public class Asignatura
{
	@Id
	@Column(length = 10)
	private Long id;
	@Column(length = 10)
	private Double creditos;
	@Column(length = 10)
	private Integer cuatrimestre;
	@Column(length = 10)
	private Integer curso;
	@Column(length = 100)
	private String nombre;
	@Column(length = 45)
	private String tipo;
	@ManyToOne
	private Grado idGrado;
	@ManyToOne
	private Profesor idProfesor;
	public Asignatura()
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
	public Double getCreditos()
	{
		return creditos;
	}
	public void setCreditos(Double creditos)
	{
		this.creditos = creditos;
	}
	public Integer getCuatrimestre()
	{
		return cuatrimestre;
	}
	public void setCuatrimestre(Integer cuatrimestre)
	{
		this.cuatrimestre = cuatrimestre;
	}
	public Integer getCurso()
	{
		return curso;
	}
	public void setCurso(Integer curso)
	{
		this.curso = curso;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getTipo()
	{
		return tipo;
	}
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	public Grado getIdGrado()
	{
		return idGrado;
	}
	public void setIdGrado(Grado idGrado)
	{
		this.idGrado = idGrado;
	}
	public Profesor getIdProfesor()
	{
		return idProfesor;
	}
	public void setIdProfesor(Profesor idProfesor)
	{
		this.idProfesor = idProfesor;
	}

	@Override
	public String toString() {
		return "Asignatura{" +
				"id=" + id +
				", creditos=" + creditos +
				", cuatrimestre=" + cuatrimestre +
				", curso=" + curso +
				", nombre='" + nombre + '\'' +
				", tipo='" + tipo + '\'' +
				", idGrado=" + idGrado +
				", idProfesor=" + idProfesor +
				'}';
	}
}
