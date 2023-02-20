package com.iesjandula.Unidad3.models;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table (name= "matricula")
public class Matricula
{
	@EmbeddedId
	private MatriculaId matriculaId;
	
	@ManyToOne
	@JoinColumn(name="id_alumno")
	@MapsId("idAlumno")
	private Alumno idAlumno;
	
	@ManyToOne
	@JoinColumn(name="id_asignatura")
	@MapsId("idAsignatura")
	private Asignatura idAsignatura;
	
	@ManyToOne
	@JoinColumn(name="id_curso")
	@MapsId("idCurso")
	private Curso idCurso;
	
	public Matricula()
	{
		
	}

	public MatriculaId getMatriculaId()
	{
		return matriculaId;
	}

	public void setMatriculaId(MatriculaId matriculaId)
	{
		this.matriculaId = matriculaId;
	}

	public Alumno getIdAlumno()
	{
		return idAlumno;
	}

	public void setIdAlumno(Alumno idAlumno)
	{
		this.idAlumno = idAlumno;
	}

	public Asignatura getIdAsignatura()
	{
		return idAsignatura;
	}

	public void setIdAsignatura(Asignatura idAsignatura)
	{
		this.idAsignatura = idAsignatura;
	}

	public Curso getIdCurso()
	{
		return idCurso;
	}

	public void setIdCurso(Curso idCurso)
	{
		this.idCurso = idCurso;
	}

	@Override
	public String toString() {
		return "Matricula{" +
				"matriculaId=" + matriculaId +
				", idAlumno=" + idAlumno +
				", idAsignatura=" + idAsignatura +
				", idCurso=" + idCurso +
				'}';
	}
}
