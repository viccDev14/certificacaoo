package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 4");
        endereco.setCep("12345-123");
        Pessoa pessoa = new Pessoa("Vic");
        pessoa.setCpf("12345678-90");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Tiffy");
        funcionario.setCpf("11111111-11");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("-------------");
        funcionario.imprime();
    }
}
