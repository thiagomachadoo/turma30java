package Classes;

    public class Produto {
    private String nome;
    private String codigo;
    private double valor;
    private int estoque;



    public Produto(String nome, String codigo) {
        super();
        this.nome = nome;
        this.codigo = codigo;
    }

    public Produto(String nome, String codigo, double valor, int estoque) {
        super();
        this.nome = nome;
        this.codigo = codigo;
        this.valor = valor;
        if (estoque < 0) {
            this.estoque = 0;
        } else {
            this.estoque = estoque;
        }
    }


        public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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

    public int getEstoque() {
        return estoque;
    }

    public void retiraEstoque(int tiraestoque) {

        this.estoque = this.estoque - tiraestoque;
    }

    public void incluiEstoque(int somaestoque) {
        if (somaestoque <= 0) {
            System.out.println("Quantidade invalida");
        } else {
            this.estoque = this.estoque + somaestoque;
        }
    }
}