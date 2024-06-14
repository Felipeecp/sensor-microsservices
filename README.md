# Sensor Monitoring System

## Descrição

Este projeto é um sistema de monitoramento de plantação baseado em microsserviços, desenvolvido com Spring Boot e MongoDB. O sistema é composto por três microsserviços principais: Cadastro de Sensores, Coleta de Dados dos Sensores e Leitura de Dados dos Sensores. Cada serviço é responsável por uma parte específica do sistema e se comunica via mensageria (RabbitMQ) para garantir a escalabilidade e a resiliência.

## Microsserviços

### 1. Serviço de Cadastro de Sensores

#### Funcionalidades

- **Adicionar Novos Sensores**: Permite o cadastro de novos sensores no sistema.
- **Atualizar Detalhes dos Sensores**: Permite a atualização das informações dos sensores existentes.
- **Listar Todos os Sensores**: Fornece uma lista de todos os sensores cadastrados.
- **Remover Sensores**: Permite a remoção de sensores específicos do sistema.

### 2. Serviço de Coleta de Dados dos Sensores

#### Funcionalidades

- **Recepção de Dados via Mensageria**: Recebe dados de sensores em tempo real através de RabbitMQ.
- **Validação de Dados**: Valida os dados recebidos quanto à estrutura e aos valores.
- **Armazenamento de Dados**: Persiste os dados validados no banco de dados MongoDB.
- **Monitoramento e Logs**: Mantém logs detalhados das operações de recepção, validação e armazenamento de dados.

### 3. Serviço de Leitura de Dados dos Sensores

#### Funcionalidades

- **Buscar Dados de Sensores Armazenados**: Permite a consulta dos dados dos sensores armazenados no banco de dados.
- **Fornecer Dados Agregados e Estatísticas**: Fornece estatísticas e dados agregados dos sensores.

## Tecnologias Utilizadas

- **Spring Boot**: Framework principal para desenvolvimento de microsserviços.
- **MongoDB**: Banco de dados NoSQL para armazenamento de dados.
- **RabbitMQ**: Sistema de mensageria para comunicação entre microsserviços.
- **Kotlin**: Linguagem de programação utilizada no desenvolvimento.

## Executando o Projeto

### Pré-requisitos

- **Java 11+**
- **Docker** (para facilitar o setup do MongoDB e RabbitMQ)
- **Gradle** (para build e execução do projeto)