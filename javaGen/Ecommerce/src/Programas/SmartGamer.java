package Programas;
import Classes.Celulares;
import Classes.ClasseMae;
import Classes.Jogos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class SmartGamer {
    public static void main(String[] args) {
        String auxProd;
        int x = 0;


        Scanner leia = new Scanner(System.in);
        List<ClasseMae> estoque = new ArrayList();
        //LISTAS A SEREM PREENCHIDAS

        estoque.add(new Celulares("RogPhone 3",10,"G4-2",5.000,"Asus","Galaxy 1.5"));
        estoque.add(new Celulares("LG K20",10,"G4-3",600.00,"Lg","Galaxy 1.5"));
        estoque.add(new Celulares("Galaxy S10",10,"G4-4",2000.00,"Samsung","Galaxy 1.5"));
        estoque.add(new Celulares("Iphone X",10,"G4-5",4000.00,"Apple","Galaxy 1.5"));
        estoque.add(new Jogos("------- ",10,"G4-6",0.00,""));
        estoque.add(new Jogos("-------",10,"G4-7",0.00,"-------"));
        estoque.add(new Jogos("-------",10,"G4-8",0.00,"-------"));
        estoque.add(new Jogos("------- ",10,"G4-9",0.00,"-------"));
        estoque.add(new Jogos("------- ",10,"G4-10",0.00,"-------"));


        //MOSTRAR NA TELA O CLIENTE QUER
        System.out.println("COD\tPRODUTO\tVALOR\tESTOQUE");

        for ( ClasseMae prod: estoque) {
            System.out.println(prod.getCodigo()+"\t"+prod.getProduto()+"\t"+prod.getValor()+"\t"+prod.getEstoque());
        }
        System.out.println("Digite o código do produto: ");
        auxProd = leia.next().toUpperCase();
        x = estoque.indexOf(auxProd);
        System.out.println("Você escolheu o produto "+estoque.get(x+1));
    }
}
