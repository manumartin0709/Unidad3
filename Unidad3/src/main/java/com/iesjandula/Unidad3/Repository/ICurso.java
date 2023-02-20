package com.iesjandula.Unidad3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesjandula.Unidad3.models.Curso;

import java.util.List;

public interface ICurso extends JpaRepository<Curso, Long>
{

    List<Curso> findByAnyoFinBetween(int anyoFin, int anioInicio);
}
