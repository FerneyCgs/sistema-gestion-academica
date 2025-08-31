package com.ejemplo.crud.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "alumnos")
@Data
public class Alumno {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id_alumno;

    private String nombre;

    private String apellido;

    private LocalDate fecha_nacimiento;

    private String email;
}