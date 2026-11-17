# Sistema de Cadastro de Alunos

Sistema de cadastro e gerenciamento de alunos desenvolvido em **Java**, utilizando os princípios da **Programação Orientada a Objetos (POO)**.

Projeto desenvolvido como atividade avaliativa da **P2 – Paradigmas de Programação**, com o objetivo de refatorar uma aplicação inicialmente procedural para o paradigma orientado a objetos.

## Aluno

**David Lucas Sá Cordeiro**

**Dorivan Cunha de Morais**

##  Funcionalidades

- Cadastrar alunos com número de chamada, nome e nota.
- Impedir o cadastro de alunos com números de chamada repetidos.
- Validar notas, permitindo apenas valores entre 0 e 10.
- Listar todos os alunos cadastrados.
- Identificar automaticamente alunos aprovados e reprovados.
- Calcular a média geral da turma.
- Identificar a maior nota.
- Identificar a menor nota.
- Tratar entradas inválidas por meio de exceções.

### Critério de Aprovação

| Nota | Situação |
|---|---|
| Maior ou igual a 6,0 | Aprovado |
| Menor que 6,0 | Reprovado |

## Estrutura do Projeto

O projeto foi organizado em quatro classes, cada uma com uma responsabilidade específica:

| Classe | Responsabilidade |
|---|---|
| `Aluno` | Armazena os dados do aluno, valida sua nota e calcula sua situação acadêmica. |
| `Turma` | Gerencia a lista de alunos, impede chamadas repetidas e calcula as estatísticas da turma. |
| `Sistema` | Implementa o menu interativo e realiza a comunicação com o usuário. |
| `Main` | Responsável pelo ponto de entrada e inicialização do programa. |

##  Conceitos de POO Aplicados

O desenvolvimento do projeto utiliza os principais conceitos da Programação Orientada a Objetos:

- **Encapsulamento:** os atributos são privados (`private`), com acesso controlado por getters e setters. O setter da nota realiza a validação dos valores.
- **Abstração:** cada classe representa uma entidade ou responsabilidade do sistema.
- **Responsabilidade única:** os dados dos alunos, as regras de gerenciamento da turma e a interação com o usuário são separados em classes distintas.
- **Tratamento de exceções:** utilização de exceções para tratar entradas inválidas, notas fora do intervalo permitido e números de chamada duplicados.
- **Coleções:** utilização de listas para armazenar e gerenciar os alunos cadastrados.
- **Imutabilidade na consulta:** a lista de alunos é disponibilizada como uma lista não modificável, protegendo a estrutura interna da turma.

##  Como Executar

### 1. Clone o repositório

```bash
git clone URL_DO_SEU_REPOSITORIO
```

### 2. Acesse a pasta do projeto

```bash
cd nome-do-projeto
```

### 3. Compile os arquivos

```bash
javac *.java
```

### 4. Execute o programa

```bash
java Main
```
