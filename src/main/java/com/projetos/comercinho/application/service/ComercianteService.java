package com.projetos.comercinho.application.service;

import com.projetos.comercinho.domain.entities.Comerciante;
import com.projetos.comercinho.domain.repositories.ComercianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

@Service
@Transactional
public class ComercianteService {

    private final ComercianteRepository comercianteRepository;

    @Autowired
    public ComercianteService(ComercianteRepository comercianteRepository) {
        this.comercianteRepository = comercianteRepository;
    }

    public Comerciante salvarComerciante(Comerciante comerciante) {
        return comercianteRepository.save(comerciante);
    }

    public Optional<Comerciante> buscarComerciante(Long id) {
        return comercianteRepository.findById(id);
    }

    public Page<Comerciante> listarComerciantes(Pageable pageable) {
        return comercianteRepository.findAll(pageable);
    }

    public void deletarComerciante(Long id) {
        comercianteRepository.deleteById(id);
    }
}
