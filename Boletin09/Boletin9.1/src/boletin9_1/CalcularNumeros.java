package boletin9_1;

import java.util.Scanner;

public class CalcularNumeros {
    
    Scanner scanner = new Scanner(System.in);

    public void sumarNum() {
        

        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        int contador = 0;

        while (contador < 10) {
            System.out.print("Ingrese un número entero: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }

            contador++;
        }

        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de ceros: " + ceros);
    }

}