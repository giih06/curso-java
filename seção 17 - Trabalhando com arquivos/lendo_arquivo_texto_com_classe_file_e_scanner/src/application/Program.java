package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws Exception {
        File file = new File("c:\\temp\\teste.txt");
        Scanner sc = null;

        // instanciar o scanner a partir do arquivo
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()) {// testa se ainda existe uma nova linha no arquivo
                System.out.println(sc.nextLine());// imprimir a linha
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            if(sc != null) {
                sc.close();
            }
        }

    }

}
