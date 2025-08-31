package com.ejemplo.crud.service;

import com.ejemplo.crud.model.Alumno;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface AlumnoService {

    Page<Alumno> findAll(Pageable pageable);

    Optional<Alumno> findById(Long id);

    Alumno create(Alumno alumno);

    Alumno update(Long id, Alumno alumno);

    void deleteById(Long id);
}