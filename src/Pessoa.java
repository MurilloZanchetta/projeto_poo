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
