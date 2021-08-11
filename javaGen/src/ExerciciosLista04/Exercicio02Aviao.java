package ExerciciosLista04;

public class Exercicio02Aviao {
    //ATRIBUTOS
    private String nome;
    private int anoFabricacao;
    //METODOS

    public Exercicio02Aviao(String nome,int anoFabricacao) {
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    /*public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }*/
}
