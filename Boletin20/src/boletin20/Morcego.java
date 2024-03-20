package boletin20;

public class Morcego extends Mamifero implements IPodeVoar {

    @Override
    public void anda() {
        System.out.println("Os morcegos poden camiñar");
    }

    @Override
    public void voa() {
        System.out.println("Os morcegos tamén poden voar");
    }
    

}
