package com.iesjandula.Unidad3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesjandula.Unidad3.models.Alumno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import static javax.swing.text.html.HTML.Tag.SELECT;
import static org.hibernate.FetchMode.JOIN;
import static org.hibernate.sql.ast.Clause.FROM;
import static org.hibernate.sql.ast.Clause.WHERE;

public interface IAlumno extends JpaRepository<Alumno, Long>
{

	@Query("SELECT new es.com.iesjandula.Unidad3.models.Matricula COUNT(id) FROM matricula m JOIN alumno a WHERE m.id_alumno=a.id AND (a.sexo= 'H')")
	List<Alumno> findByNombre(@Param("nombre")String nombre);
}


