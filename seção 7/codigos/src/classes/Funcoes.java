package classes;
import java.util.Scanner;
public class Funcoes {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers:");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int heigher = max(a, b, c); // o max é uma função que pega três números inteiros e retorna o maior desses números

        showResult(heigher);
        sc.close();
    }

    // public é pra que essa função fique disponível em outras classes; static é pra que essa função possa ser chamada independente de se criar um objeto; int é tipo de dado; max é o nome da função
    public static int max(int x, int y, int z){
        int aux; // declarei uma variável local da função
        if(x > y && x > z){
            aux = x;
        }
        else if(y > z){
            aux = y;
        } 
        else {
            aux = z;
        }
        return aux; // retorna o valor de aux para eu poder usar em outra função
    }

    // void - tipo que a função retorna( quando a função faz uma ação sem retornar um valor para ser reaproveitado no programa, o tipo dela deve ser VOID
    public static void showResult(int value) {
        System.out.println("Heigher = " + value);
    }

}