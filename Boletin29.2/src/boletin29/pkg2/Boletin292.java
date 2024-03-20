package boletin29.pkg2;

public class Boletin292 {

    public static void main(String[] args) {
        Caja <Integer> cajaInt = new Caja <>();
        cajaInt.engadir(345);
        System.out.println("Esta caja contiene: "+cajaInt.obtener());
        
        Caja <String> cajaString = new Caja <>();
        cajaString.engadir("Acuarelas");
        System.out.println("Esta caja contiene: "+ cajaString.obtener());
        
        Caja <Double> cajaDouble = new Caja <>();
        cajaDouble.engadir(23.42);
        System.out.println("Esta caja contiene: "+ cajaDouble.obtener());
       

    }

}
