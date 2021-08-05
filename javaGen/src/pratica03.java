import java.util.Scanner;

public class pratica03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        //precisa informar o nome e o salario
        //informar nome e salario da pessoa que tem o maior slario
        //o programa termina quando for digitado um valor negativo ou zero

        //variaveis
        String nome;
        int salario = 0;
        int maiorSalario = 0;
        String pessoaMaiorSalario = "";
        //entradas
        System.out.println("Informe seu nome: ");
        nome = leia.next();
        System.out.println("Informe seu salário: ");
        salario = leia.nextInt();
        //processamentos
        while (salario > 0) {
            if (salario > maiorSalario) {
                maiorSalario = salario;
                pessoaMaiorSalario = nome;
            }    
                System.out.println("Informe seu nome: ");
                nome = leia.next();
                System.out.println("Informe seu salário: ");
                salario = leia.nextInt();
            }
        System.out.println();
        System.out.printf("O maior salário é %d ,seu nome é %s",maiorSalario,pessoaMaiorSalario);
        }
    }