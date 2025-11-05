package org.model;

public abstract class Funcionario {
    protected String nome;
    protected String matricula;

    // Construtor
    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    // Métodos abstratos
    public abstract double calcularSalario();
    public abstract void realizarTarefa();

    // Getter para nome (para usar no Main)
    public String getNome() {
        return nome;
    }
}
