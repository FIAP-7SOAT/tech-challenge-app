### TechFood - Sistema de Autoatendimento para Restaurante FastFood

### Visão Geral

Este é um projeto do curso de Pós-graduação em Arquitetura de Software da FIAP compreende uma solução possível para um sistema de autoatendimento de restaurante do tipo fast-food, com quiosques ou terminais de autoatendimento, com o objetivo de otimizar o processo de pedidos, pagamento, preparação e entrega de comida..

Autores membros do Grupo:

- Geraldo Moratto Junior
- Pedro Cantarelli
- Vinicius Lopes

### Requisitos

Em geral os clientes e administradores usarão o sistema, que dependerá de um serviço de pagamento externo.

[Documentação](docs/requirements.md) para conhecer todos os requisitos.

### Domain-Driven Development (DDD)

A abordagem utilizada para o desenvolvimento foi a DDD, com as seguintes saídas documentadas:

- Glossário ubíquo
- Event storming
- Storytelling
- Mapa de Contexto

### Arquitetura

O sistema expõe RESTful APIs para aplicações front-end, como terminais de autoatendimento para clientes e interfaces para administradores.

Arquitetura Hexagonal (Ports and Adapters) e Clean Architecture foram adotadas no projeto.

### Funcionalidades Principais

- **Pedido Personalizado:** Os clientes podem criar pedidos personalizados, escolhendo entre uma variedade de itens, como lanches, acompanhamentos, bebidas e sobremesas.
- **Pagamento Integrado:** Integração com o Mercado Pago, permitindo que os clientes efetuem o pagamento de seus pedidos através de um QRCode.
- **Acompanhamento de Pedido:** Os clientes podem acompanhar o status de seus pedidos, desde o momento em que são recebidos até estarem prontos para retirada.
- **Gerenciamento Administrativo:** Os administradores têm acesso a um painel de controle para gerenciar clientes, produtos, categorias e pedidos em andamento.

### Principais Tecnologias Utilizadas

- **Kotlin**
- **Java 17**
- **Spring-Boot 3.2.5**
- **PostgreSQL**
- **Docker**
- **Swagger**
- **Gradle 8**

### Documentação

TODO  
[Consulte a documentação](docs/README.md) para saber mais.

### APIs Disponíveis

O TechFood expõe as seguintes APIs para integração:

- **Cadastro do Cliente:** API para cadastrar novos clientes no sistema.
- **Identificação do Cliente via CPF:** API para identificar clientes existentes utilizando o CPF.
- **Gerenciamento de Produtos:** APIs para criar, editar e remover produtos do menu, além de buscar produtos por categoria.
- **Checkout:** API para o checkout de pedidos, enviando os produtos escolhidos para a fila de preparação.
- **Acompanhamento de Pedidos:** API para listar os pedidos em andamento e o tempo de espera de cada pedido.

### Como Executar em ambiente local

Para executar o sistema, siga as instruções abaixo:

1. Certifique-se de ter o Docker e o Docker Compose instalados em seu computador.
2. Clone o repositório, no terminal executando o comando: 
`$ git clone https://github.com/FIAP-7SOAT/tech-challenge-app`
3. Entre na pasta do projeto: 
`$ cd tech-challenge-app`
4. Build o projeto rodando o comando:
```shell
./gradlew clean build
```
5. Subindo o ambiente completo com alguns dados no database:
```shell
docker-compose -f docker-compose.yml up -d
```
6. Acesse a documentação da API através do Swagger para começar a interagir com o sistema.

### Acessando Swagger

Para acessar o Swagger utilize a url [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html).

### Banco de dados
- Baixe o DBeaver ou Gerenciador de banco de dados para PostgreSQL de sua preferência:

- - Criar nova conexão
- - Host: localhost
- - Port: 5432
- - Database: techfood
- - Username: postgres
- - Password: postgres

### Postman Collection

Baixar o Postman ou o API Client de sua preferência e importar a collection:

[API Client Collection](src/main/resources/collection/fiap_techfood_postman_collection.json).
