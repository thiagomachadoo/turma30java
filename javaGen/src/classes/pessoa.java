package classes;

public class pessoa {

    //ATRIBUTOS DA CLASSE
    private String nome;
    private int anoNascimento = 0;
    private String cpf;
    private char pronome; //M-MASCULINO F-FEMININO E-NEUTRO
    private boolean ativo;
    //CONSTRUTORES(CONSTROEM AS REGRAS DA CLASSE)
    public pessoa(String nome){//é um construtor pois tem o mesmo nome da classe
        this.nome = nome; //o nome atributo vai receber o nome fixo
    }
    public pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public pessoa() {
    }

    public void mostarIdade(){
        System.out.println(2021-this.anoNascimento);
    }
    public int calculaIdade(int anoAtual){
        return anoAtual - anoNascimento;
        // ou int = anoAtual
        //anoAtual - anoNascimento
    }
    //encapsulamento - getters e setters

}