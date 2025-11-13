package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class AssociacaoTest01 {
    public static void main(String[] args) {
        Local local = new Local("Brasilia");
        Aluno aluno = new Aluno("Vic", 19);
        Professor professor = new Professor("Ricardo" , "Professor de Quimica");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminarios = new Seminario("TCC", alunosParaSeminario, local);
        Seminario[] seminariosDisponiveis = {seminarios};
        professor.setSeminario(seminarios);
        professor.imprime();
    }
}



