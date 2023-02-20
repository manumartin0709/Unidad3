package com.iesjandula.Unidad3.Response;

public class ProfesorResponse
{
	private int edad;
	private String ciudad;
	private String nif;
	
	public ProfesorResponse(int edad, String ciudad, String nif)
	{
		this.edad = edad;
		this.ciudad = ciudad;
		this.nif = nif;
	}

	public int getEdad()
	{
		return edad;
	}

	public void setEdad(int edad)
	{
		this.edad = edad;
	}

	public String getCiudad()
	{
		return ciudad;
	}

	public void setCiudad(String ciudad)
	{
		this.ciudad = ciudad;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}


}
