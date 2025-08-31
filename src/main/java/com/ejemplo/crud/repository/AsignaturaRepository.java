package com.ejemplo.crud.repository;

import com.ejemplo.crud.model.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {
}