package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
        public static void main(String[] args) {
            double salarioAtual = 70000;
            double primeiraFaixa = 9.70/100;
            double segundafaixa = 37.35/100;
            double terceiraFaixa = 49.50/100;
            double valorImposto;
            if (salarioAtual <= 34712) {
                valorImposto = salarioAtual * primeiraFaixa;
            } else if(salarioAtual >= 34713 && salarioAtual <= 68507) {
                valorImposto = salarioAtual * segundafaixa;
            } else {
                valorImposto = salarioAtual * terceiraFaixa;
            }

            System.out.println(valorImposto);
    }
}
