package entities;

public class Funcionario {
    //ATRIBUTO
    private String matricula;
    private int horasTrabalhadas;
    private double valorPorHora;
    private double salario;
    //CONSTRUTOR
    public Funcionario(int horasTrabalhadas, String matricula, double valorPorHora, double salario) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.matricula = matricula;
        this.valorPorHora = valorPorHora;
    }
    //POLIMORFISMO


    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
    public double calculoSalario(double salario){
        salario = (horasTrabalhadas * valorPorHora);
        return salario;

    }
}
