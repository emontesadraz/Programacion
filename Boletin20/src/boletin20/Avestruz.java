package boletin20;

public class Avestruz extends Aves implements IPodeCamiñar {

    @Override
    public void anda() {
        System.out.println("As avestruces só poden camiñar");
    }

}
