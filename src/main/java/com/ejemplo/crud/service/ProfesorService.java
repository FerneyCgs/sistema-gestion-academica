package com.ejemplo.crud.service;

import com.ejemplo.crud.model.Profesor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.Optional;

public interface ProfesorService {

    Page<Profesor> findAll(Pageable pageable);

    Optional<Profesor> findById(Integer id);

    Profesor create(Profesor profesor);

    Profesor update(Integer id, Profesor profesor);

    void deleteById(Integer id);
}