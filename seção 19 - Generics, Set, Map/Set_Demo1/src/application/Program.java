package application;
import java.util.HashSet;
import java.util.Set;
public class Program {
    public static void main(String[] args) {

        // hashset é mais indicado quando a ordem dos objetos não importa, e o Treeset ou LinkedHashset para quando a ordem importa
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        set.remove("Tablet");
        set.removeIf(x -> x.length() >= 3); // remove todos os objetos que tenham mais de um caractere
        set.removeIf(x -> x.charAt(0) == 'T'); // remove todo o obj que começa com a letra T

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }
    }
}