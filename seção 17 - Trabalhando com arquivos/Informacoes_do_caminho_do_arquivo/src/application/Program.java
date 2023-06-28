package application;
import java.io.File;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");

        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getPath: " + path.getPath()); // todo o caminho da pasta

        System.out.println("getParent: " + path.getParent()); // caminho da pasta

        System.out.println("getName: " + path.getName()); // nome da pasta

        sc.close();
    }
}