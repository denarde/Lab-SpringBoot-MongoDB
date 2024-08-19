# Lab API Rest com Spring Boot e MongoDB

Este projeto é uma API RESTful simples desenvolvida com Java e Spring Boot, utilizando MongoDB para persistência de dados. O objetivo é demonstrar operações básicas de CRUD (Create, Read, Update, Delete) em um recurso de `Contato`.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 2.x**
- **MongoDB**
- **Docker e Docker Compose**
- **Maven**

## Endpoints

A API expõe os seguintes endpoints para manipulação de contatos:

- **Criar Contato**
  - **POST** `/api/contato`
  - Cria um novo contato no banco de dados.

- **Atualizar Contato**
  - **PUT** `/api/contato/{id}`
  - Atualiza um contato existente identificado pelo `id`.

- **Listar Contatos**
  - **GET** `/api/contato`
  - Retorna uma lista com todos os contatos cadastrados.

- **Deletar Contato**
  - **DELETE** `/api/contato/{id}`
  - Remove um contato do banco de dados identificado pelo `id`.

## Pré-requisitos

- **Java 17** instalado
- **Maven** instalado
- **Docker** instalado
- **MongoDB** rodando via Docker

## Executando o Projeto

### 1. Subindo o MongoDB com Docker

Antes de executar a aplicação, é necessário ter o MongoDB em execução. Você pode fazer isso facilmente utilizando Docker e o Docker Compose:

```bash
docker-compose up -d
