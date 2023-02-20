package com.iesjandula.Unidad3.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iesjandula.Unidad3.models.Profesor;
import org.springframework.data.jpa.repository.Query;

public interface IProfesor extends JpaRepository<Profesor, Long>
{
    List<Profesor> findByCiudad(String ciudad);
    List<Profesor> findByNif(String nif);

}
