package ExerciciosLista02;

import java.util.Scanner;

public class Exercicio03Lista02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int idade = 0;
        int menor21 = 0;
        int maior50 = 0;
        //o programa termina quando idade for = -99



        while (idade != -99) {
            System.out.println("Digite a sua idade");
            idade = leia.nextInt();
            if (idade < 21) {
                menor21++;

            } else if (idade > 50) {
                maior50++;
            } else {

            }
        }
        System.out.println("Pessoas com menos de 21: "+menor21);
        System.out.println("Pessoas com mais de 50: "+maior50);

    }
}
