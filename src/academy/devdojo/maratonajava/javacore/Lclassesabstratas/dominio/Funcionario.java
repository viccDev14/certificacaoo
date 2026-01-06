package academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome,double salario ) {
        this.salario = salario;
        this.nome = nome;
        calculaBonus();
    }



    public abstract void calculaBonus();

    }