package Classes;

public class ClasseMae {
    //ATRIBUTOS
    protected String produto;
    protected int estoque;
    protected String codigo;
    protected double valor;

    //METODOS

    public ClasseMae(String produto,String codigo) {
        this.produto = produto;
        this.codigo = codigo;
    }

    public ClasseMae(String produto, int estoque, String codigo, double valor) {
        super();
        this.produto = produto;
        this.estoque = estoque;
        this.valor = valor;
        this.codigo = codigo;
    }

    //ENCAPSULAMENTO -- GETTERS and SETTERS

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public int getEstoque() {
        return estoque;
    }
    /*
    public void setEstoque(Celulares estoque) {
        this.estoque = estoque;
    }
    */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void IncluiEstoque(int quantidade){
        if (quantidade <= 0){
            System.out.println("Quantidade incorreta. Tente novamente!!");
        }else{
            this.estoque += quantidade;
        }
    }
    public void RetiraEstoque(int quantidade){
        if (quantidade > estoque){
            System.out.println("Quantidade indisponivel!!");
        }else{
            this.estoque -= quantidade;
        }
    }

}
