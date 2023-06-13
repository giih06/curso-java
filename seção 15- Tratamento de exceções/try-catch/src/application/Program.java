package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.text.Position;

public class Program {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // no try é um bloco de codigo que corresponde a execução normal e pode gerar exceção
        try {
        // declarei um vetor que lê varios dados na mesma linha separado por um espço em branco. Cada um desses dados vai ser um elemento do vetor
        String[] vect = sc.nextLine().split(" ");

        // le a variavel position 
        int position = sc.nextInt(); // se eu digitar uma letra em vez de um numero inteiro, ocorre o erro nessa linha chamado 'inputMismatchException ' ;

        // mostra na tela o vetor na posição informada
        System.out.println(vect[position]); // Se eu digitar, por exemplo, 3 vetores e eu digitar para me mostrar o número 5, ele me dará um erro chamado 'ArrayIndexOutOfBoundsException' isso significa que eu acessei um índice do array fora do limite 
        }
        catch(ArrayIndexOutOfBoundsException e) { // caso ocorra essa exceção:
            System.out.println("Invalid position!");

        }
        catch (InputMismatchException e){ // 'e' é um apelido para o erro 
        System.out.println("Input error");

        }
        System.out.println("End of program");

        sc.close();

    }
}
