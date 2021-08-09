package programas;

import entidades.Doces;
import entidades.Revista;

public class CadBanca {
    public static void main(String[] args) {
        Revista rev1 = new Revista("1","revista hoje em dia", 30, 15.50);

        Doces sugar1 = new Doces("010", "Bala Soft",1000, 0.15);

        sugar1.retiraEstoque(500);
        rev1.incluiEstoque(100);
        System.out.println(rev1.getNome()+" estoque: "+rev1.getEstoque());
    }
}
