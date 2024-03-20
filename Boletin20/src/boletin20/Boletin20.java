package boletin20;

public class Boletin20 {

    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero();
        
        Felino fel = new Felino();
        
        Aves ave = new Aves();
        
        Gato gato = new Gato();

        Papagaio papa = new Papagaio();
        
        Avestruz av = new Avestruz();
        
        Morcego mor = new Morcego();
        
        Tigre tig = new Tigre();

        mamifero.anda();
        fel.anda();
        fel.nada();
        ave.voa();
        gato.anda();
        gato.nada();
        papa.anda();
        mor.anda();
        mor.voa();  
        tig.anda();
        tig.nada();

    }

}
