package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Mercedes";
        carro01.modelo = "Sport";
        carro01.ano = 2000;

        carro02.nome = "BMW";
        carro02.modelo = "Sport";
        carro02.ano = 1995;

        carro01 = carro02;

        System.out.println("Carro 1 - Nome: " + carro01.nome + ", Modelo: " + carro01.modelo + ", Ano: " + carro01.ano);
        System.out.println("Carro 2 - Nome: " + carro02.nome + ", Modelo: " + carro02.modelo + ", Ano: " + carro02.ano);

    }
}
