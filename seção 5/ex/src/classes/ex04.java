package classes;

import java.util.Scanner;

public class ex04 {
    /*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
    começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas. */
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // Variáveis
        int horaInicial, horaFinal, duracao;

        horaInicial = sc.nextInt(); // Entrada de dados
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal){ //se a hora inicial for menor que a hora final execute:
            duracao = horaFinal - horaInicial;
        } else { // se não, execute:
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O jogo durou" + duracao + "Horas");

        sc.close();

    }
}
