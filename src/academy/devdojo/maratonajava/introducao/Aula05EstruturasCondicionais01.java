package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprar = idade >= 18;
        // !
        if (isAutorizadoComprar) {
            System.out.println("Autorizado a comprar");
        } else {
            System.out.println("Nao autorizado a comprar");
        }
        if (!isAutorizadoComprar) {
            System.out.println("Nao autorizado a comprar");
        }

        boolean c = false;
        if(c == true) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }
        System.out.println("Fora do if ");
    }
}
