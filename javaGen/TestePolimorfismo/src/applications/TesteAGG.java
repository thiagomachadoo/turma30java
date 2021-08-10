package applications;

import entities.Ave;
import entities.Cachorro;
import entities.Gato;
import entities.Pet;

public class TesteAGG {
    public static void main(String[] args) {
        Pet numero1 = new Pet("Vira lata",2009);
        Pet ave1 = new Ave("Desconheço", 2006,true);
        Pet cachorro1 = new Cachorro("Dobberman",2009, true);
        Pet gato = new Gato("Desconheço",2004,false);
        numero1.setPorte('M');
        System.out.println(numero1.getPorte()+" é o seu porte");

        System.out.println(gato.getRaca()+" "+gato.idade()+" anos");
        gato.emiteSom();
    }
}
