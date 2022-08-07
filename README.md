# Projeto Aplicativo full-stack com Spring Boot, Hibernate, Microsoft SQL

## Descrição do projeto

Projeto Java + ReactJS web full-stack que é um aplicativo básico de gerenciamento de funcionários com recursos CRUD:

- Listar | GET | `localhost:8080/api/v1/funcionarios` | Status Code (200 (OK)) | Busca todos os funcionários
- Criar | POST | `localhost:8080/api/v1/funcionarios/criar` | Status Code (201 (OK)) | criar um novo funcionário
- Buscar | GET | `localhost:8080/api/v1/funcionarios/{id}` | Status Code (200 (OK)) | Buscar funcionário
- Editar | PUT | `localhost:8080/api/v1/funcionarios/{id}` | Status Code (200 (OK)) | Atualizar funcionário
- Excluir | DELETE | `localhost:8080/api/v1/funcionarios/{id}` | Status Code (204 (No Content)) | Deletar funcionário

## Antes de iniciar

Verifique o ambiente com os seguintes parâmetros:

- Instalação Java 8+;
- Eclipse IDE ou Spring Tool Suite [STS];
- Verifique o projeto backend - script de criação do banco de dados;
- MS SQL Server 2016+;
- Conexão API Rest;

## Ferramentas e tecnologias do lado do servidor usadas

- Spring Boot 2 +
- SpringData JPA (Hibernate)
- Maven 3.2 +
- JDK 1.8
- Tomcat 9+ / JBoss Wildfly
- Banco de dados MS SQL Server

Bora ao projeto, entra na pasta frontend e execute:

Clone o projeto em um local com permissões, abra-o no eclipse e aguarde 
as dependências serem baixadas, qualquer dúvida só enviar mensagem.
