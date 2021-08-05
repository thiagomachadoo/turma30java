package ExerciciosLista02;

import java.util.Scanner;

public class Exercicio02Lista02 {
    public static void main(String[] args) {
        //2- Ler 10 números e imprimir quantos são pares e quantos são impares.
        Scanner leia = new Scanner(System.in);
        int num, contPar = 0, contImpar = 0;

        for (int i = 0; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número");
            num = leia.nextInt();

            if (num % 2 == 0) {
                contPar++;
            }
            else{
                contImpar++;
            }
        }
        System.out.println("Numeros impares: "+contImpar);
        System.out.println("Numeros pares: "+contPar);

    }
}

