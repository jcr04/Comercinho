package com.projetos.comercinho.domain.repositories;

import com.projetos.comercinho.domain.entities.Comerciante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComercianteRepository extends JpaRepository<Comerciante, Long> {
}