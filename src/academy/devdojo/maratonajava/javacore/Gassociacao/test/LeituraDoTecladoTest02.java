package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Prevendo seu futuro...");
        System.out.println("Digite sua pergunta e eu responderei sim ou nao");
        String pergunta = in.nextLine();
        if (pergunta.charAt(0) == ' ' ){
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
