package programas;

public class aluno {
    //atributos
    public String nome; //public por ser para todos
    public String matricula;
    public boolean ativo;
    public int nota;
    public int anoNacimento;
    public  int anoNascimentoNovo;

    //sobrecarga - mais do mesmo
    //construtores
    //encapsulamento - seguranca - getters e setters
    //metodos
    public void mostraIdade(){
        System.out.println("A idade é "+(2021 - anoNacimento));
    }
    public void mostraIdade(int anoAtual){
        System.out.println("A idade é "+(anoAtual - anoNacimento));
    }
    public void mostraIdade(int anoAtual, int anoNascimentoNovo){//quando é um atributo da classe use a palavra this
        System.out.println("A idade é "+(anoNacimento -this.anoNascimentoNovo));
        if (anoNacimento != anoNascimentoNovo){
            System.out.println("Idade alterada ae irmao!!");
        }
    }




    //poliformismo
    //herança
    //abstração
    //delegação
    //override - annotation
}
