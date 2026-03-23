package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> animes = new ArrayList<>(6);
        animes.add(new Manga(1L, "One Piece", 18.0, 0));
        animes.add(new Manga(2L, "HunterxHunter", 21.6, 1));
        animes.add(new Manga(4L, "Dr Stone", 1.4, 0));
        animes.add(new Manga(3L, "Bleach", 4.9, 0));
        animes.add(new Manga(5L, "Horimiya", 12.50, 2));

//        Iterator<Manga> mangaIterator = animes.iterator();
//        while (mangaIterator.hasNext()) {
//            if (mangaIterator.next().getQuantidade() == 0) {
//                mangaIterator.remove();
//            }
//        }


        animes.removeIf(manga -> manga.getQuantidade() == 0);
        System.out.println(animes);

    }
}
