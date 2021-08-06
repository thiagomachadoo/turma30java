package programas;

public class CadNovoAluno {
    public static void main(String[] args) {
        //instanciar um aluno = criar aluno no codigo

        aluno exemplo1 = new aluno();//objeto do tipo aluno
        aluno exemplo2 = new aluno();
        exemplo1.nome = "EPAMINONDAS";
        exemplo1.matricula = "MAT-1";
        exemplo1.nota = 5;
        exemplo1.anoNacimento = 2005;


        exemplo2.nome = "MARIA";
        exemplo2.matricula = "MAT-2";
        exemplo2.nota = 10;
        exemplo2.anoNacimento = 2000;


        System.out.println("Nome: "+exemplo1.nome + " matricula: " + exemplo1.matricula + " nota: " + exemplo1.nota);
        System.out.println("Nome: "+exemplo2.nome + " matricula: " + exemplo2.matricula + " nota: " + exemplo2.nota);

        exemplo1.mostraIdade(2030);//metodos
        exemplo2.mostraIdade(2021);
        exemplo2.mostraIdade(2003, 2021);
    }
}