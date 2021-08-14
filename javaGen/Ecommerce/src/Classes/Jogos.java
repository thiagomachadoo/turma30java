package Classes;

public class Jogos extends Produto {
    //ATRIBUTOS
    private String Criadores;


    //CONSTRUTORES


    public Jogos(String codigo, double valor, String produto, int estoque, String criadores) {
        super(codigo, valor, produto, estoque);
        Criadores = criadores;
    }

    //ENCAPSULAMENTO
    public String getNome() {
        return Criadores;
    }

    public void setNome(String nome) {
        this.Criadores = nome;
    }
    //METODO
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
