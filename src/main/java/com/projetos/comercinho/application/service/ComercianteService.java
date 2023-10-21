package com.projetos.comercinho.application.service;

import com.projetos.comercinho.domain.entities.Comerciante;
import com.projetos.comercinho.domain.repositories.ComercianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComercianteService {

    @Autowired
    private ComercianteRepository comercianteRepository;

    public Comerciante salvarComerciante(Comerciante comerciante) {
        return comercianteRepository.save(comerciante);
    }
}
