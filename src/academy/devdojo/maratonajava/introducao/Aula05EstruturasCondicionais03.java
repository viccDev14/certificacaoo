package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {

    public static void main(String[] args) {
        // Doar se salario > 5000

        double salario = 6000;
        String mensagemDoar = "Eu vou doar";
        String mensagemNaoDoar = "Ainda nao tenho condicoes";
        // ? (Operador ternario)
        // (condicao) ? verdadeiro : falso

        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

//        if (salario > 5000) {
//            resultado = mensagemDoar;
//        } else {
//            resultado = mensagemNaoDoar;
//        }
        System.out.println(resultado);
    }
}
