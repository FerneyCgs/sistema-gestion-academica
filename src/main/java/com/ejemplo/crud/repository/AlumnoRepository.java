package com.ejemplo.crud.repository;

import com.ejemplo.crud.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}