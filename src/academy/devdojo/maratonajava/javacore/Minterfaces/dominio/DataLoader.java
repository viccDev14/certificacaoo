package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    public static final int MAX_DATA_SIZE= 10;
   public abstract void load();
   default void checkPermission(){
        System.out.println("Fazendo checagem de permissoes");
    }

    public static void retrieverMaxDataSize(){
        System.out.println("Dentro do retrieverMaxDataSize na interface");
    }
}
