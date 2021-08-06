package ExerciciosLista03;

import java.util.Scanner;

public class pratica03 {
    public static void main(String[] args) { //o programa acontece aqui //main é a principal
        Scanner leia = new Scanner(System.in);
        int anoNascimento;
        String nome;
        linha(2);
        System.out.println("Digite seu nome: ");
        nome = leia.next();
        System.out.println("Digite o ano de nascimento: ");
        anoNascimento = leia.nextInt();


        System.out.printf("%s sua idade é %d",nome,(2021-anoNascimento));
        System.out.println();
        linhaBasica();
    }
    public static void linhaBasica(){
        System.out.println("----------------------------------------------");
    }
    public static void linha(int tamanho){
        for (int x=1; x<=tamanho; x++){
            System.out.println("-");
        }

    }
}

