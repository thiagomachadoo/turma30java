package Classes;

public class Carrinho extends Produto{
    //ATRIBUTOS
    private String auxiliarCod;
    private int valorTotal;
    private int auxiliarEstoque;

    //METODOS
    public Carrinho(String produto, int estoque, String codigo, double valor,String auxiliarCod,int auxiliarEstoque,int valorTotal) {
        super(produto, estoque, codigo, valor);
        this.auxiliarCod = auxiliarCod;
        this.auxiliarEstoque = auxiliarEstoque;
        this.valorTotal = valorTotal;
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
