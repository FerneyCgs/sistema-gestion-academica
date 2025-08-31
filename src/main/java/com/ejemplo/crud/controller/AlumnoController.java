package com.ejemplo.crud.controller;

import com.ejemplo.crud.model.Alumno;
import com.ejemplo.crud.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public Page<Alumno> getAll(@RequestParam int page, @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        return alumnoService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public Alumno getById(@RequestParam Long id) {
        return alumnoService.findById(id)
                .orElseThrow(() -> new RuntimeException("Alumno not found with id: " + id));
    }

    @PostMapping
    public Alumno create(@RequestBody Alumno alumno){
        return alumnoService.create(alumno);
    }

    @PutMapping("/{id}")
    public Alumno update(@PathVariable Long id, @RequestBody Alumno alumno){
        return alumnoService.update(id, alumno);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        alumnoService.deleteById(id);
    }
}