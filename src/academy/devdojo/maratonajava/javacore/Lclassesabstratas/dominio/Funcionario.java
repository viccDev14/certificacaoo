package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome,double salario ) {
        this.salario = salario;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
