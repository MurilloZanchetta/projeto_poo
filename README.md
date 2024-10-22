# Projeto POO em Java

Este projeto demonstra conceitos de Programação Orientada a Objetos (POO) em Java, usando as classes `Pessoa` e `Aluno`.

## Estrutura de Arquivos
- `src/Pessoa.java`: Contém a classe `Pessoa` com os atributos `nome` e `idade`.
- `src/Aluno.java`: A classe `Aluno` herda de `Pessoa` e adiciona os atributos `matricula` e `curso`.
- `src/Main.java`: Contém o método principal para testar as classes `Pessoa` e `Aluno`.

## Como Executar no VSCode

1. Abra o VSCode no diretório do projeto.
2. Compile o código:





Título: Implementação de Programação Orientada a Objetos

1. Introdução
   Este projeto tem como objetivo demonstrar a aplicação dos conceitos fundamentais de Programação Orientada a Objetos (POO), como herança, encapsulamento e polimorfismo, através da implementação de classes relacionadas.

2. Estrutura do Projeto
   O projeto contém três classes principais:
   
   2.1. Classe Pessoa
   - Atributos: nome (String), idade (int)
   - Métodos:
     - getNome(): Retorna o nome da pessoa.
     - setNome(String nome): Define o nome da pessoa.
     - getIdade(): Retorna a idade da pessoa.
     - setIdade(int idade): Define a idade da pessoa.
     - exibirInfo(): Exibe as informações da pessoa (nome e idade).
   
   2.2. Classe Aluno (herda de Pessoa)
   - Atributos adicionais: matricula (String), curso (String)
   - Métodos adicionais:
     - getMatricula(): Retorna a matrícula do aluno.
     - setMatricula(String matricula): Define a matrícula do aluno.
     - getCurso(): Retorna o curso do aluno.
     - setCurso(String curso): Define o curso do aluno.
     - exibirInfo(): Sobrescreve o método da classe Pessoa para exibir também a matrícula e o curso.

   2.3. Classe Main
   - Contém o método principal que cria instâncias de Pessoa e Aluno e testa o funcionamento dos métodos implementados.

3. Conclusão
   Este projeto demonstrou com sucesso a aplicação de herança, encapsulamento e polimorfismo em um cenário prático, criando classes relacionadas que interagem de forma eficiente e organizada.
   
4. Código Fonte
    Main.java:
    ```java

        // src/Main.java
        public class Main {
            public static void main(String[] args) {
                // Criando um objeto da classe Pessoa
                // Testando o encapsulamento ao usar getters e setters
                Pessoa pessoa = new Pessoa("João", 30);
                pessoa.exibirInfo(); // Exibe as informações da pessoa

                System.out.println("-------------------------");

                // Criando um objeto da classe Aluno
                // Testando herança e polimorfismo com os métodos de Aluno e Pessoa
                Aluno aluno = new Aluno("Maria", 20, "2021001", "Engenharia de Software");
                aluno.exibirInfo(); // Exibe as informações do aluno (sobrescrevendo o método exibirInfo)
            }
        }

    Pessoa.java:
 ```java
    
        // src/Pessoa.java
        // Classe Pessoa que representa uma pessoa com os atributos nome e idade
        public class Pessoa {
            // Atributos privados (encapsulamento)
            private String nome;
            private int idade;

            // Construtor padrão
            public Pessoa() {
            }

            // Construtor com parâmetros para inicializar os atributos
            public Pessoa(String nome, int idade) {
                this.nome = nome;
                this.idade = idade;
            }

            // Getters e Setters para acessar e modificar os atributos
            public String getNome() {
                return nome;
            }

            public void setNome(String nome) {
                this.nome = nome;
            }

            public int getIdade() {
                return idade;
            }

            public void setIdade(int idade) {
                this.idade = idade;
            }

            // Método para exibir as informações da pessoa
            public void exibirInfo() {
                System.out.println("Nome: " + nome + ", Idade: " + idade);
            }
        }

Aluno.java:

```java
// src/Aluno.java
// Classe Aluno que herda de Pessoa e adiciona atributos específicos de um aluno
public class Aluno extends Pessoa {
    // Atributos privados (encapsulamento)
    private String matricula;
    private String curso;

    // Construtor padrão
    public Aluno() {
    }

    // Construtor com parâmetros para inicializar os atributos, chamando o construtor da classe mãe (Pessoa)
    public Aluno(String nome, int idade, String matricula, String curso) {
        super(nome, idade); // Chamando o construtor da classe Pessoa
        this.matricula = matricula;
        this.curso = curso;
    }

    // Getters e Setters para acessar e modificar os atributos de Aluno
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Sobrescrevendo o método exibirInfo para adicionar informações específicas do Aluno
    @Override
    public void exibirInfo() {
        // Chamando o método exibirInfo da classe Pessoa
        super.exibirInfo();
        // Adicionando as informações específicas do Aluno
        System.out.println("Matrícula: " + matricula + ", Curso: " + curso);
    }
}
