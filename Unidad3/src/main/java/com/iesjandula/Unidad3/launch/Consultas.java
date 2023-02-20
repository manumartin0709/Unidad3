package com.iesjandula.Unidad3.launch;

import com.iesjandula.Unidad3.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iesjandula.Unidad3.Repository.IAlumno;
import com.iesjandula.Unidad3.Repository.IAsignatura;
import com.iesjandula.Unidad3.Repository.ICurso;
import com.iesjandula.Unidad3.Repository.IDepartamento;
import com.iesjandula.Unidad3.Repository.IGrado;
import com.iesjandula.Unidad3.Repository.IMatricula;
import com.iesjandula.Unidad3.Repository.IProfesor;

@Service
public class Consultas
{
	@Autowired
	private IDepartamento iDepartamentoRepository;
	@Autowired
	private IAlumno iAlumnoRepository;
	@Autowired
	private IAsignatura iAsignatura;
	@Autowired
	private ICurso iCurso;
	@Autowired
	private IGrado iGrado;
	@Autowired
	private IMatricula iMatricula;
	@Autowired
	private IProfesor iProfesor;


	public void makeQueries()
	{

		/**
		for(Alumno alumno: iAlumnoRepository.findByNombreContaining("Juan"))
		{
			System.out.println(alumno);
		}
		

		System.out.println(" ");
		for(Asignatura asignatura: iAsignatura.findByCurso(2))
		{
			System.out.println(asignatura);
		}
		System.out.println(" ");
		for(Asignatura asignatura: iAsignatura.findTop10ByOrderByCreditosAsc())
		{
			System.out.println(asignatura);
		}

		System.out.println(" ");
		for(Departamento departamento: iDepartamentoRepository.findByNombreIgnoreCase("Matematicas"))
		{
			System.out.println(departamento);
		}

		System.out.println(" ");
		for(Grado grado: iGrado.findByNombre("Grado en Ingeniería Eléctrica"))
		{
			System.out.println(grado);
		}

		System.out.println(" ");
		for(Profesor profesor: iProfesor.findByCiudad("Barcelona"))
		{
			System.out.println(profesor);
		}
		System.out.println(" ");
		for(Profesor profesor: iProfesor.findByNif("38223286T"))
		{
			System.out.println(profesor);
		}

		System.out.println(" ");
		for(Profesor profesor: iProfesor.findByCiudadOrderByCiudad("Almería"))
		{
			System.out.println(profesor);
		}

		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		for(Asignatura asignatura: iAsignatura.findByidProfesor(6))
		{
		System.out.println(asignatura);
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");

		for(Alumno alumno: iAlumnoRepository.findByNombre("Ramón"))
		{
			System.out.println(alumno);
		}
		 **/
		 iMatricula.countMatriculaByAlumnosSexo();

	}
}
	
	
	
