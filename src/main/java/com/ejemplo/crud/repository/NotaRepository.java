package com.ejemplo.crud.repository;

import com.ejemplo.crud.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, Long> {
}
