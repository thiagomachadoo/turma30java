package Classes;

public class Carrinho extends Produto{
    //ATRIBUTOS
    private String auxiliarCod;
    private int valorTotal;
    private int auxiliarEstoque;

    //CONSTRUTORES

    public Carrinho(String codigo, double valor, String produto, int estoque, String auxiliarCod,int valorTotal,int auxiliarEstoque) {
        super(codigo, valor, produto, estoque);
        this.auxiliarCod = auxiliarCod;
        this.valorTotal = valorTotal;
        this.auxiliarEstoque = auxiliarEstoque;
    }

    //ENCAPSULAMENTO
    public String getAuxiliarCod() {
        return auxiliarCod;
    }

    public void setAuxiliarCod(String auxiliarCod) {
        this.auxiliarCod = auxiliarCod;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(int valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getAuxiliarEstoque() {
        return auxiliarEstoque;
    }
        //METODO
    public void setAuxiliarEstoque(int auxiliarEstoque) {
        this.auxiliarEstoque = auxiliarEstoque;
    }
    public void modificarEstoque(int qntd) {
        if (qntd < auxiliarEstoque) {
            System.out.println("Estourou o estoque! Impossivel realizar!!");
        } else {
            this.auxiliarEstoque += qntd;
        }
    }
}
