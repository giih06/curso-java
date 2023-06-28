package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws Exception {
        String path = "c:\\temp\\teste.txt"; // caminho do arquivo
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path); // estou estabelecendo uma sequencia de leitura a partir do arquivo path

            br = new BufferedReader(fr); // o bufferreader é instanciado a partir do filereader 

            String line = br.readLine();// vai ler uma linha do arquivo, se o arquivo ja tiver no final, retornará null

            while (line != null) {
                System.out.println(line);
                line = br.readLine(); // le outra linha
            }

        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
            if(br != null) {
                br.close();
            }
            if(fr != null) {
                fr.close();
            }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
