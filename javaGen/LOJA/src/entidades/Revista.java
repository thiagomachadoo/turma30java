package entidades;

public class Revista extends Produto{
    private String editora;

    public Revista(String codigo, String nome, int estoque, double valor) {
        super(codigo, nome, estoque, valor);
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
