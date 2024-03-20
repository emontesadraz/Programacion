package boletin20;

public class Papagaio extends Aves implements IPodeCamiñar {

    @Override
    public void voa() {
        System.out.println("Os papagaios tamén poden voar");
    }
    

    @Override
    public void anda() {
        System.out.println("Os papagaios andan");
        }

}
