package boletin20;

public class Felino implements IPodeCamiñar,IPodeNadar {

    @Override
    public void anda() {
        System.out.println("Os felinos poden andar");
    }

    @Override
    public void nada() {
        System.out.println("Os felinos poden nadar");
    }

}
