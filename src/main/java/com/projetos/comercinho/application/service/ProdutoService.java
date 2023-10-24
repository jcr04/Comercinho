package com.projetos.comercinho.application.service;

import com.projetos.comercinho.domain.entities.Comerciante;
import com.projetos.comercinho.domain.entities.Produto;
import com.projetos.comercinho.domain.repositories.ComercianteRepository;
import com.projetos.comercinho.domain.repositories.ProdutoRepository;
import com.projetos.comercinho.infrastructure.Exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    private ComercianteRepository comercianteRepository;

    public Produto associarProdutoComerciante(Long comercianteId, Produto produto) {
        Comerciante comerciante = comercianteRepository.findById(comercianteId)
                .orElseThrow(() -> new ResourceNotFoundException("Comerciante não encontrado"));
        produto.setComerciante(comerciante);
        return produtoRepository.save(produto);
    }

    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public Optional<Produto> buscarProduto(Long id) {
        return produtoRepository.findById(id);
    }

    public List<Produto> listarProdutos() {
        return produtoRepository.findAll();
    }

    public List<Produto> buscarProdutosPorComercianteId(Long comercianteId) {
        return produtoRepository.findByComercianteId(comercianteId);
    }

    public void deletarProduto(Long id) {
        produtoRepository.deleteById(id);
    }
}
