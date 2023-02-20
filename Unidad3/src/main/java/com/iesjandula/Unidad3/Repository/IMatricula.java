package com.iesjandula.Unidad3.Repository;

import com.iesjandula.Unidad3.models.MatriculaId;
import org.springframework.data.jpa.repository.JpaRepository;

import com.iesjandula.Unidad3.models.Matricula;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IMatricula extends JpaRepository<Matricula, Long>
{
    @Query("SELECT COUNT(idAlumno) FROM matricula m JOIN alumno a ON m.idAlumno = a.id WHERE (a.sexo= 'H')")
    Long countMatriculaByAlumnosSexo();

    @Query("SELECT COUNT(idAsignatura) FROM matricula m JOIN asignatura a ON m.idAsignatura = a.id  WHERE (a.creditos = 10)    ")
    Long countMatriculaByAsignaturaCreditos();

    @Query("SELECT COUNT(idCurso) FROM matricula m JOIN curso c ON m.idCurso = c.id  WHERE (c.anyoFin = 2017)")
    Long countMatriculaByCursoAniyo();




}
