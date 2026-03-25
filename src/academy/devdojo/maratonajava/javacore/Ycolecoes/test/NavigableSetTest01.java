package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);
        System.out.println(set);

        NavigableSet<Manga> manga = new TreeSet<>();
        manga.add(new Manga(1L, "One Piece", 18.0, 0));
        manga.add(new Manga(2L, "HunterxHunter", 21.6, 1));
        manga.add(new Manga(4L, "Dr Stone", 1.4, 0));
        manga.add(new Manga(3L, "Bleach", 4.9, 0));
        manga.add(new Manga(5L, "Horimiya", 12.50, 2));
        manga.add(new Manga(10L, "Over Flow", 11.50, 2));

        for (Manga mangas : manga) {
            System.out.println(mangas);
        }

        Manga naruto = new Manga(21L, "Naruto", 18.0, 0);

        // lower <
        // floor <=
        // higher >
        // ceiling >=

        System.out.println("--------------------");
        System.out.println(manga.lower(naruto));
        System.out.println(manga.floor(naruto));
        System.out.println(manga.higher(naruto));
        System.out.println(manga.ceiling(naruto));

        System.out.println(manga.size());
        System.out.println(manga.pollFirst());
        System.out.println(manga.size());
        System.out.println(manga.pollLast());

    }
}
