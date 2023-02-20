package com.iesjandula.Unidad3.parseo;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iesjandula.Unidad3.Repository.IAlumno;
import com.iesjandula.Unidad3.Repository.IAsignatura;
import com.iesjandula.Unidad3.Repository.ICurso;
import com.iesjandula.Unidad3.Repository.IDepartamento;
import com.iesjandula.Unidad3.Repository.IGrado;
import com.iesjandula.Unidad3.Repository.IMatricula;
import com.iesjandula.Unidad3.Repository.IProfesor;
import com.iesjandula.Unidad3.models.Alumno;
import com.iesjandula.Unidad3.models.Asignatura;
import com.iesjandula.Unidad3.models.Curso;
import com.iesjandula.Unidad3.models.Departamento;
import com.iesjandula.Unidad3.models.Grado;
import com.iesjandula.Unidad3.models.Matricula;
import com.iesjandula.Unidad3.models.MatriculaId;
import com.iesjandula.Unidad3.models.Profesor;

@Service
public class MainParseo
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

	public void parsearAlumno() throws FileNotFoundException
	{
		ArrayList<Alumno> alumnos = new ArrayList<>();
		Scanner scanner = new Scanner(new File("src/main/resources/alumno.csv"));
		// PARSEAMOS LA FECHA CON UN FORMATO ESPECIFICO
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		scanner.nextLine();
		while (scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			StringTokenizer tokenizer = new StringTokenizer(line, ",");
			Alumno alumno = new Alumno();
			alumno.setId(Integer.parseInt(tokenizer.nextToken()));
			alumno.setNif(tokenizer.nextToken());
			alumno.setNombre(tokenizer.nextToken());
			alumno.setApellido1(tokenizer.nextToken());
			alumno.setApellido2(tokenizer.nextToken());
			alumno.setCiudad(tokenizer.nextToken());
			alumno.setDireccion(tokenizer.nextToken());
			alumno.setTelefono(tokenizer.nextToken());
			
			try
			{
				Date fecha_nacimiento = format.parse(tokenizer.nextToken());
				alumno.setFechaNacimiento(fecha_nacimiento);

			}
			catch (ParseException e)
			{

			}
			if (tokenizer.hasMoreTokens())
			{
				alumno.setSexo(tokenizer.nextToken());
			}

			alumnos.add(alumno);
			this.iAlumnoRepository.saveAndFlush(alumno);
		}
		scanner.close();
		for (int i = 0; i < alumnos.size(); i++)
		{
			System.out.println(alumnos.get(i).getSexo());
		}
	}

	public void parsearAsignatura() throws FileNotFoundException
	{
		ArrayList<Asignatura> asignaturas = new ArrayList<>();
		Scanner scanner = new Scanner(new File("src/main/resources/asignatura.csv"));
		// PARSEAMOS LA FECHA CON UN FORMATO ESPECIFICO
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		scanner.nextLine();
		while (scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			StringTokenizer tokenizer = new StringTokenizer(line, ",");
			Asignatura asignatura = new Asignatura();
			asignatura.setId(Integer.parseInt(tokenizer.nextToken()));
			asignatura.setNombre(tokenizer.nextToken());
			asignatura.setCreditos(Double.parseDouble(tokenizer.nextToken()));
			asignatura.setTipo(tokenizer.nextToken());
			asignatura.setCurso(Integer.parseInt(tokenizer.nextToken()));
			asignatura.setCuatrimestre(Integer.parseInt(tokenizer.nextToken()));
			asignatura.setIdProfesor(this.iProfesor.findById(Long.valueOf(tokenizer.nextToken())).get());
			asignatura.setIdGrado(this.iGrado.findById(Long.valueOf(tokenizer.nextToken())).get());
			asignaturas.add(asignatura);
			this.iAsignatura.saveAndFlush(asignatura);
		}
		scanner.close();
		for (int i = 0; i < asignaturas.size(); i++)
		{
			System.out.println(asignaturas.get(i).getNombre());
		}
	}

	public void parsearCurso() throws FileNotFoundException
	{
		ArrayList<Curso> cursos = new ArrayList<>();
		Scanner scanner = new Scanner(new File("src/main/resources/curso.csv"));
		scanner.nextLine();
		while (scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			StringTokenizer tokenizer = new StringTokenizer(line, ",");
			Curso curso = new Curso();

			curso.setId(Integer.parseInt(tokenizer.nextToken()));
			curso.setAnyoInicio(Integer.parseInt(tokenizer.nextToken()));
			curso.setAnyoFin(Integer.parseInt(tokenizer.nextToken()));
			cursos.add(curso);
			this.iCurso.saveAndFlush(curso);
		}
		scanner.close();
		for (int i = 0; i < cursos.size(); i++)
		{
			System.out.println(cursos.get(i).getAnyoFin());
		}
	}

	public void parsearDepartamento() throws FileNotFoundException
	{
		ArrayList<Departamento> departamentos = new ArrayList<>();
		Scanner scanner = new Scanner(new File("src/main/resources/departamento.csv"));

		scanner.nextLine();

		while (scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			StringTokenizer tokenizer = new StringTokenizer(line, ",");
			Departamento departamento = new Departamento();

			departamento.setId(Integer.parseInt(tokenizer.nextToken()));
			departamento.setNombre(tokenizer.nextToken());
			departamentos.add(departamento);
			this.iDepartamentoRepository.saveAndFlush(departamento);
		}
		scanner.close();
		for (int i = 0; i < departamentos.size(); i++)
		{
			System.out.println(departamentos.get(i).getNombre());
		}
	}

	public void parsearGrado() throws FileNotFoundException
	{
		ArrayList<Grado> grados = new ArrayList<>();
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(new File("src/main/resources/grado.csv"));

			scanner.nextLine();

			while (scanner.hasNextLine())
			{
				String line = scanner.nextLine();
				String[] fichero = line.split(",");
				Grado grado = new Grado();

				grado.setId(Long.valueOf(fichero[0]));
				grado.setNombre(fichero[1]);
				grados.add(grado);
				this.iGrado.saveAndFlush(grado);
			}
		}
		catch(Exception excepcion)
		{
			excepcion.printStackTrace();
		}finally {
			if(scanner != null) {
				scanner.close();
			}
		}
		
		
		

		
	}

	public void parsearMatricula() throws FileNotFoundException
	{
		ArrayList<Matricula> matriculas = new ArrayList<>();
		Scanner scanner = new Scanner(new File("src/main/resources/matricula.csv"));

		scanner.nextLine();

		while (scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			StringTokenizer tokenizer = new StringTokenizer(line, ",");
			Matricula matricula = new Matricula();

			matricula.setIdAlumno(this.iAlumnoRepository.findById(Long.valueOf(tokenizer.nextToken())).get());

			matricula.setIdAsignatura(this.iAsignatura.findById(Long.valueOf(tokenizer.nextToken())).get());

			matricula.setIdCurso(this.iCurso.findById(Long.valueOf(tokenizer.nextToken())).get());
			
			MatriculaId matriculaId = new MatriculaId();
			matriculaId.setIdAlumno(matricula.getIdAlumno().getId());
			matriculaId.setIdAsignatura(matricula.getIdAsignatura().getId());
			matriculaId.setIdCurso(matricula.getIdCurso().getId());

			matricula.setMatriculaId(matriculaId);
			matriculas.add(matricula);
			this.iMatricula.saveAndFlush(matricula);
		}
		scanner.close();
	}

	public void parsearProfesores() throws FileNotFoundException
	{
		ArrayList<Profesor> profesores = new ArrayList<>();
		Scanner scanner = new Scanner(new File("src/main/resources/profesor.csv"));
		// PARSEAMOS LA FECHA CON UN FORMATO ESPECIFICO
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		scanner.nextLine();
		while (scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			// CON UN ARRAY DE STRING EN VEZ DE STRINGTOKENIZER PARA QUE NO DE ERROR DESPUES
			// DE PARSEAR LA FECHA
			String[] tokens = line.split(",");
			Profesor profesor = new Profesor();
			profesor.setId(Long.parseLong(tokens[0]));
			profesor.setNif(tokens[1]);
			profesor.setNombre(tokens[2]);
			profesor.setApellido1(tokens[3]);
			profesor.setApellido2(tokens[4]);
			profesor.setCiudad(tokens[5]);
			profesor.setDireccion(tokens[6]);
			profesor.setTelefono(tokens[7]);
			try
			{
				Date fechaNacimiento = format.parse(tokens[8]);
				profesor.setFechaNacimiento(fechaNacimiento);
			}
			catch (ParseException e)
			{
				e.printStackTrace();
			}
			profesor.setSexo(tokens[9]);
			profesor.setIdDepartamento(this.iDepartamentoRepository.findById(Long.valueOf(tokens[10])).get());
			profesores.add(profesor);
			this.iProfesor.saveAndFlush(profesor);
		}
		scanner.close();

					
	}


}
