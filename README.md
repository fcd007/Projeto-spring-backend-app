# Projeto Aplicativo full-stack com Spring Boot, Hibernate, Microsoft SQL

## Descrição do projeto

Projeto Java + ReactJS web full-stack que é um aplicativo básico de gerenciamento de funcionários com recursos CRUD:

- Listar | GET | `funcionarios/api/v1/funcionarios` | Status Code (200 (OK)) | Busca todos os funcionários
- Criar | POST | `funcionarios/api/v1/funcionarios/criar` | Status Code (201 (OK)) | criar um novo funcionário
- Buscar | GET | `funcionarios/api/v1/funcionarios/{id}` | Status Code (200 (OK)) | Buscar funcionário
- Editar | PUT | `funcionarios/api/v1/funcionarios/{id}` | Status Code (200 (OK)) | Atualizar funcionário
- Excluir | DELETE | `funcionarios/api/v1/funcionarios/{id}` | Status Code (204 (No Content)) | Deletar funcionário

## Antes de iniciar

Verifique o ambiente com os seguintes parâmetros:

- Instalação Java 8+;
- yarn ou npm - NodeJS 14+;
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

## Ferramentas e tecnologias do lado do cliente usadas

- React
- Modern JavaScript (ES6)
- NodeJS and Yarn
- VS Code IDE
- Create React App CLI
- Bootstrap 4.5 and Axios HTTP Library

Bora ao projeto, entra na pasta frontend e execute:

### `yarn start`

Runs the app in the development mode.\
Open [http://localhost:3000](http://localhost:3000) to view it in the browser.

The page will reload if you make edits.\
You will also see any lint errors in the console.

### `yarn build`

### Deployment

This section has moved here: [https://facebook.github.io/create-react-app/docs/deployment](https://facebook.github.io/create-react-app/docs/deployment)

### `yarn build` fails to minify

This section has moved here: [https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify](https://facebook.github.io/create-react-app/docs/troubleshooting#npm-run-build-fails-to-minify)
