package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {

        // abre um arquivo texto
        File file = new File("C:\\temp\\.in.txt");

        Scanner sc = null; // declarei scanner

        // cai no bloco try se o arquivo especificado existir
        try{
            // tentei instanciar esse scanner apontando para o arquivo 'file'
            sc = new Scanner(file);

            // percorre as linhas do arquivo
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }
        // cai no bloco catch se o arquivo que tiver especificado no caminho não existir
        catch (FileNotFoundException e){
            System.out.println("Error openind file: " + e.getMessage());
        } 
        // executará sempre no final independente se teve ou não exceções
        finally {
            if(sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed");
        }
    }
}
