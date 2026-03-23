package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Manga> animes = new ArrayList<>(6);
        animes.add(new Manga(1L, "One Piece", 18.0));
        animes.add(new Manga(4L,"HunterxHunter", 21.6));
        animes.add(new Manga(3L, "Dr Stone", 1.4));
        animes.add(new Manga(2L, "Bleach", 4.9));

//        Collections.sort(animes);
        animes.sort(mangaByIdComparator);
        for (Manga manga : animes) {
            System.out.println(manga);
        }

        Manga mangaToSearch = new Manga(2L, "Bleach", 4.9);
        System.out.println(Collections.binarySearch(animes, mangaToSearch, mangaByIdComparator));
    }
}
