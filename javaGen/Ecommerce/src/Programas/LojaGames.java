package Programas;

import java.util.*;
import Classes.*;

public class LojaGames {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Loja lojaa = new Loja();
        Carrinho carrinho = new Carrinho();

        double somaValorTotal = 0.0;
        char formaDePagamento;

        char op = 'S';

        ArrayList<Produto> itens = new ArrayList<>();
        itens.add(new Produto("iPhone 12 Pro", "G01", 5000.0, 10));
        itens.add(new Produto("Galaxy S21", "G02", 5000.0, 10));
        itens.add(new Produto("iPhone 12", "G03", 4800.0, 10));
        itens.add(new Produto("Galaxy Note 20 Ultra", "G04", 3700.0, 10));
        itens.add(new Produto("iPhone 11 Pro Max", "G05", 3500.0, 10));
        itens.add(new Produto("Mortal Kombat", "G06", 90.0, 10));
        itens.add(new Produto("Crash Bandicoot", "G07", 87.0, 10));
        itens.add(new Produto("God of War", "G08", 40.0, 10));
        itens.add(new Produto("RESIDENT EVIL", "G09", 58.0, 10));
        itens.add(new Produto("The Last Of Us", "G10", 38.0, 10));

        do {
            lojaa.apresentacao();
            System.out.printf("Deseja Fazer compras?[S/N] ");
            op = leia.next().toUpperCase().charAt(0);
            if (op == 'S') {
                do {
                    lojaa.apresentacaoLoja();
                    for (Produto x : itens) {
                        System.out.printf("%s \t %.2f   \t\t%d     %s\n", x.getCodigo(), x.getValor(), x.getEstoque(),
                                x.getNome());
                    }
                    carrinho.vemCarrinho();

                    System.out.printf("\nInforme o codigo do produto: ");
                    String cod = leia.next().toUpperCase();
                    for (Produto i : itens) {
                        if (cod.equals(i.getCodigo())) {
                            System.out.printf("Informe a quantidade desejada de %s: ", i.getNome());
                            int quant = leia.nextInt();
                            if (quant > 0 && quant <= i.getEstoque()) {
                                carrinho.entraCarrinho(i.getNome(), cod, i.getValor(), quant);
                                somaValorTotal += (quant * i.getValor());
                                System.out.println("Total: R$ " + somaValorTotal);
                                i.retiraEstoque(quant);

                            } else {
                                System.out.println("Estoque indisponível");

                            }

                        }
                    }
                    System.out.print("\nDeseja continuar comprando? [S/N]");
                    op = leia.next().toUpperCase().charAt(0);

                } while (op == 'S');

                do {
                    lojaa.menuPagamento();
                    formaDePagamento = leia.next().charAt(0);
                } while (formaDePagamento != '1' && formaDePagamento != '2'  && formaDePagamento != '3');

                System.out.printf("Os produtos abaixo foram adicionados no carrinho ");
                carrinho.vemCarrinho();
                lojaa.formaDePagamento(formaDePagamento, somaValorTotal);
                carrinho.limpar();

                System.out.printf("\nDeseja realizar novas compras?[S/N] ");
                op = leia.next().toUpperCase().charAt(0);


            }
        } while (op == 'S');

        System.out.println("             Obrigado por comprar na Connect!!");
        System.out.println("Para saber mais sobre nossos produtos, visite nosso site Connect.com.br ");
        System.out.println("                        Ate Breve!");
    }

}