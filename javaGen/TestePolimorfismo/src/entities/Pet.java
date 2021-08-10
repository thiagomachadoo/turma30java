package entities;

public class Pet {
    //ATRIBUTOS - O que a classe é, tem ou está
    private String raca;
    private char porte;
    private int anoNascimento;

    //CONSTRUTORES


    public Pet(String raca) {
        this.raca = raca;
    }
    //SOBRECARGA DE CONSTRUTOR
    public Pet(String raca, int anoNascimento) { //construtor tem o mesmo nome da classe
        super();
        this.raca = raca;
        this.anoNascimento = anoNascimento;
    }


    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public char getPorte() {
        return porte;
    }

    public void setPorte(char porte) {
        this.porte = porte;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public void emiteSom(){
        System.out.println("Emitindo o som do bicho...");
    }
    public int idade(){
        return (2021 - anoNascimento);
    }

}
