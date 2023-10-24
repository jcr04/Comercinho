package com.projetos.comercinho.application.service;

import com.projetos.comercinho.domain.entities.Comerciante;
import com.projetos.comercinho.domain.repositories.ComercianteRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.dao.DataIntegrityViolationException;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ComercianteServiceTest {

    @Mock
    private ComercianteRepository comercianteRepository;

    @InjectMocks
    private ComercianteService comercianteService;

    @Test
    void salvarComerciante_DadosValidos_Sucesso() {
        // Arrange
        Comerciante comerciante = new Comerciante();
        comerciante.setNome("João");
        comerciante.setEmail("joao@example.com");
        comerciante.setTelefone("123456789");
        comerciante.setCidade("São Paulo");
        comerciante.setEstado("SP");

        when(comercianteRepository.findByNomeOrEmailOrTelefone(anyString(), anyString(), anyString()))
                .thenReturn(Optional.empty());
        when(comercianteRepository.save(any(Comerciante.class))).thenReturn(comerciante);

        // Act
        Comerciante savedComerciante = comercianteService.salvarComerciante(comerciante);

        // Assert
        assertNotNull(savedComerciante);
        assertEquals("João", savedComerciante.getNome());
    }

    @Test
    void salvarComerciante_DadosDuplicados_Excecao() {
        // Arrange
        Comerciante comerciante = new Comerciante();
        comerciante.setNome("João");
        comerciante.setEmail("joao@example.com");
        comerciante.setTelefone("123456789");
        comerciante.setCidade("São Paulo");
        comerciante.setEstado("SP");

        when(comercianteRepository.findByNomeOrEmailOrTelefone(anyString(), anyString(), anyString()))
                .thenReturn(Optional.of(comerciante));

        // Act & Assert
        DataIntegrityViolationException exception = assertThrows(
                DataIntegrityViolationException.class,
                () -> comercianteService.salvarComerciante(comerciante)
        );

        assertEquals("Comerciante com dados inválidos, coloque dados diferentes", exception.getMessage());
    }

}
