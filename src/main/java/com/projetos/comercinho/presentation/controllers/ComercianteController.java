package com.projetos.comercinho.presentation.controllers;

import com.projetos.comercinho.application.service.ComercianteService;
import com.projetos.comercinho.domain.entities.Comerciante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comerciantes")
public class ComercianteController {

    private final ComercianteService comercianteService;

    @Autowired
    public ComercianteController(ComercianteService comercianteService) {
        this.comercianteService = comercianteService;
    }

    @PostMapping
    public ResponseEntity<Comerciante> criarComerciante(@RequestBody Comerciante comerciante) {
        Comerciante novoComerciante = comercianteService.salvarComerciante(comerciante);
        return new ResponseEntity<>(novoComerciante, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Comerciante> buscarComerciante(@PathVariable Long id) {
        return comercianteService.buscarComerciante(id)
                .map(comerciante -> new ResponseEntity<>(comerciante, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<Page<Comerciante>> listarComerciantes(Pageable pageable) {
        Page<Comerciante> comerciantes = comercianteService.listarComerciantes(pageable);
        return new ResponseEntity<>(comerciantes, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarComerciante(@PathVariable Long id) {
        comercianteService.deletarComerciante(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
