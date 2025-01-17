# API MERCADO

## Função:
- Praticar conhecimentos em SQL

## Tecnologias Utilizadas:
- Java
- Spring Boot
- Maven
- JPA/Hibernate
- Banco de Dados SQL

## Endpoints da API:

### Funcionario

- **GET /funcionario/pesquisa/{id}**
  - Descrição: Pesquisa um funcionário pelo ID.
  - Parâmetros: `id` (Long) - ID do funcionário.
  - Retorno: Detalhes do funcionário.

- **GET /funcionario/listaTodos**
  - Descrição: Lista todos os funcionários.
  - Retorno: Lista de funcionários.

- **POST /funcionario/cadastro**
  - Descrição: Cadastra um novo funcionário.
  - Corpo da Requisição (JSON):
    ```json
    {
        "nome": "string",
        "cpf": "string",
        "telefone": "string",
        "endereco": {
            "rua": "string",
            "numero": "string",
            "bairro": "string",
            "cidade": "string",
            "estado": "string",
            "cep": "string"
        },
        "funcao": "string"
    }
    ```
  - Retorno: Detalhes do funcionário cadastrado.

- **PUT /funcionario/atualiza/{id}**
  - Descrição: Atualiza os dados de um funcionário existente.
  - Parâmetros: `id` (Long) - ID do funcionário.
  - Corpo da Requisição (JSON):
    ```json
    {
        "telefone": "string",
        "endereco": {
            "rua": "string",
            "numero": "string",
            "bairro": "string",
            "cidade": "string",
            "estado": "string",
            "cep": "string"
        },
        "funcao": "string"
    }
    ```
  - Retorno: Detalhes do funcionário atualizado.

- **DELETE /funcionario/deleta/{id}**
  - Descrição: Deleta um funcionário pelo ID.
  - Parâmetros: `id` (Long) - ID do funcionário.
  - Retorno: Nenhum conteúdo.

## Como Executar o Projeto:

1. Clone o repositório:
   ```sh
   git clone https://github.com/DiegoCasemiroFS/mercado.git