package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner in = new Scanner(System.in);
        String username08 = "Goku";
        String senha08 = "ssj";
        System.out.println("Usuario: ");
        String usernameDigitado = in.nextLine();
        System.out.println("Senha: ");
        String senha08Digitada = in.nextLine();
        if (!username08.equals(usernameDigitado) || ! senha08.equals(senha08Digitada)) {
            throw new LoginInvalidoException("Usuario ou senha invalidos");

        }
        System.out.println("Usuario logado com sucesso");


    }
}
