package model;

import java.time.LocalDate;

public class Professor {
    private String nome;
    private LocalDate matricula;
    private int idade;

    public Professor(String nome, LocalDate matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getMatricula() {
        return matricula;
    }

    public void setMatricula(LocalDate matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double calcSalario() {
        return 0; 
    }
}
