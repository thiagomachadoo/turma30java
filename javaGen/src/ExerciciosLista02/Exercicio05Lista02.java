package ExerciciosLista02;

import java.util.Scanner;

public class Exercicio05Lista02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

            int numero, somaNumero = 0;

            do {
                System.out.printf("Digite o número: ");
                numero = leia.nextInt();
                somaNumero += numero;
            } while (numero != 0);

            System.out.printf("A soma dos números digitados é %d", somaNumero);


        }
}
