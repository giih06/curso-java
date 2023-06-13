package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            System.out.printf("\nRent #%d", i);
            System.out.print("\nName: "); 
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.next(); // next pois email não tem espaço em branco
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();

            // Estou instanciando um objeto e atribuindo a referência dele para o vetor na posição roomNumber
            Rent rent = new Rent(name, email);
            vect[roomNumber] = rent;
        }

        // Lógica para mostrar as salas ocupadas
        System.out.println("\nBusy rooms:");
        for(int i=0; i<10; i++) {
            if(vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
