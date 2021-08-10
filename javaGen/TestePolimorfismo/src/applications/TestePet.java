package applications;

import entities.Pet;

public class TestePet {
    public static void main(String[] args) {

        Pet animal1 = new Pet("CAPA PRETA",2018);

        animal1.setPorte('G');
        System.out.println(animal1.getPorte());
        System.out.println("Idade do Ragnnar: "+(2021 - animal1.getAnoNascimento()));
        animal1.emiteSom();
        System.out.printf("A idade é %d", animal1.idade());
    }
}
