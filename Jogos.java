package Classes;

public class Jogos extends Produto {
    //ATRIBUTOS
    private String nome;

    public Jogos(String produto, int estoque, String codigo, double valor, String nome) {
        super(produto, estoque, codigo, valor);
        this.nome = nome;
    }
    //METODOS

    //ENCAPSULAMENTO
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
