package com.iesjandula.Unidad3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesjandula.Unidad3.models.Grado;

public interface IGrado extends JpaRepository<Grado, Long>
{
	List<Grado> findByNombre(String nombre);

}
