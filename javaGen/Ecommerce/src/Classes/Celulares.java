package Classes;

public class Celulares extends Produto {
    //ATRIBUTOS
    private String memoria;

    //CONSTRUTORES


    public Celulares(String codigo, double valor, String produto, int estoque, String memoria) {
        super(codigo, valor, produto, estoque);
        this.memoria = memoria;
    }
    //ENCAPSULAMENTO
    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }
    @Override
    public void IncluiEstoque(int quantidade){
        if (quantidade > 2){
            System.out.println("Você ganhou um brinde, Parabéns!!");
            this.estoque += quantidade;
        }else{
            this.estoque += quantidade;
        }
    }

}
