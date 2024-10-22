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
