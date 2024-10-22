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
