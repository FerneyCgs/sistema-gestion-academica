package com.ejemplo.crud.repository;

import com.ejemplo.crud.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {
}