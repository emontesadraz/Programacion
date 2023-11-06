package boletin.pkg9.pkg4;

import java.util.Scanner;

public class Multiplicar {

    public void calcularTabla() {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("O programa rematou.");
                break;
            }

            System.out.println("Tabla de multiplicar do " + numero + ":");

            int i = 1;
            while (i <= 10) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
                i++;
            }
        } while (true);

    }
}
