package com.iesjandula.Unidad3.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesjandula.Unidad3.models.Matricula;


public interface IMatriculaId extends JpaRepository<Matricula, Long>
{

}
