package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Vic";
        nome.concat(" DevDojo");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Vic");
        sb.append(" DevDojo").append(" Academy");
        System.out.println(sb);
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);

    }
}
