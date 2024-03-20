package boletin29.pkg6.pkg1;

import java.util.ArrayList;

public class Boletin2961 {

    public static void main(String[] args) {
        // Crear un ArrayList de cadenas
        ArrayList<String> listaCadenas = new ArrayList<>();

        // Agregar algunas cadenas al ArrayList
        listaCadenas.add("Hola");
        listaCadenas.add("Mundo");
        listaCadenas.add("en");
        listaCadenas.add("Java");

        // Iterar sobre el ArrayList utilizando foreach e imprimir cada cadena
        for (String cadena : listaCadenas) {
            System.out.println(cadena);
        }
    }

}
