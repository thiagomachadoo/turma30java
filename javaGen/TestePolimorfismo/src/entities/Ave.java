package entities;

public class Ave extends Pet{
    //ATRIBUTO
    private boolean voa; //"V" "F"

    //CONSTRUTOR
    public Ave(String raca) {
        super(raca);
    }
    //SOBRECARGA DE CONSTRUTOR
    public Ave(String raca, int anoNascimento, boolean voa) {
        super(raca, anoNascimento);
        this.voa = voa;
    }
    //ENCAPSULAMENTO


    public boolean isVoa() {
        return voa;
    }

    public void setVoa(boolean voa) {
        this.voa = voa;
    }
    @Override
    public void emiteSom(){
        System.out.println("pru pru pru ");
    }
}
