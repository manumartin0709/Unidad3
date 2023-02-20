package com.iesjandula.Unidad3.Response;

public class AsignaturaResponse
{
	private String nombre;
	private int curso;
	private int creditos;
	private int idProfesor;

	public AsignaturaResponse(String nombre, int curso, int creditos, int idProfesor) {
		this.nombre = nombre;
		this.curso = curso;
		this.creditos = creditos;
		this.idProfesor = idProfesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCurso() {
		return curso;
	}

	public void setCurso(int curso) {
		this.curso = curso;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getIdProfesor() {
		return idProfesor;
	}

	public void setIdProfesor(int idProfesor) {
		this.idProfesor = idProfesor;
	}
}
