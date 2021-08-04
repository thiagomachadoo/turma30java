import java.util.Scanner;

public class pratica {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String nome;
        char opcao; //m, f, e
        double salario;
        double imposto15 = 0.15;
        double imposto25 = 0.25;

        System.out.print("Digite o nome : ");
        nome = leia.nextLine().toUpperCase();
        System.out.println("Selecione M-masculino, F-Feminino ou E-neutro :");
        opcao = leia.next().toUpperCase().charAt(0);
        if (opcao == 'M') {
            System.out.println("Selecionado masculino");
        }
        else if (opcao=='F') {
            System.out.println("Selecionado feminina");
        } else if (opcao=='E') {
            System.out.println("Selecionado neutro - ellu");
        }
        System.out.println("Qual o salário bruto em reais: ");
        salario = leia.nextDouble();


        if (salario <= 2000){
            System.out.println("Isento ");
        }else if(salario > 2000 && salario < 5000){
            System.out.println("Imposto de "+imposto15 * salario);
        } else if(salario > 5000){
            System.out.println("Imposto de  "+imposto25 * salario);
        }
    }
}
