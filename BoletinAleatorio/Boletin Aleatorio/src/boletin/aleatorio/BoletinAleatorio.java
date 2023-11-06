
package boletin.aleatorio;

import java.util.Random;

public class BoletinAleatorio {

    public static void main(String[] args) {
          // Crear un objeto Random para generar números aleatorios
        Random random = new Random();

        // Generar un número aleatorio entre 1 y 40
        int numeroAleatorio = random.nextInt(40) + 1;

        // Mostrar el número aleatorio
        System.out.println("Número aleatorio entre 1 y 40: " + numeroAleatorio);
    }

}
