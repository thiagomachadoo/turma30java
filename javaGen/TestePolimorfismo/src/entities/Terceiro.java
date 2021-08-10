package entities;

public class Terceiro extends Funcionario {
    //ATRIBUTO
    private double adicional;
    //CONSTRUTOR


    public Terceiro(int horasTrabalhadas, String matricula, double valorPorHora, double salario, double adicional) {
        super(horasTrabalhadas, matricula, valorPorHora, salario);
        this.adicional = adicional;
    }

    //GET SET
    public double getAdicional() {
        return adicional;
    }
    /*
    public void setAdicional(double adicional) {
        this.adicional = adicional;
    }
     */
    @Override
    public double calculoSalario(double salario){
        return super.getValorPorHora() + super.getHorasTrabalhadas() * salario;
    }
}
