package ExerciciosLista03;

import java.util.Locale;
import java.util.Scanner;

public class pratica01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String codTime[] = new String[4];
        String nomesTimes[] = {"Santo André ", " Corinthians ", " Bragantino ", " Juventus-SP "};
        int pontosTimes[] = {0, 0, 0, 0};
        char op = ' ';
        String auxCOD;

        for (int x = 0; x < codTime.length; x++) {
            if (x == 9) {
                codTime[x] = "CPF-0" + (x + 1);
            } else {
                codTime[x] = "CPF-0" + (x + 1);
            }

        }
        System.out.println("INICIO DA TABELA");
        System.out.println("CODIGO\t\tTIME\t\tPONTOS");
        for (int x = 0; x < codTime.length; x++) {
            System.out.printf("%s\t %s\t%d\n", codTime[x], nomesTimes[x], pontosTimes[x]);
        }
        System.out.println();
        for (int x = 0; x < 3; x++) {//LAÇO QUE RODA QUANTAS FORAM DEMARCADAS
            System.out.printf("RODADA " + (x + 1));
            for (int y = 0; y < codTime.length; y++) {//LAÇO QUE RODA TODOS OS TIMES
                System.out.print(nomesTimes[y] + "G-Ganhou, P-Perdeu ou E-Empatou: ");
                op = leia.next().toUpperCase().charAt(0);
                if (op == 'G') {
                    pontosTimes[y] = pontosTimes[y] + 3;
                } else if (op == 'E') {
                    pontosTimes[y] += 1; //pontosTimes[y] = pontosTimes[y] + 1 = Same energy
                } else if (op == 'P') {
                    pontosTimes[y] += 0; //pontosTimes[y] = pontosTimes[y] + 1 = Same energy
                } else {
                    System.out.println("Tente novamente, zerado!");
                }
            }
            System.out.println("APOS 3 RODADAS");
        }

    }
}