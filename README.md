<div align="center">

# Database Management System

### Enterprise Java CRUD Application

<img src="https://readme-typing-svg.demolab.com?font=JetBrains+Mono&weight=600&size=24&duration=3500&pause=1200&color=4F46E5&center=true&vCenter=true&width=900&lines=Enterprise+Java+Application;Software+Engineering+Project;Object-Oriented+Programming;MySQL+Database;DAO+Pattern;JDBC+Integration;Built+with+Java+%26+Software+Engineering"/>

<br>

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)

![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)

![JDBC](https://img.shields.io/badge/JDBC-Database-blue?style=for-the-badge)

![DAO](https://img.shields.io/badge/DAO-Pattern-success?style=for-the-badge)

![OOP](https://img.shields.io/badge/OOP-Object_Oriented-success?style=for-the-badge)

![UML](https://img.shields.io/badge/UML-Modeling-blueviolet?style=for-the-badge)

![Status](https://img.shields.io/badge/Status-In_Development-orange?style=for-the-badge)

![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)

</div>

---

# Índice

- Sobre o Projeto
- Objetivos
- Motivação
- Funcionalidades
- Tecnologias
- Arquitetura
- Estrutura do Projeto
- Engenharia de Software Aplicada
- Banco de Dados
- UML
- Estrutura das Classes
- Instalação
- Como Executar
- Casos de Uso
- CRUD
- Organização do Código
- Roadmap
- Melhorias Futuras
- Contribuição
- Licença
- Autor

---

# Sobre o Projeto

O **Database Management System** é uma aplicação desenvolvida em Java com integração ao banco de dados MySQL utilizando JDBC.

O projeto foi desenvolvido com o objetivo de aplicar conceitos fundamentais de Engenharia de Software, Programação Orientada a Objetos, modelagem de banco de dados e arquitetura em camadas.

Embora tenha sido desenvolvido em ambiente acadêmico, sua estrutura foi planejada para se aproximar da organização encontrada em aplicações corporativas, utilizando padrões de projeto, separação de responsabilidades e boas práticas de desenvolvimento.

Além da implementação completa das operações CRUD, o projeto demonstra conhecimentos em modelagem UML, persistência de dados, arquitetura DAO e organização modular do código.

---

# Objetivos

Este projeto possui como principais objetivos:

- Desenvolver uma aplicação Java integrada ao MySQL.
- Aplicar Programação Orientada a Objetos.
- Utilizar JDBC para comunicação com banco de dados.
- Implementar arquitetura DAO.
- Aplicar conceitos de Engenharia de Software.
- Desenvolver modelagem UML.
- Construir um banco de dados relacional.
- Implementar operações CRUD completas.
- Organizar o projeto seguindo boas práticas.
- Demonstrar conhecimentos adquiridos durante a formação em Tecnologia da Informação.

---

# Motivação

O projeto foi criado para consolidar conhecimentos em desenvolvimento backend utilizando Java.

Durante seu desenvolvimento foram aplicados conceitos relacionados a:

- Engenharia de Software
- Programação Orientada a Objetos
- Banco de Dados
- UML
- DAO Pattern
- JDBC
- Relacionamentos entre entidades
- Encapsulamento
- Herança
- Interfaces
- Classes Abstratas
- Associação
- Organização em pacotes

Esses conceitos formam a base para o desenvolvimento de aplicações corporativas.

---

# Funcionalidades

Atualmente o sistema possui:

✅ Cadastro de registros

✅ Consulta de registros

✅ Atualização de registros

✅ Exclusão de registros

✅ Conexão com banco MySQL

✅ Organização em camadas

✅ DAO Pattern

✅ JDBC

✅ Classes de Modelo

✅ Classes DAO

✅ Programação Orientada a Objetos

✅ Modelagem UML

✅ Banco de Dados Relacional

---

# Tecnologias Utilizadas

| Categoria | Tecnologia |
|------------|------------|
| Linguagem | Java |
| Banco de Dados | MySQL |
| Persistência | JDBC |
| Arquitetura | DAO Pattern |
| Paradigma | Object-Oriented Programming |
| IDE | NetBeans |
| Modelagem | UML |
| Controle de Versão | Git |
| Repositório | GitHub |

---

# Arquitetura da Aplicação

A arquitetura do projeto segue o modelo em camadas.

```

               Usuário

                  │

                  ▼

         Interface da Aplicação

                  │

                  ▼

            Regras de Negócio

                  │

                  ▼

             Classes DAO

                  │

                  ▼

                 JDBC

                  │

                  ▼

              Banco MySQL

```

Cada camada possui responsabilidades específicas, tornando o código mais organizado, reutilizável e de fácil manutenção.

---

# Estrutura do Projeto

```

database-management-system-java

│

├── src

│   ├── connection

│   ├── dao

│   ├── model

│   ├── controller

│   ├── view

│   └── Main.java

│

├── database

│

├── diagrams

│

├── docs

│

├── assets

│

└── README.md

```

Cada diretório possui uma responsabilidade específica.

Essa organização facilita futuras manutenções e ampliações do sistema.

---

# Engenharia de Software Aplicada

O projeto demonstra a aplicação de diversos conceitos estudados durante a formação.

| Conceito | Aplicado |
|-----------|----------|
| Programação Orientada a Objetos | ✅ |
| Encapsulamento | ✅ |
| Herança | ✅ |
| Polimorfismo | ✅ |
| Interfaces | ✅ |
| Classes Abstratas | ✅ |
| Associação | ✅ |
| DAO Pattern | ✅ |
| JDBC | ✅ |
| Banco Relacional | ✅ |
| UML | ✅ |
| Engenharia de Software | ✅ |
| Modularização | ✅ |
| Organização em Pacotes | ✅ |

---

# Organização em Camadas

O projeto foi estruturado utilizando separação de responsabilidades.

Cada camada possui uma função específica.

### Interface

Responsável pela interação com o usuário.

### Controller

Controla o fluxo da aplicação.

### Model

Representa as entidades do sistema.

### DAO

Realiza operações no banco de dados.

### Connection

Gerencia a conexão JDBC.

### Database

Armazena as informações persistentes.

---

# Destaques do Projeto

Este projeto demonstra conhecimentos em:

- Desenvolvimento Backend
- Banco de Dados Relacional
- Engenharia de Software
- Programação Orientada a Objetos
- Arquitetura em Camadas
- Persistência de Dados
- JDBC
- DAO Pattern
- UML
- Modelagem de Sistemas

---

# Diferenciais

Em comparação com um CRUD tradicional, este projeto também apresenta:

- Organização modular.
- Separação entre regras de negócio e persistência.
- Estrutura preparada para crescimento.
- Código reutilizável.
- Modelagem orientada a objetos.
- Banco de dados modelado previamente.
- Aplicação de conceitos de Engenharia de Software.

---

# Banco de Dados

A persistência dos dados é realizada utilizando o **MySQL**, um dos Sistemas Gerenciadores de Banco de Dados Relacionais (SGBDR) mais utilizados no mercado.

Durante o desenvolvimento do projeto foram aplicados conceitos de modelagem relacional, normalização e integridade referencial, permitindo uma estrutura organizada e preparada para futuras expansões.

O banco de dados foi modelado antes da implementação da aplicação Java, seguindo o fluxo recomendado na Engenharia de Software.

---

## Modelagem do Banco

Durante o desenvolvimento foram elaborados:

- Modelo Conceitual (MER)
- Modelo Lógico
- Modelo Relacional
- Diagrama Entidade-Relacionamento (DER)
- Scripts SQL

Esses documentos permitem compreender toda a estrutura da base de dados antes da implementação.

---

## Estrutura do Banco

```text
Database

│

├── Tabelas

├── Chaves Primárias

├── Chaves Estrangeiras

├── Relacionamentos

├── Constraints

└── Consultas SQL
```

---

## Recursos utilizados

✔ Tabelas Relacionais

✔ Chaves Primárias

✔ Chaves Estrangeiras

✔ Relacionamentos

✔ Integridade Referencial

✔ Consultas SQL

✔ Operações CRUD

---

# JDBC

O projeto utiliza **Java Database Connectivity (JDBC)** para realizar toda a comunicação entre a aplicação Java e o banco de dados MySQL.

Essa tecnologia permite:

- Abrir conexões
- Executar comandos SQL
- Recuperar registros
- Atualizar dados
- Excluir informações
- Fechar conexões corretamente

---

## Fluxo JDBC

```text
Aplicação Java

↓

Driver JDBC

↓

Connection

↓

PreparedStatement

↓

ResultSet

↓

Banco MySQL
```

---

# DAO Pattern

O projeto foi estruturado utilizando o padrão **DAO (Data Access Object)**.

Esse padrão tem como objetivo separar completamente a regra de negócio da camada de acesso ao banco de dados.

Essa organização facilita:

- manutenção;
- reutilização do código;
- testes;
- futuras alterações no banco.

---

## Fluxo do DAO

```text
Usuário

↓

Controller

↓

DAO

↓

JDBC

↓

MySQL
```

---

# Programação Orientada a Objetos

O projeto foi desenvolvido aplicando conceitos fundamentais da Programação Orientada a Objetos.

## Conceitos utilizados

| Conceito | Aplicação |
|----------|-----------|
| Classe | ✅ |
| Objeto | ✅ |
| Encapsulamento | ✅ |
| Herança | ✅ |
| Polimorfismo | ✅ |
| Associação | ✅ |
| Interface | ✅ |
| Classe Abstrata | ✅ |

---

# Organização das Classes

A aplicação foi organizada seguindo responsabilidades bem definidas.

## Connection

Responsável por:

- abrir conexão;
- fechar conexão;
- configurar JDBC.

---

## Model

Representa as entidades do sistema.

Cada classe Model possui:

- atributos;
- construtores;
- getters;
- setters;
- métodos específicos.

---

## DAO

Responsável pelas operações no banco.

Entre elas:

- INSERT
- SELECT
- UPDATE
- DELETE

---

## Controller

Coordena o fluxo entre interface, regras de negócio e persistência.

---

## Main

Classe responsável por iniciar a aplicação.

---

# UML

Durante o desenvolvimento foram produzidos diversos diagramas UML.

Entre eles:

- Diagrama de Classes
- Associações
- Generalização
- Interfaces
- Classes Abstratas

---

## Diagrama de Classes

> Em breve será adicionada uma imagem do Diagrama de Classes.

```text
assets/

└── uml-class-diagram.png
```

---

# Banco de Dados

Também serão disponibilizados:

```text
assets/

├── MER.png

├── DER.png

├── ModeloRelacional.png
```

---

# Estrutura de Pacotes

```text
src

├── connection

├── dao

├── model

├── controller

├── view

└── Main.java
```

---

# Estrutura do Código

O projeto segue uma organização modular.

Cada pacote possui responsabilidade específica.

Essa abordagem melhora:

- organização;
- manutenção;
- escalabilidade;
- reutilização.

---

# Funcionalidades CRUD

## CREATE

Permite cadastrar novos registros.

---

## READ

Permite consultar informações armazenadas.

---

## UPDATE

Permite alterar registros existentes.

---

## DELETE

Permite remover registros do banco.

---

# Recursos Implementados

| Funcionalidade | Status |
|---------------|--------|
| Conexão JDBC | ✅ |
| DAO Pattern | ✅ |
| CRUD | ✅ |
| Banco MySQL | ✅ |
| OOP | ✅ |
| UML | ✅ |
| Associação | ✅ |
| Herança | ✅ |
| Interface | ✅ |
| Classe Abstrata | ✅ |

---

# Instalação

## Pré-requisitos

- Java JDK 17 ou superior
- NetBeans IDE
- MySQL Server
- MySQL Workbench
- Git

---

## Clone o repositório

```bash
git clone https://github.com/iiaslaraa/database-management-system-java.git
```

---

## Abra o projeto

Importe o projeto utilizando o NetBeans IDE.

---

## Configure o banco

1. Abra o MySQL Workbench.

2. Execute o script SQL localizado em:

```text
database/database.sql
```

3. Configure usuário e senha na classe de conexão.

---

## Execute

Após configurar o banco de dados, execute:

```text
Main.java
```

---

# Estrutura SQL

Os scripts SQL serão organizados em:

```text
database/

├── database.sql

├── inserts.sql

├── updates.sql

└── queries.sql
```

---

# Objetivos Acadêmicos

Além da implementação técnica, o projeto teve como finalidade desenvolver competências em:

- Engenharia de Software
- Banco de Dados
- Programação Java
- Arquitetura de Sistemas
- Persistência
- Modelagem
- UML
- Organização de Código
- Desenvolvimento Backend

---

# Aprendizados

Durante o desenvolvimento foram aprofundados conhecimentos em:

- Java
- JDBC
- SQL
- MySQL
- DAO Pattern
- Engenharia de Software
- UML
- Banco de Dados
- Arquitetura em Camadas
- Programação Orientada a Objetos

---

# Demonstração

Em breve serão adicionadas capturas de tela da aplicação para demonstrar o funcionamento do sistema.

## Tela Principal

<p align="center">
<img src="./assets/home.png" width="900">
</p>

---

## Cadastro de Registros

<p align="center">
<img src="./assets/cadastro.png" width="900">
</p>

---

## Consulta de Dados

<p align="center">
<img src="./assets/consulta.png" width="900">
</p>

---

## Banco de Dados

<p align="center">
<img src="./assets/database.png" width="900">
</p>

---

# Modelagem UML

A modelagem UML foi utilizada durante o desenvolvimento para representar visualmente a estrutura do sistema antes da implementação.

Os diagramas documentam os relacionamentos entre as classes, facilitando futuras manutenções e a compreensão da arquitetura.

## Diagramas

- Diagrama de Classes
- Diagrama de Casos de Uso
- Diagrama de Atividades
- Diagrama de Sequência
- Diagrama de Pacotes

---

## Diagrama de Classes

<p align="center">

<img src="./assets/uml-class-diagram.png" width="950">

</p>

---

# Modelagem do Banco de Dados

Toda a estrutura do banco foi modelada antes do desenvolvimento da aplicação.

## Diagramas disponíveis

- Modelo Entidade Relacionamento (MER)
- Diagrama Entidade Relacionamento (DER)
- Modelo Relacional

---

## MER

<p align="center">

<img src="./assets/mer.png" width="900">

</p>

---

## DER

<p align="center">

<img src="./assets/der.png" width="900">

</p>

---

## Modelo Relacional

<p align="center">

<img src="./assets/modelo-relacional.png" width="900">

</p>

---

# Estrutura do Projeto

```text
database-management-system-java

│

├── assets/
│
├── database/
│
├── docs/
│
├── src/
│   ├── connection/
│   ├── controller/
│   ├── dao/
│   ├── model/
│   ├── view/
│   └── Main.java
│
├── LICENSE
│
├── README.md
│
└── .gitignore
```

---

# Organização dos Pacotes

## connection

Responsável por estabelecer a conexão entre a aplicação Java e o banco MySQL utilizando JDBC.

---

## dao

Implementa todas as operações de persistência de dados utilizando o padrão DAO.

---

## model

Representa as entidades da aplicação através de classes Java.

---

## controller

Centraliza o fluxo de execução e coordena a comunicação entre interface, modelos e persistência.

---

## view

Responsável pela interação com o usuário.

---

# Fluxo da Aplicação

```text
Usuário

↓

Interface

↓

Controller

↓

Model

↓

DAO

↓

JDBC

↓

MySQL

↓

Resultado
```

---

# Boas Práticas Aplicadas

Durante o desenvolvimento foram adotadas diversas boas práticas de Engenharia de Software.

- Organização em camadas
- Programação Orientada a Objetos
- Separação de responsabilidades
- Reutilização de código
- DAO Pattern
- Encapsulamento
- Modularização
- Tratamento de exceções
- Código legível
- Convenções da linguagem Java

---

# Engenharia de Software

Este projeto aplica diversos conceitos fundamentais da Engenharia de Software.

| Área | Aplicação |
|------|-----------|
| Análise | ✅ |
| Projeto | ✅ |
| Implementação | ✅ |
| Banco de Dados | ✅ |
| Modelagem UML | ✅ |
| Persistência | ✅ |
| Testes | Em evolução |
| Documentação | ✅ |

---

# Roadmap

## Versão Atual

- [x] Estrutura do projeto
- [x] Programação Orientada a Objetos
- [x] DAO Pattern
- [x] JDBC
- [x] Banco de Dados
- [x] CRUD
- [x] UML
- [x] Documentação

---

## Próximas Implementações

- [ ] Interface gráfica aprimorada
- [ ] Sistema de autenticação
- [ ] Controle de permissões
- [ ] Logs da aplicação
- [ ] Exportação de relatórios
- [ ] API REST com Spring Boot
- [ ] Docker
- [ ] Testes Unitários (JUnit)
- [ ] CI/CD com GitHub Actions

---

# Melhorias Futuras

O projeto continuará evoluindo com foco em tecnologias utilizadas no mercado.

Entre as melhorias planejadas estão:

- Migração para Spring Boot
- Implementação de API REST
- Integração com Docker
- Documentação utilizando Swagger
- Testes automatizados
- Pipeline CI/CD
- Deploy em ambiente Cloud
- Arquitetura baseada em camadas
- Aplicação de princípios SOLID
- Clean Architecture

---

# Resultados de Aprendizagem

Este projeto contribuiu para o desenvolvimento das seguintes competências:

- Desenvolvimento Backend
- Banco de Dados Relacional
- Modelagem UML
- Engenharia de Software
- Programação Java
- SQL
- JDBC
- DAO Pattern
- Versionamento com Git
- Organização de Projetos

---

# Como Contribuir

Contribuições são bem-vindas.

Caso deseje colaborar:

1. Faça um Fork do projeto.
2. Crie uma nova Branch.
3. Realize suas alterações.
4. Envie um Pull Request.

---

# Licença

Este projeto está licenciado sob a Licença MIT.

Consulte o arquivo **LICENSE** para mais informações.

---

# Autor

## Iasmim Lima Lara Cardoso

Software Engineering Student  
Data Analytics Student  
IT Technician

📍 Brasília – DF

### Contato

- GitHub: https://github.com/iiaslaraa
- LinkedIn: https://www.linkedin.com/in/iiaslaraa/
- Email: iasmimlaracardoso@gmail.com

---

<div align="center">

## ⭐ Se este projeto foi útil para você, considere deixar uma estrela!

Isso incentiva a continuidade do desenvolvimento e da documentação do projeto.

</div>

---

<div align="center">

**"Transformando conhecimento acadêmico em soluções de software organizadas, escaláveis e orientadas às boas práticas da Engenharia de Software."**

</div>
