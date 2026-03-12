package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("Vic");
        nomes.add("Cat");
        nomes2.add("Bic");
        nomes2.add("Vix");
        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }
        System.out.println("----------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
