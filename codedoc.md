# Documentação de Código da Comercinho API

A Comercinho API é uma aplicação desenvolvida em Spring Boot, destinada a fornecer um sistema de gerenciamento básico para comerciantes. Este documento descreve os principais códigos e rotas presentes na aplicação.

## Estrutura do Projeto

O projeto segue a estrutura padrão de projetos Maven com Spring Boot:

- `src/main/java/com/projetos/comercinho` - Contém o código fonte da aplicação.
- `src/main/resources` - Contém os arquivos de configuração da aplicação.

## Classes Principais

### ComercianteController

Esta classe é o controlador REST que expõe os endpoints relacionados aos comerciantes.

```java
@RequestMapping("/api/comerciantes")
public class ComercianteController {

    private final ComercianteService comercianteService;

    @Autowired
    public ComercianteController(ComercianteService comercianteService) {
        this.comercianteService = comercianteService;
    }

    // ... métodos de endpoint
}
```

## Endpoints
a aplicação no momento tem esses endpoints:

* - ![Screenshot_3](https://github.com/jcr04/Comercinho/assets/70778525/c91d09ea-f8f6-4222-8098-ad50ec0b3bf5)

- rotas
/api/comerciantes (POST): Criar Comerciante
* - ![Screenshot_6](https://github.com/jcr04/Comercinho/assets/70778525/fc98024d-4ff4-4477-829c-62cc7a790eab)
/api/comerciantes (GET): Listar Comerciantes
![Screenshot_7](https://github.com/jcr04/Comercinho/assets/70778525/c801c3e5-73e6-4329-a34e-da9346262a19)




