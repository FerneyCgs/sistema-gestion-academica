package com.ejemplo.crud.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "notas")
@Data
public class Nota {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id_nota;

    @ManyToOne
    @JoinColumn(name = "id_inscripcion")
    private Inscripcion inscripcion;

    private Double nota;

    private String tipo_evaluacion;

    private LocalDate fecha_evaluacion;
}