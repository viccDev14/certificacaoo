package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {
    //0- bloco de inicializaçao estatico da super classe é executado quando na JVM carregar a classe pai
    //1- bloco de inicializaçao estatico da sub classe é executado quando na JVM carregar a classe filha
    //2- alocado espaço em memoria para objeto da super classe
    //3- Cada atributo de super classe é criado e inicializado com valores default ou o que for passado
    //4- bloco de inicializacao da super classe é executado na ordem em que aparece
    //5- Construtor é executado da super classe
    //6- alocado espaço em memoria para objeto da sub classe
    //7- Cada atributo de sub classe é criado e inicializado com valores default ou o que for passado
    //8- bloco de inicializacao da sub classe é executado na ordem em que aparece
    //9- Construtor é executado da sub classe

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("vitoria");
    }
}
