package ObjetosTeste;

import ExerciciosLista04.Exercicio01Cliente;

public class ObjetoCliente {
    public static void main(String[] args) {
        Exercicio01Cliente cliente1 = new Exercicio01Cliente("Jão","Copo de vinho", 18,true);
        //testes básicos
        cliente1.setPedidoPessoa("tomar agua");
        System.out.println("\nNome: "+cliente1.getNomePessoa()+"\n seu pedido foi: "+cliente1.getPedidoPessoa()+"\n idade: "+cliente1.getIdadePessoa()+"\n pode comprar: "+cliente1.isFazerCompras());



    }
}
