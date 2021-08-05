package ExerciciosLista02;

import java.util.Scanner;

public class Exercicio06Lista02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero = 0, somaNumerosMultiplosDe3 = 0, quantidadeNumeros = 0, media = 0;

        do {
            System.out.printf("Digite o número: ");
            numero = leia.nextInt();
            if ((numero % 3) == 0 && numero !=0) {
                somaNumerosMultiplosDe3 += numero;
                quantidadeNumeros++;
            }
        } while (numero != 0);

        media = somaNumerosMultiplosDe3 / quantidadeNumeros;

        System.out.printf("A média dos números multiplos de 3 é : %d", media);
    }

}
