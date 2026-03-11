package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("A1BCD", "iPhone");
        Smartphone s2 = new Smartphone("A1BCD", "iPhone");
        System.out.println(s1.equals(s2));

    }
}
