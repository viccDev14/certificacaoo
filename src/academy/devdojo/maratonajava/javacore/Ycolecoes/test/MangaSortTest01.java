package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> animes = new ArrayList<>(6);
        animes.add(new Manga(1L, "One Piece", 18.0));
        animes.add(new Manga(5L,"HunterxHunter", 21.6));
        animes.add(new Manga(4L, "Dr Stone", 1.4));
        animes.add(new Manga(3L, "Bleach", 4.9));
        for (Manga manga : animes) {
            System.out.println(manga);
        }

        System.out.println("-----------------");
        Collections.sort(animes);
        for (Manga manga : animes) {
            System.out.println(manga);
        }
    }
}
