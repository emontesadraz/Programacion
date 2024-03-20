package boletin21.pkg4;

import java.util.Scanner;

public class Boletin214 {

    public static void main(String[] args) {
        // Pedir al usuario que introduzca el número de DNI
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de DNI (sin letra): ");
        int dni = scanner.nextInt();
        scanner.close();

        // Calcular el resto de la división del DNI entre 23
        int resto = dni % 23;

        // Definir la tabla de letras asociadas a cada resto
        char[] letrasNIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        // Obtener la letra del NIF correspondiente al resto
        char letraNIF = letrasNIF[resto];

        // Mostrar la letra del NIF
        System.out.println("La letra del NIF es: " + letraNIF);
    }
}
