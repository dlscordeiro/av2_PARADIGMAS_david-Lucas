# av2_PARADIGMAS_david-Lucas

Sistema de Cadastro de Alunos (POO – Java)

Atividade avaliativa P1 – Paradigmas de Programação, refatorada do paradigma procedural para Programação Orientada a Objetos.

Autores: Dorivan Cunha de Morais, David Lucas Sá Cordeiro

Descrição

Programa de terminal que cadastra alunos (número de chamada, nome e nota), lista a turma com a situação de cada um (Aprovado se nota ≥ 6, senão Reprovado) e exibe média, maior e menor nota.

Estrutura das classes
Classe	Responsabilidade
Aluno	Guarda chamada, nome e nota; valida a nota (0 a 10) e calcula a situação.
Turma	Mantém a lista de alunos; cadastra (sem chamadas repetidas) e calcula média, maior e menor nota.
Sistema	Menu de terminal: interage com o usuário e usa Turma e Aluno.
Main	Ponto de entrada do programa.
Conceitos de POO aplicados
Encapsulamento: atributos private, acesso por getters/setters; o setter da nota valida o valor. A lista de alunos é exposta apenas como lista não modificável.
Abstração: cada classe representa um conceito do domínio.
Responsabilidade única: dados (Aluno), regras da coleção (Turma) e interface (Sistema) são separados.
Tratamento de exceções: entradas inválidas e chamadas repetidas geram erros tratados no menu.
Como executar

Requer Java 14+ (usa switch com seta).

bash
javac *.java
java Main
Exemplo de uso
1. Cadastrar | 2. Listar | 3. Sair
Opção: 1
Chamada: 1
Nome: Maria
Nota: 8.5
Aluno cadastrado!
