package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) throws Exception {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10); // Transformei a lista em uma stream e com o´argumento método .map, os Strings da lista serão multiplicados por 10 / map é operação intermediária
        System.out.println(Arrays.toString(st1.toArray())); // toarray é operação terminal

        // somando todos os elementos da string
        int sum = list.stream().reduce(0, (x, y) -> x + y); // a operação reduce é terminal e recebe 2 argumentos, o primeiro é o elemento inicial (elemento neutro da operação) , e o segundo é uma função que recebe dois argumentos que geram um resultado 
        System.out.println("Sum = " + sum);

        List<Integer> newList = list.stream() // lista de inteiros / list.stream gera uma stream
            .filter(x -> x % 2 == 0)
            .map(x -> x * 10)
            .collect(Collectors.toList()); 
            // .filter - filtra a lista com base num predicado. A partir desse predicado será gerado uma nova stream contendo apenas aqueles elementos que satisfaçam aquele predicado
            // .map para transformar em outra stream que pega cada elemento da mistura de números pares e transforma ele no X vezes 10
            // resumo: gerei uma nova stream onde cada elemento vai ser o original multiplicado por 10
            // Para transformar a stream em lista, utilizamos o .collect(collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));

    }
}
