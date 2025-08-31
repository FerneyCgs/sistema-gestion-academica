package com.ejemplo.crud.service;

import com.ejemplo.crud.model.Asignatura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public interface AsignaturaService {

    Page<Asignatura> findAll(Pageable pageable);

    Optional<Asignatura> findById(Long id);

    Asignatura create(Asignatura asignatura);

    Asignatura update(Long id, Asignatura asignatura);

    void deleteById(Long id);
}