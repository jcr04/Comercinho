# Comercinho API

## Descrição
A Comercinho API é uma aplicação Spring Boot que proporciona um sistema de gerenciamento básico para comerciantes. A aplicação expõe endpoints RESTful que permitem criar, buscar, listar e deletar registros de comerciantes.

## Pré-requisitos
- JDK 8 ou superior
- Maven
- PostgreSQL

## Configuração do Banco de Dados
1. Instale o PostgreSQL e crie um banco de dados chamado `comercinho`.
```sql
CREATE DATABASE comercinho;
```

2. Abra o arquivo src/main/resources/application.properties e atualize as seguintes propriedades com suas credenciais do banco de dados:
```batch
  spring.datasource.url=jdbc:postgresql://localhost:5432/comercinho
  spring.datasource.username=postgres
  spring.datasource.password=12345
  spring.jpa.hibernate.ddl-auto=update
  ```
3. Executando a Aplicação
  1. Navegue até o diretório raiz do projeto via linha de comando.
  2. Execute o seguinte comando para construir e iniciar a aplicação:
```BATCH
mvn spring-boot:run
```
A aplicação será iniciada na porta 8081.
