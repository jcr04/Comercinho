package com.projetos.comercinho.application.service;

import com.projetos.comercinho.domain.entities.Comerciante;
import com.projetos.comercinho.domain.entities.Produto;
import com.projetos.comercinho.domain.repositories.ComercianteRepository;
import com.projetos.comercinho.domain.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.StringWriter;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportService {

    @Autowired
    private ComercianteRepository comercianteRepository;
    @Autowired
    private ProdutoRepository produtoRepository;

    public String generateComerciantesCsvReport() {
        List<Comerciante> comerciantes = comercianteRepository.findAll();
        StringWriter csvWriter = new StringWriter();

        // Cabeçalhos do CSV para Comerciantes
        csvWriter.append("ID, Nome, Endereço, Cidade, Estado, Telefone, Email\n");

        comerciantes.forEach(comerciante -> csvWriter.append(comerciante.getId().toString())
                .append(", ")
                .append(comerciante.getNome())
                .append(", ")
                .append(comerciante.getEndereco())
                .append(", ")
                .append(comerciante.getCidade())
                .append(", ")
                .append(comerciante.getEstado())
                .append(", ")
                .append(comerciante.getTelefone())
                .append(", ")
                .append(comerciante.getEmail())
                .append("\n"));
        return csvWriter.toString();
    }

    public String generateProdutosCsvReport() {
        List<Produto> produtos = produtoRepository.findAll();
        StringWriter csvWriter = new StringWriter();

        // Cabeçalhos do CSV para Produtos
        csvWriter.append("ID, Nome, Descrição, Preço, Quantidade em Estoque, Comerciante ID\n");

        produtos.forEach(produto -> csvWriter.append(produto.getId().toString())
                .append(", ")
                .append(produto.getNome())
                .append(", ")
                .append(produto.getDescricao())
                .append(", ")
                .append(produto.getPreco().toString())
                .append(", ")
                .append(Integer.toString(produto.getQuantidadeEmEstoque()))
                .append(", ")
                .append(produto.getComerciante() != null ? produto.getComerciante().getId().toString() : "Sem Comerciante")
                .append("\n"));
        return csvWriter.toString();
    }
}
