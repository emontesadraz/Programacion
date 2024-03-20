package boletin21;

import java.lang.reflect.Array;

public class Boletin21 {

    public static void main(String[] args) {

        int [] numeros = new int[6];

        for (int i = numeros.length - 1; i >= 0; i--) {
            numeros [i] = (int) (Math.random() * 50);
            
            System.out.println(numeros[i]);

        }

    }

}
