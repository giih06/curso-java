package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) throws Exception {
        /* A lista não aceita números primitivos */
        List<String> list = new ArrayList<>();

        list.add("Giulia");
        list.add("Giovanni");
        list.add("Givanna");
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        // marco ficará na posição 2 da lista
        list.add(2, "Marco");

        // Remover elemento da lista
        list.remove("Anna");
        list.remove(1);
        list.removeIf(x -> x.charAt(0) == 'B'); // remover todos com o inicial da letra B

        System.out.println("--------------");
        for(String x : list) {
            System.out.println(x);
        }

        System.out.println("--------------");
        // Vendo o tamanho da lista
        System.out.println(list.size());

        System.out.println("--------------");
        // Encontrar a posição de um elemento
        System.out.println("Index of Marco: " + list.indexOf("Marco"));
        System.out.println("Index of Bob: " + list.indexOf("Bob"));

        System.out.println("--------------");
        // Deixar na lista somente as pessoas que começam com a letra G
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'G').collect(Collectors.toList());
        for(String x : result) {
            System.out.println(x);
        }

        System.out.println("--------------");
        // Encontrar o primeiro elemento que começa com G caso nao encontre, me retorne "null"
        String name = list.stream().filter(x -> x.charAt(0) == 'G').findFirst().orElse(null);
        System.out.println(name);

    }
}
