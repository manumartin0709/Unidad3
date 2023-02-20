package com.iesjandula.Unidad3.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "alumno")
public class Alumno
{
	@Id
	@Column(length = 10)
	private Long id;
	
	@Column(length = 100)
	private String apellido1;
	@Column(length = 100)
	private String apellido2;
	@Column(length = 45)
	private String ciudad;
	@Column(length = 45)
	private String direccion;
	@Column(length = 45)
	private Date fechaNacimiento;
	@Column(length = 45)
	private String nif;
	@Column(length = 45)
	private String nombre;
	@Column(length = 45)
	private String sexo;
	@Column(length = 45)
	private String telefono;
	
	public Alumno()
	{
		
	}
	
	
	public Long getId()
	{
		return id;
	}
	public void setId(int i)
	{
		this.id = (long) i;
	}
	public String getApellido1()
	{
		return apellido1;
	}
	public void setApellido1(String apellido1)
	{
		this.apellido1 = apellido1;
	}
	public String getApellido2()
	{
		return apellido2;
	}
	public void setApellido2(String apellido2)
	{
		this.apellido2 = apellido2;
	}
	public String getCiudad()
	{
		return ciudad;
	}
	public void setCiudad(String ciudad)
	{
		this.ciudad = ciudad;
	}
	public String getDireccion()
	{
		return direccion;
	}
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
	public Date getFechaNacimiento()
	{
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento)
	{
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNif()
	{
		return nif;
	}
	public void setNif(String nif)
	{
		this.nif = nif;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getSexo()
	{
		return sexo;
	}
	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	public String getTelefono()
	{
		return telefono;
	}
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Alumno{" +
				"id=" + id +
				", apellido1='" + apellido1 + '\'' +
				", apellido2='" + apellido2 + '\'' +
				", ciudad='" + ciudad + '\'' +
				", direccion='" + direccion + '\'' +
				", fechaNacimiento=" + fechaNacimiento +
				", nif='" + nif + '\'' +
				", nombre='" + nombre + '\'' +
				", sexo='" + sexo + '\'' +
				", telefono='" + telefono + '\'' +
				'}';
	}
}
