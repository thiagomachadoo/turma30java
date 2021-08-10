package entities;

public class Cachorro extends Pet{
    //ATRIBUTO
    private boolean latidoAlto;//"V" "F"
    //CONSTRUTOR
    public Cachorro(String raca, boolean latidoAlto) {//OBJECT
        super(raca);
        this.latidoAlto = latidoAlto;
    }
    //SOBRECARGA DE CONSTRUTOR
    public Cachorro(String raca, int anoNascimento, boolean latidoAlto) {//OBJECT
        super(raca, anoNascimento);
        this.latidoAlto = latidoAlto;
    }
    // ENCAPSULAMENTO
    public boolean isLatidoAlto() {
        return latidoAlto;
    }

    public void setLatidoAlto(boolean latidoAlto) {
        this.latidoAlto = latidoAlto;
    }

    @Override
    public void emiteSom(){
        System.out.println("au au au au au au ");
    }
}

