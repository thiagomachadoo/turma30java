package entities;

public class Gato extends Pet{
        //ATRIBUTO
    private boolean miadoAlto;//"V" "F"
        //CONSTRUTOR

        //CONSTRUTOR DE SOBRECARGA
    public Gato(String raca, int anoNascimento, boolean miadoAlto) {
        super(raca, anoNascimento);
        this.miadoAlto = miadoAlto;
    }
    //getters e setters - ENCAPSULAMENTO
    public boolean isMiadoAlto() {
        return miadoAlto;
    }

    public void setMiadoAlto(boolean miadoAlto) {
        this.miadoAlto = miadoAlto;
    }
    @Override
    public void emiteSom(){
        if(miadoAlto) {
            System.out.println("MIAU MIAU MIAU");
        }else{
            System.out.println("miau miau miau");
        }
    }
}
