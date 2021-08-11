package ExerciciosLista04;

public class Exercicio01Cliente {
   //ATRIBUTOS
    private String nomePessoa;
    private int idadePessoa;
    private String pedidoPessoa;
    private boolean fazerCompras;
    //CONSTRUTOR
    public Exercicio01Cliente(String nomePessoa, String pedidoPessoa, int idadePessoa, boolean fazerCompras) {
        this.nomePessoa = nomePessoa;
        this.pedidoPessoa = pedidoPessoa;
        this.fazerCompras = fazerCompras;
        this.idadePessoa = idadePessoa;
    }
    //METODO


    public boolean isFazerCompras() {
        if(fazerCompras) {
            return fazerCompras;
        }else{
            return false;
        }

    }

    public void setFazerCompras(boolean fazerCompras) {
        this.fazerCompras = fazerCompras;
    }

    public String getPedidoPessoa() {
        return pedidoPessoa;
    }

    public void setPedidoPessoa(String pedidoPessoa) {
        this.pedidoPessoa = pedidoPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public int getIdadePessoa() {
        return idadePessoa;
    }

    public void setIdadePessoa(int idadePessoa) {
        this.idadePessoa = idadePessoa;
    }
}
