# TaskManager API

O TaskManager é um projeto desenvolvido no curso de Java da Rocketseat, com o objetivo de criar uma API utilizando Java, Spring Boot 3, Lombok, Java JPA, banco de dados H2 e Bcrypt para criptografia de senhas. A API funciona como um gerenciador de tarefas (Task Manager), permitindo a realização completa de operações CRUD em tarefas atribuídas aos usuários que as criaram.

## Tecnologias Utilizadas

- **Java Framework:** [Spring Boot 3](https://spring.io/projects/spring-boot)
- **Biblioteca de Melhoria de Código:** [Lombok](https://projectlombok.org/)
- **Persistência de Dados:** [Java JPA](https://docs.oracle.com/javaee/7/api/javax/persistence/package-summary.html)
- **Banco de Dados:** [H2](https://www.h2database.com/)
- **Criptografia de Senhas:** [Bcrypt](https://www.mindrot.org/projects/jBCrypt/)
- **Autenticação para Testes:** Basic Authentication

## Deploy

A API está disponível para testes no seguinte link: [TaskManager API](https://dashboard.render.com/web/srv-ckle3f8u1l6c73c48l3g)

## Funcionalidades e Endpoints

- **Criar Usuário:** `https://taskmanager-j63s.onrender.com/api/v1/users/create`
  - Exemplo JSON:
    ```json
    {
      "username": "leonardopramos",
      "name": "Leonardo Preczevski Ramos",
      "password": "1909"
    }
    ```

- **Criar Tarefa:** `https://taskmanager-j63s.onrender.com/api/v1/task/create`
  - Exemplo JSON:
    ```json
    {
      "title": "Study Java and Spring Boot",
      "desc": "Create an API to a Task Manager using Java and Spring Boot",
      "startAt": "2023-11-13T10:43:50.120961",
      "endAt": "2023-11-13T11:43:50.120961",
      "priority": 10
    }
    ```

- **Listar Todas as Tarefas por Usuário:** `https://taskmanager-j63s.onrender.com/api/v1/task/create`

- **Atualizar Tarefa:** `https://taskmanager-j63s.onrender.com/api/v1/task/update/{id}`
  - Exemplo JSON:
    ```json
    {
      "priority": 12
    }
    ```

Essas funcionalidades permitem criar usuários, adicionar tarefas, listar tarefas por usuário e atualizar informações de uma tarefa específica.

Caso haja interesse ou feedback, sinta-se à vontade para explorar os endpoints fornecidos ou entrar em contato para mais informações.

**Desenvolvedor:** Leonardo Preczevski Ramos

**Contato:** leonardopreczevskiramos@gmail.com

**Linkedin:** https://www.linkedin.com/in/leonardo-preczevski-733501215/
