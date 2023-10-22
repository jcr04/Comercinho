package com.projetos.comercinho.domain.repositories;

import com.projetos.comercinho.domain.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findByNomeContainingIgnoreCase(String nome);

    List<Produto> findByDescricaoContainingIgnoreCase(String descricao);

    List<Produto> findByPrecoBetween(Double precoMinimo, Double precoMaximo);

    @Query("SELECT p FROM Produto p WHERE p.quantidadeEmEstoque > :quantidadeMinima")
    List<Produto> encontrarProdutosComEstoqueAcima(@Param("quantidadeMinima") Integer quantidadeMinima);

}
