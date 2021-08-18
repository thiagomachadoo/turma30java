package POO;

public class ExercicioAviao {

    //ATRIBUTOS
    private int Poltronas;
    private String nome;
    private int numeracao;
    //CONSTRUTORES
    public ExercicioAviao(int poltronas, String nome, int numeracao) {
        this.Poltronas = poltronas;
        this.nome = nome;
        this.numeracao = numeracao;
    }
    //GETTERS = PUXAR-PEGAR  SETTERS = MODIFICAR
    public int getPoltronas() {
        return Poltronas;
    }

    public void setPoltronas(int poltronas) {
        Poltronas = poltronas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(int numeracao) {
        this.numeracao = numeracao;
    }
}
//replicar todos os exercicios de poo que faltam
