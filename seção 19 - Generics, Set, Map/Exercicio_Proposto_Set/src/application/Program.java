package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) throws Exception {

       Scanner sc = new Scanner(System.in);

       // HashSet não importa a ordem do conjunto
       Set<Integer> a = new HashSet<>();
       Set<Integer> b = new HashSet<>();
       Set<Integer> c = new HashSet<>();

       System.out.print("How many students for course A? ");
       int n = sc.nextInt();
       for(int i=0; i<n; i++) {
            int number = sc.nextInt();
            a.add(number); // adiciona o número ao conjunto a
       }

       System.out.print("How many students for course B? ");
       n = sc.nextInt();
       for(int i=0; i<n; i++) {
        int number = sc.nextInt();
        b.add(number); // adiciona o number ao conjunto b
       }

       System.out.print("How many students for course C? ");
       n = sc.nextInt();
       for(int i=0; i<n; i++) {
            int number = sc.nextInt();
            c.add(number); // adiciona o number ao conjunto c
       }

       // cria um conjunto a, que é somado co o conjunto b e c;
       Set<Integer> total = new HashSet<>(a);
       total.addAll(b);
       total.addAll(c);
       // conjunto a + b + c = total

       // total.seize é quantidade de elementos do conjunto
       System.out.println("Total students: " + total.size());

       sc.close();
    }
}
