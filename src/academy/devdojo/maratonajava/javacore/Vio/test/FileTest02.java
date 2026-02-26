package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File fileDirectory = new File("pasta");
        boolean isDirectoryCreated = fileDirectory.mkdir();
        System.out.println("Pasta criada: " +isDirectoryCreated);
        File fileArquivoDirectory = new File(fileDirectory, "arquivo.txt");
        boolean  isFileCreated = fileArquivoDirectory.createNewFile();
        System.out.println("arquivo.txt criado: " +isFileCreated);
        File fileRenamed = new File(fileDirectory, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDirectory.renameTo(fileRenamed);
        System.out.println("arquivo.txt reanomeado: " + isRenamed);

        File directoryRenamed = new File("pasta2");
        boolean isDirectoryRenamed = fileDirectory.renameTo(directoryRenamed);
        System.out.println("Diretorio pasta renomeado: " +isDirectoryRenamed);


    }
}
