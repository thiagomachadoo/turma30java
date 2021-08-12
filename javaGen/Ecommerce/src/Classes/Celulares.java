package Classes;

public class Celulares extends Produto {
    //ATRIBUTOS
    private String marca;
    private String modelo;
    private String memoria;

    //METODOS

    public Celulares(String produto, int estoque, String codigo, double valor, String marca, String modelo) {
        super(produto, estoque, codigo, valor);
        this.marca = marca;
        this.memoria = memoria;
        this.modelo = modelo;
    }


    //CONSTRUTORES

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

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
