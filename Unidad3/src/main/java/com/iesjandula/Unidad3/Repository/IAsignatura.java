package com.iesjandula.Unidad3.Repository;

import java.lang.foreign.Addressable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesjandula.Unidad3.models.Asignatura;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IAsignatura extends JpaRepository<Asignatura, Long>
{
    @Query("SELECT new com.iesjandula.Response.AsignaturaResponse(a.nombre) FROM asignatura a JOIN profesor a.id_profesor_id WHERE (a.id_profesor_id = :id)")
    List<Asignatura> findByidProfesor(@Param("idProfesor") int id);
	List <Asignatura> findByCurso(int curso);
    List<Asignatura> findTop10ByOrderByCreditosAsc();



}
