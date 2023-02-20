package com.iesjandula.Unidad3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesjandula.Unidad3.models.Departamento;

public interface IDepartamento extends JpaRepository<Departamento, Long>
{
	List <Departamento> findByNombreIgnoreCase(String nombre);

}
