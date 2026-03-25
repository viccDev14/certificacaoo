package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.*;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> animes = new LinkedHashSet<>();
        animes.add(new Manga(1L, "One Piece", 18.0, 0));
        animes.add(new Manga(2L, "HunterxHunter", 21.6, 1));
        animes.add(new Manga(4L, "Dr Stone", 1.4, 0));
        animes.add(new Manga(3L, "Bleach", 4.9, 0));
        animes.add(new Manga(5L, "Horimiya", 12.50, 2));


        for(Manga manga : animes){
            System.out.println(manga);
        }
    }
}
