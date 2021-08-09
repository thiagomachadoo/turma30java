package entidades;

public class Produto {
    private String  codigo;
    private String nome;
    private double valor;
    private int estoque;

    public Produto(String codigo, String nome, int estoque, double valor) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }
    //ENCAPSULAMENTO  - METODO
    public String getCodigo() { //retorna o conteudo que ta registrado no atributo (mostrar, calcular)
        return codigo;
    }

    public void setCodigo(String codigo) { //(alterar dados registrados no atributo)
        this.codigo = codigo;
    }

    public int getEstoque() {
        return estoque;
    }
    /*
    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    assim ninguem consegue mexer no estoque
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
