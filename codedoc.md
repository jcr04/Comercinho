# Documentação de Código da Comercinho API

A Comercinho API é uma aplicação desenvolvida em Spring Boot, destinada a fornecer um sistema de gerenciamento básico para comerciantes e seus produtos. Este documento descreve os principais códigos e rotas presentes na aplicação.

## Estrutura do Projeto

O projeto segue a estrutura padrão de projetos Maven com Spring Boot:

- `src/main/java/com/projetos/comercinho` - Contém o código fonte da aplicação.
- `src/main/resources` - Contém os arquivos de configuração da aplicação.

## Classes Principais

### ComercianteController

Esta classe é o controlador REST que expõe os endpoints relacionados aos comerciantes.

```java
@RestController
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
### ProdutoController
Esta classe é o controlador REST que expõe os endpoints relacionados aos produtos.

```java
@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    // ... métodos de endpoint
}
```
## Endpoints
a aplicação no momento tem esses endpoints:

* - ![Screenshot_4](https://github.com/jcr04/Comercinho/assets/70778525/1a541142-5109-4a4e-b521-33b78f38e722)
### rotas

#### Comerciantes
- /api/comerciantes (POST): Criar Comerciante
* - ![Screenshot_2](https://github.com/jcr04/Comercinho/assets/70778525/adbc61d5-fbe2-4f5f-bf12-9c7d033c7270)
- /api/comerciantes (GET): Listar Comerciantes
* - ![Screenshot_7](https://github.com/jcr04/Comercinho/assets/70778525/c801c3e5-73e6-4329-a34e-da9346262a19)
- /api/comerciantes/{ID} (GET): Buscar Comerciante por ID
* - ![Screenshot_1](https://github.com/jcr04/Comercinho/assets/70778525/cf8ecbab-6088-45b8-93d1-5094faa1b345)
- /api/comerciantes/{ID} (PUT) Atualizar Comerciante
* - ![Screenshot_5](https://github.com/jcr04/Comercinho/assets/70778525/18d05164-78e1-4d74-8589-defb5c6f6eac)
- /api/comerciantes/cidade/São%20José%20de%20Ribamar (GET): Buscar Comerciantes por Cidade
* - ![Screenshot_3](https://github.com/jcr04/Comercinho/assets/70778525/1385e27b-7272-4f94-90c5-9f35db32438e)
- /api/comerciantes/estado/MA (GET): Buscar Comerciantes por Estado
* - ![Screenshot_4](https://github.com/jcr04/Comercinho/assets/70778525/6eee1574-5a0c-4268-8df3-33782e91330b)

#### Produtos
- /api/produtos (POST): Criar Produto
* - ![Screenshot_1](https://github.com/jcr04/Comercinho/assets/70778525/1b89b0c1-9f15-4cc1-b69c-208c10119bfe)
- /api/produtos/{id} (GET): Buscar Produtos
* - ![Screenshot_2](https://github.com/jcr04/Comercinho/assets/70778525/bffb5b93-ce52-47b5-9644-b85ab3d0c479)
- /api/produtos (GET): Listar Produtos
* - ![Screenshot_3](https://github.com/jcr04/Comercinho/assets/70778525/b216582d-6e14-477a-9ccd-61c84f01bb96)

aplicação rodar nesse LocalHost: 8081



