package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprar = idade >= 18;
        // !
        if (isAutorizadoComprar) {
            System.out.println("Autorizado a comprar");
        }
        if (!isAutorizadoComprar) {
            System.out.println("Nao autorizado a comprar");
        }
        System.out.println("Fora do if ");
    }
}
