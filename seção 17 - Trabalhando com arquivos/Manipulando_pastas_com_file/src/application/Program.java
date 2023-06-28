package application;
import java.io.File;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");

        String strPath = sc.nextLine(); // usuario digitou o caminho
        
        File path = new File(strPath); // a variavel path pode ser o caminho de um arquivo ou uma pasta

        // pastas
        File[] folders = path.listFiles
        (File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        // arquivos
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }

        // cria uma subpasta na pasta que o usuário informar
        boolean success = new File(strPath + "\\subdir").mkdir();

        System.out.println("Directory created successfully: " + success);
        
        sc.close();
    }
}