package classes;

import java.util.Scanner;

// Estrurua for
/*É uma estrutura de controle que
repete um bloco de comandos
para um certo intervalo de
valores. 

Quando usar: quando se sabe
previamente a quantidade de
repetições, ou o intervalo de
valores.
*/

public class para {
public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    /*
    for ( início ; condição ; incremento) {
        comando 1
        comando 2
        }
        inicio -> Executa somente na primeira vez
        condição -> V: executa e volta e F: pula fora
        incremento -> Executa toda vez depois de voltar

    */
    
    int soma = 0;
    for(int i=0; i<N; i++){
        int x = sc.nextInt();
        soma += x;
    }
    System.out.println(soma);
    sc.close();

    }
}
