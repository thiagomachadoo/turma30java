package ObjetosTeste;

import ExerciciosLista04.Exercicio02Aviao;

public class ObjetoAviao {
    public static void main(String[] args) {
        //Exercicio02Aviao oneT = new Exercicio02Aviao("AirBus",1989);
        Exercicio02Aviao oneT = new Exercicio02Aviao("AirLine", 2389);

        //teste
        oneT.setNome("Mudando apenas");
        System.out.println("Nome: "+oneT.getNome()+" fabricado em: "+oneT.getAnoFabricacao());
    }



}
