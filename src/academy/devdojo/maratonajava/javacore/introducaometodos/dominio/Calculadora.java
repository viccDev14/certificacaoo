package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num01, float num02) {
        System.out.println(num01 * num02);
    }

    public double divideDoisNumeros(double num01, double num02) {
        if (num02 == 0) {
            return 0;
        }
        return num01 / num02;
    }

    public double divideDoisNumeros2(double num01, double num02) {
        if (num02 != 0) {
            return num01 / num02;
        }
        return 0;
    }

    public void imprimeDivisaoDoisNumeros(double num1, double num2) {
        if(num2 == 0) {
            System.out.println("Nao existe divisao por zero ");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int a, int b) {
        a = 99;
        b = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num 1: " + a);
        System.out.println("Num 2: " + b);
    }
}
