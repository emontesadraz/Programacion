package boletin29.pkg6.pkg2;

import java.util.HashSet;
import java.util.Iterator;

public class Boletin2962 {

    public static void main(String[] args) {
        // Crear un HashSet de números enteros
        HashSet<Integer> conjuntoNumeros = new HashSet<>();

        // Añadir algunos valores al HashSet
        conjuntoNumeros.add(10);
        conjuntoNumeros.add(20);
        conjuntoNumeros.add(30);
        conjuntoNumeros.add(40);

        // Mostrar el HashSet antes de eliminar valores
        System.out.println("HashSet antes de eliminar valores:");
        System.out.println(conjuntoNumeros);

        // Eliminar valores específicos iterando con un Iterator
        Iterator<Integer> iterator = conjuntoNumeros.iterator();
        while (iterator.hasNext()) {
            int valor = iterator.next();
            if (valor == 20 || valor == 40) {
                iterator.remove();
            }
        }

        // Mostrar el HashSet después de eliminar valores
        System.out.println("HashSet después de eliminar valores:");
        System.out.println(conjuntoNumeros);
    }

}
