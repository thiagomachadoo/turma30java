package programas;

import entidades.Produto;

public class CadLoja {
    public static void main(String[] args) {
        Produto prod1 = new Produto("1", "camisa",10,100.00);

        prod1.setNome("CAMISETA");
        prod1.setValor(800);
        System.out.println(prod1.getValor()*3);

        prod1.retiraEstoque(17);
        System.out.println(prod1.getEstoque());
        prod1.incluiEstoque(-1);
        System.out.println(prod1.getEstoque());
    }
}
