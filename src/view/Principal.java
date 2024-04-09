package view;

import java.time.LocalDate;

import model.ProfessorHorista;
import model.ProfessorTitular;

public class Principal {
    public static void main(String[] args) {
        ProfessorTitular professorTitular = new ProfessorTitular("Cida", LocalDate.now(), 60, 30, 5000.0);
        System.out.println("Salário do Professor Titular "+professorTitular.getNome() +": " + professorTitular.calcSalario());

        ProfessorHorista professorHorista = new ProfessorHorista("Yumi", LocalDate.now(), 35, 30, 80.0);
        System.out.println("Salário do Professor Horista: " + professorHorista.calcSalario());
    }
}
