package com.projetos.comercinho.application.service;

import com.projetos.comercinho.domain.entities.Comerciante;
import com.projetos.comercinho.domain.repositories.ComercianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ComercianteService {

    private final ComercianteRepository comercianteRepository;

    @Autowired
    public ComercianteService(ComercianteRepository comercianteRepository) {
        this.comercianteRepository = comercianteRepository;
    }

    public Comerciante salvarComerciante(Comerciante comerciante) throws DataIntegrityViolationException, IllegalArgumentException {
        if (comerciante.getCidade() == null || comerciante.getCidade().isEmpty() ||
                comerciante.getEstado() == null || comerciante.getEstado().isEmpty()) {
            throw new IllegalArgumentException("A cidade e o estado são obrigatórios");
        }

        Optional<Comerciante> existente = buscarComerciantePorNomeEmailOuTelefone(comerciante.getNome(), comerciante.getEmail(), comerciante.getTelefone());
        if (existente.isPresent() && (comerciante.getId() == null || !existente.get().getId().equals(comerciante.getId()))) {
            throw new DataIntegrityViolationException("Comerciante com dados inválidos, coloque dados diferentes");
        }

        return comercianteRepository.save(comerciante);
    }


    public Optional<Comerciante> buscarComerciante(Long id) {
        return comercianteRepository.findById(id);
    }

    public Optional<Comerciante> buscarComerciantePorEmailOuTelefone(String email, String telefone) {
        return comercianteRepository.findByEmailOrTelefone(email, telefone);
    }

    public List<Comerciante> listarComerciantes() {
        return comercianteRepository.findAll();
    }


    public void deletarComerciante(Long id) {
        comercianteRepository.deleteById(id);
    }

    public List<Comerciante> buscarComerciantesPorCidade(String cidade) {
        return comercianteRepository.findByCidade(cidade);
    }

    public List<Comerciante> buscarComerciantesPorEstado(String estado) {
        return comercianteRepository.findByEstado(estado);
    }

    public Optional<Comerciante> buscarComercianteComProdutos(Long id) {
        return comercianteRepository.findById(id);
    }

    public Optional<Comerciante> buscarComerciantePorNomeEmailOuTelefone(String nome, String email, String telefone) {
        return comercianteRepository.findByNomeOrEmailOrTelefone(nome, email, telefone);
    }

}
