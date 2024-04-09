package model;

import java.time.LocalDate;

public class ProfessorTitular extends Professor {
    private int anosInstituicao;
    private double salarioBase;

    public ProfessorTitular(String nome, LocalDate matricula, int idade, int anosInstituicao, double salarioBase) {
        super(nome, matricula, idade);
        this.anosInstituicao = anosInstituicao;
        this.salarioBase = salarioBase;
    }

    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double calcSalario() {
        return salarioBase * (1 + (0.05 * (anosInstituicao / 5)));
    }
}