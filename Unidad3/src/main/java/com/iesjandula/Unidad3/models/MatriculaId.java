package com.iesjandula.Unidad3.models;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Embeddable;
@Embeddable
public class MatriculaId 
{
	private Long idAlumno;
	private Long idAsignatura;
	private Long idCurso;
	
	public MatriculaId()
	{
		
	}

	public Long getIdAlumno()
	{
		return idAlumno;
	}

	public void setIdAlumno(Long idAlumno)
	{
		this.idAlumno = idAlumno;
	}

	public Long getIdAsignatura()
	{
		return idAsignatura;
	}

	public void setIdAsignatura(Long idAsignatura)
	{
		this.idAsignatura = idAsignatura;
	}

	public Long getIdCurso()
	{
		return idCurso;
	}

	public void setIdCurso(Long idCurso)
	{
		this.idCurso = idCurso;
	}

	@Override
	public String toString() {
		return "MatriculaId{" +
				"idAlumno=" + idAlumno +
				", idAsignatura=" + idAsignatura +
				", idCurso=" + idCurso +
				'}';
	}
}
