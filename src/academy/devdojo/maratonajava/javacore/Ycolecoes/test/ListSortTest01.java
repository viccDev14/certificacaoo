package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> animes = new ArrayList<>(6);
        animes.add("One Piece");
        animes.add("HunterxHunter");
        animes.add("Dr Stone");
        animes.add("Bleach");

        Collections.sort(animes);

        List<Double> dinheiros = new ArrayList<>(6);
        dinheiros.add(1.0);
        dinheiros.add(2.0);
        dinheiros.add(2.5);
        dinheiros.add(23.00);
        dinheiros.add(5.9);

        for (String anime : animes) {
            System.out.println(anime);
            System.out.println("------------");
        }

        System.out.println(dinheiros);
        Collections.sort(dinheiros);
        System.out.println(dinheiros);
    }
}
