import java.util.Arrays;
import java.util.Scanner;

    public class Exercicio02Lista01 {
        public static void main(String[] args) {
            Scanner leia = new Scanner(System.in);
            // Faça um programa que entre com três números e coloque em ordem crescente.

            int[]  numero= new int[3];

            System.out.println("Entre com o primeiro número: ");
            numero[0] = leia.nextInt();
            System.out.println("Entre com o segundo número: ");
            numero[1] = leia.nextInt();
            System.out.println("Entre com o terceiro número: ");
            numero[2] = leia.nextInt();

            boolean flag;
            do {
                // A cada iteração é marcado como se não houvesse ainda troca
                flag = false;

                // Percorre por todos os elementos menos o ultimo,
                //pois serão comparados o elemento com seu seguinte
                for(int i=0; i < numero.length - 1; i++) {

                    // verifica se os elementos estão na ordem certa
                    if (numero[i] > numero[i + 1]) {

                        // Se não estiverem ordenados os troca de lugar
                        long aux = numero[i]; // Variável para auxiliar para troca dos valores
                        numero[i] = numero[i + 1];
                        numero[i + 1] = (int) aux;

                        flag = true;// Indica que hove uma troca
                    }
                }
            } while (flag); // Se hove uma troca o algorítimo continua.

            System.out.println("Os números digitados na ordem crescente são: " + Arrays.toString(numero));

        }
    }


