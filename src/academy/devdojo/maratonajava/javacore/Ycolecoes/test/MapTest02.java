package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("Vic");
        Consumidor consumidor2 = new Consumidor("Dev Vic");
        Manga manga1 = new Manga(1L, "One Piece", 18.0);
        Manga manga2 = new Manga(5L, "HunterxHunter", 21.6);
        Manga manga3 = new Manga(4L, "Dr Stone", 1.4);
        Manga manga4 = new Manga(3L, "Bleach", 4.9);

        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
