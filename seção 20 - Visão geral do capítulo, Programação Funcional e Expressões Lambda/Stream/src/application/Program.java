package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) throws Exception {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7); // Lista de inteiro
        Stream<Integer> st1 = list.stream().map(x -> x * 10); // Stream de inteiro ( criei uma stream a partir da lista) / O .map aplica uma função a cada elemento da minha String / o argumento do .map mulltiplica cada elemento da String por 10
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob"); // Esse método .of permite colocar os elementos diretos entre parênteses
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2); // esse método .iterate permite definir o primeiro elemento da String e a função de iteração de geração dos próximos elementos
        System.out.println(Arrays.toString(st3.limit(10).toArray())); // já que o método .itinerate é infinito, esse método .limit limita o tamanho do vetor para 10 números

        // Sequência de fobonacci
        Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]); // O primeiro elemenro da string é 0 long e 1 long. A função de geração da string vai ser o objeto p que leva no novo array de Long contendo também dois elementos: o 1 elemento - o array anterior na posição 1, o 2 elemento - o elemento anterior na posição 0 + o elemento anterior na posição 1
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
    }
}
