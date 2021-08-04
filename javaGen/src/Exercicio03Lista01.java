import java.util.Scanner;

public class Exercicio03Lista01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int idade;

        System.out.println("Digite a sua idade: ");
        idade = leia.nextInt();
        if ((idade > 15) && (idade < 17)) {
            System.out.print("Sua categoria é juvenil");
        }else if ((idade > 10) && (idade < 14)) {
            System.out.print("Sua categoria é infantil");
        } else if ((idade >18) && (idade < 25)) {
            System.out.print("Sua categoria é adulto");
        }else if((idade == 0) && (idade == -0)){
            System.out.println("Digite sua idade corretamente!!");
        }

    }
}
