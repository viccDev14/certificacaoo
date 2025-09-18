package academy.devdojo.maratonajava.introducao;

/*
Pratica

Crie variaveis para os campos descritos entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>,
confirmo que recebi o salario de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Vic";
        String endereco = "cidade de KARAKURA";
        double salario = 1200.52;
        String data = "18/08/2025";

        System.out.println("Eu " + nome + " morando no endereço " + endereco + ", confirmo que recebi o salario de " + salario + " reais, na data " + data);
    }
}
