package Banco;

public class ContaCorrente extends Conta{
    private int contadorTalao;

    public ContaCorrente(int numero, String nomeCliente, double saldo) {
        super(numero, nomeCliente, saldo);
    }

    public int getContadorTalao() {
        return contadorTalao;
    }

    public void setContadorTalao(int contadorTalao) {
        this.contadorTalao = contadorTalao;
    }
    public void pedirTalao(int contadorTalao){

    }
}
