package com.projetos.comercinho.domain.repositories;

import com.projetos.comercinho.domain.entities.Comerciante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ComercianteRepository extends JpaRepository<Comerciante, Long> {

    @Query("SELECT c FROM Comerciante c WHERE c.endereco = :endereco")
    List<Comerciante> findByEndereco(@Param("endereco") String endereco);

    List<Comerciante> findByNome(String nome);

    Page<Comerciante> findAll(Pageable pageable);

    Optional<Comerciante> findByEmailOrTelefone(String email, String telefone);

    @Query("SELECT c FROM Comerciante c WHERE c.cidade = :cidade")
    List<Comerciante> findByCidade(@Param("cidade") String cidade);

    @Query("SELECT c FROM Comerciante c WHERE c.estado = :estado")
    List<Comerciante> findByEstado(@Param("estado") String estado);
}
