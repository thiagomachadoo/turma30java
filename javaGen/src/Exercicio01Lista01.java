import java.util.Scanner;

public class Exercicio01Lista01 {


        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            int x;
            int y;
            int z;
            int maior;
            //1- Faça um programa que receba três inteiros e diga qual deles é o maior.
            System.out.print("Digite o primeiro número: ");
            x = leia.nextInt();
            System.out.print("Digite o segundo número: ");
            y = leia.nextInt();
            System.out.print("Digite o terceiro número: ");
            z = leia.nextInt();
            if (x > y && x > z) {
                System.out.println("O maior é " + x);
            } else if (y > x && y > z) {
                System.out.println("O maior é " + y);
            } else {
                System.out.println("O maior é " + z);
            }
        }
    }

