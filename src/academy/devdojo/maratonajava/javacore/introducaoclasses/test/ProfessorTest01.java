package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Vic Dev";
        professor.idade = 20;
        professor.sexo = 'F';

        System.out.println("Nome: " + professor.nome + ", Idade: " + professor.idade + ", Sexo: " + professor.sexo);
    }
}
