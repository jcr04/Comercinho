package com.projetos.comercinho;

import com.projetos.comercinho.application.service.ComercianteService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = ComercinhoApplication.class)
class ComercinhoApplicationTests {

	@Autowired
	private ComercianteService comercianteService;

	@Test
	void contextLoads() {
		assertThat(comercianteService).isNotNull();
	}

}
