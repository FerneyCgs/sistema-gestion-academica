package com.ejemplo.crud.controller;

import com.ejemplo.crud.model.Nota;
import com.ejemplo.crud.service.NotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notas")
public class NotaController {

    @Autowired
    private NotaService notaService;

    @GetMapping
    public Page<Nota> getAll(@RequestParam int page, @RequestParam int size) {
        Pageable pageable = PageRequest.of(page, size);
        return notaService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public Nota getById(@RequestParam Long id) {
        return notaService.findById(id)
                .orElseThrow(() -> new RuntimeException("Nota not found with id: " + id));
    }

    @PostMapping
    public Nota create(@RequestBody Nota nota){
        return notaService.create(nota);
    }

    @PutMapping("/{id}")
    public Nota update(@PathVariable Long id, @RequestBody Nota nota){
        return notaService.update(id, nota);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        notaService.deleteById(id);
    }
}
