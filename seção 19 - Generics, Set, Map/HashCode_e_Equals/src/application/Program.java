package application;

import entities.Client;

public class Program {
    public static void main(String[] args) throws Exception {
        
        Client c1 = new Client("Maria", "maria@gmail.com");

        Client c2 = new Client("Maria", "maria@gmail.com");

        String s1 = "Test";
        String s2 = "Test";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2); // compara as referências de memória, por isso da falso

        System.out.println(s1 == s2); // o compilador da um tratamento especial, por isso da true (já que não tem o "new") 
    }
}
