package com.iesjandula.Unidad3.launch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.iesjandula.Unidad3.parseo.MainParseo;






@SpringBootApplication
public class Unidad3Application implements CommandLineRunner {

	@Autowired
	 MainParseo miParseo;

	@Autowired
	 Consultas consulta;
	
	public static void main(String[] args) {
		SpringApplication.run(Unidad3Application.class, args);
	}
	
	@Transactional(readOnly = false)
	public void run(String... args) throws Exception
	{
		miParseo.parsearDepartamento();
		miParseo.parsearProfesores();
		miParseo.parsearGrado();
		miParseo.parsearAsignatura();
		miParseo.parsearCurso();
		miParseo.parsearAlumno();
		miParseo.parsearMatricula();
		consulta.makeQueries();
		
		
	}
	
	
}
