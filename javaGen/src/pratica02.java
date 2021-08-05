import java.util.Locale;
import java.util.Scanner;

public class pratica02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String time1 = "Corinthians", time2 = "Sp", time3 = "Palmeiras", time4 ="Santos";
        int ponto1=0, ponto2=0, ponto3=0, ponto4=0;
        char op;

        for(int x = 0; x <=4; x++){

            System.out.println("RODADA : "+x);
            System.out.println(time1+" G-ganhou, P-perdeu, E-empatou: ");
            op = leia.next().toUpperCase().charAt(0); //toUpperCase = maiúsculo
            if (op == 'G'){
                ponto1 += 3;
            }else if(op == 'E'){
                ponto1 += 1;
            }else if(op == 'P'){
                ponto1 += 0;
            }else{
                System.out.println("Digitou errado, sem condições em!!");
            }
        }
        for(int x = 0; x <=4; x++){

            System.out.println("RODADA : "+x);
            System.out.println(time2+" G-ganhou, P-perdeu, E-empatou: ");
            op = leia.next().toUpperCase().charAt(0); //toUpperCase = maiúsculo
            if (op == 'G'){
                ponto2 += 3;
            }else if(op == 'E'){
                ponto2 += 1;
            }else if(op == 'P'){
                ponto2 += 0;
            }else{
                System.out.println("Digitou errado, sem condições em!!");
            }
        }
        for(int x = 0; x <=4; x++){

            System.out.println("RODADA : "+x);
            System.out.println(time3+" G-ganhou, P-perdeu, E-empatou: ");
            op = leia.next().toUpperCase().charAt(0); //toUpperCase = maiúsculo
            if (op == 'G'){
                ponto3 += 3;
            }else if(op == 'E'){
                ponto3 += 1;
            }else if(op == 'P'){
                ponto3 += 0;
            }else{
                System.out.println("Digitou errado, sem condições em!!");
            }
        }
        for(int x = 0; x <=4; x++){

            System.out.println("RODADA : "+x);
            System.out.println(time4+" G-ganhou, P-perdeu, E-empatou: ");
            op = leia.next().toUpperCase().charAt(0); //toUpperCase = maiúsculo
            if (op == 'G'){
                ponto4 += 3;
            }else if(op == 'E'){
                ponto4 += 1;
            }else if(op == 'P'){
                ponto4 += 0;
            }else{
                System.out.println("Digitou errado, sem condições em!!");
            }
        }

        System.out.println();
        System.out.println("TABELA");
        System.out.printf("Time %s pontos atuais: %d pontos(s)!!",time1,ponto1);//%s para chamar string, sempre começar com chamando string
        System.out.printf("Time %s pontos atuais: %d pontos(s)!!",time2,ponto2);
        System.out.printf("Time %s pontos atuais: %d pontos(s)!!",time3,ponto3);
        System.out.printf("Time %s pontos atuais: %d pontos(s)!!",time4,ponto4);
    }
}
