package ExerciciosLista03;


import java.sql.SQLOutput;
import java.util.Scanner;

public class pratica02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String agenda[][] = new String[24][31];// ex ------- linha = 0-23 coluna = 0-30
        int auxDIA, auxHORA;
        char op = ' ';
        do {
            System.out.println("Digite o dia do evento: ");
            auxDIA = leia.nextInt() - 1;
            System.out.println("Digite a hora do evento: ");
            auxHORA = leia.nextInt();
            leia.nextLine();
            System.out.println("Digite o evento: ");
            agenda[auxHORA][auxDIA] = leia.nextLine();
            System.out.println("Continua S/N : " );
            op = leia.next().toUpperCase().charAt(0);
        } while (op == 'S'); //enquanto verdadeiro
        System.out.println("MOSTRANDO AGENDA");
        for (int dia = 0; dia < 31; dia++){
            for (int hora = 0; hora < 24; hora++){
                if (agenda[hora][dia] != null){//so vai mosai mostrar os dias que pediu
                    System.out.printf("DIA %d HORA %d : %s",dia+1, hora, agenda[hora][dia]);//dia +1 é uma mascara
                    //pelo motivo do vetor ser de 0-30 (31 posicoes) é usado uma mascara para nao estourar o vetor
                }

            }
        }


    }
}
