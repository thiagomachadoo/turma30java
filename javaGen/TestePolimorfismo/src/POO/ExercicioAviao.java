package POO;

public class ExercicioAviao {
     /*
    2) Crie uma classe avião e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto avião, defina as instancias deste
    objeto e apresente as informações deste objeto no console.
     */


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
