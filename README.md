# API de Helpdesk utilizando Spring Boot

Bem-vindo à documentação da API de Helpdesk desenvolvida em Spring Boot. Esta API foi criada para fornecer um sistema de suporte eficiente e escalável, aplicando boas práticas de programação orientada a objetos e utilizando as tecnologias mais demandadas da stack de desenvolvimento.

## Características Principais

- Estrutura inicial do projeto organizada para um grande potencial de desenvolvimento.
- Utilização intensiva de programação orientada a objetos (POO) em conformidade com boas práticas.
- Implementação prática de conceitos POO como polimorfismo, herança, visibilidade, entre outros.
- Utilização do framework Spring Boot para agilizar o processo de desenvolvimento.
- Integração do Spring Security para garantir a segurança da API.
- Utilização do Spring MVC para a criação de endpoints e a gestão de requisições.
- Utilização do Spring Data JPA para facilitar a interação com o banco de dados.
- Autenticação e autorização de usuários por meio de Tokens JWT.
- Utilização do banco de dados H2 para ambiente de desenvolvimento.
- Utilização do banco de dados MySQL para ambiente de produção.

## Requisitos

- Java 8 ou uma versão superior instalada.
- Ambiente de desenvolvimento configurado com as ferramentas necessárias do Spring Boot.
- Banco de dados MySQL configurado para o ambiente de produção.

## Configuração

1. Clone este repositório: `git clone https://github.com/marcelinx/helpdesk-backend.git`
2. Acesse o diretório do projeto: `cd helpdesk`
3. Configure as credenciais do banco de dados MySQL no arquivo `application-production.properties`.
4. Execute a aplicação: `./mvnw spring-boot:run`

## Dependências

Certifique-se de que as seguintes dependências estão presentes no arquivo `pom.xml`:

```xml
<dependencies>
    <!-- ... outras dependências ... -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>
    <dependency>
        <groupId>com.h2database</groupId>
        <artifactId>h2</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>com.mysql</groupId>
        <artifactId>mysql-connector-j</artifactId>
        <scope>runtime</scope>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-security</artifactId>
    </dependency>
    <dependency>
        <groupId>io.jsonwebtoken</groupId>
        <artifactId>jjwt</artifactId>
        <version>0.7.0</version>
    </dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## Endpoints

A API oferece os seguintes endpoints:

- `/api/chamado`: Manipulação de chamados de suporte.
- `/api/clientes`: Gerenciamento de clientes.
- `/api/tecnicos`:  Gerenciamento de técnicos.

Consulte a documentação interativa da API após iniciar o servidor em `http://localhost:8080/swagger-ui.html`.

## Segurança

A segurança da API é garantida através do Spring Security e autenticação baseada em tokens JWT. Certifique-se de incluir o token JWT no header `Authorization` para acessar os endpoints protegidos.

## Banco de Dados

- Ambiente de Desenvolvimento: Utiliza o banco de dados H2. Acesse `http://localhost:8080/h2-console` para gerenciar o banco de dados em memória.
- Ambiente de Produção: Utiliza o banco de dados MySQL configurado no arquivo `application-production.properties`.

## Considerações Finais

Esta API de Helpdesk foi desenvolvida com base nas melhores práticas de programação orientada a objetos e nas tecnologias mais relevantes da stack de desenvolvimento. Sinta-se à vontade para contribuir, relatar problemas ou usar este projeto como ponto de partida para seus próprios sistemas.
