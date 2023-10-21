package com.projetos.comercinho.presentation.controllers;

import com.projetos.comercinho.application.service.ComercianteService;
import com.projetos.comercinho.domain.entities.Comerciante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comerciantes")
public class ComercianteController {

    @Autowired
    private ComercianteService comercianteService;

    @PostMapping
    public Comerciante criarComerciante(@RequestBody Comerciante comerciante) {
        return comercianteService.salvarComerciante(comerciante);
    }
}
