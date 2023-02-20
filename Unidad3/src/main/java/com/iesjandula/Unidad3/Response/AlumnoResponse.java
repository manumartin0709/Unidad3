package com.iesjandula.Unidad3.Response;

import org.springframework.stereotype.Service;

@Service
public class AlumnoResponse
{
	private Long id;
	private String nombre;
	private int edad;
	private int edad2;
	private String sexo;

	public AlumnoResponse(Long id, String nombre, int edad, int edad2, String sexo) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.edad2 = edad2;
		this.sexo = sexo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getEdad2() {
		return edad2;
	}

	public void setEdad2(int edad2) {
		this.edad2 = edad2;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
