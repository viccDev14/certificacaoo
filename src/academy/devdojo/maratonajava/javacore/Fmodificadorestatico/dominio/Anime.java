package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    //0- bloco de inicializaçao é executado quando na JVM carregar a classe
    //1- alocado espaço em memoria para objeto
    //2- Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    //3- bloco de inicializacao é executado
    //4- Construtor é executado


    private String nome;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicializacao estatico 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }
    static {
        System.out.println("Dentro do bloco de inicializacao estatico 2");
    }

    {
        System.out.println("Dentro do bloco de inicializacao nao estatico");
    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {

        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
