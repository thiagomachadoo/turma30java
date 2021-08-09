package entidades;

public class Doces extends Produto {
    private String fabricante;

    public Doces(String codigo, String nome, int estoque, double valor) {
        super(codigo, nome, estoque, valor);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
