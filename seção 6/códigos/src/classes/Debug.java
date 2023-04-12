package classes;

import java.util.Locale;
import java.util.Scanner;
// aula de como executar o debug passo a passo no vscode
/*Para marcar uma linha de breakpoint (até onde quero que funcione o debug):
 * Clique na bolinha vermelha antes do número da linha
 * Para iniciar o debug:
 * setinha pra baixo no canto superior direito -> debug java
 * Para executar uma linha:
 * Na barra do debug -> contornar( F10)
 * Para interromper o debug
 * Na barra de debug -> interromper
 */

public class Debug {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US); // A entrada de números é com ponto
        Scanner sc = new Scanner(System.in); // Iniciei minha variável de entrada de dados
        double largura = sc.nextDouble(); // número real, variável largura, entrada de dados
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();
        double area = largura * comprimento; // a area é da classe double e o valor dela é a largura x comprimento.
        double preco = area * metroQuadrado;
        System.out.printf("AREA = %.2f%n", area); // saída de sados da area
        System.out.printf("PRECO = %.2f%n", preco);
        sc.close();
    }
}
