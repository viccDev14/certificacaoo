package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("ACEMAGIC", 12000);
        Tomate tomate = new Tomate("Cereja", 4);
        CalculadoraImposto.calcularImpostoComputador(computador);
        CalculadoraImposto.calcularImpostoTomate(tomate);
    }
}
