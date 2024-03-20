package boletin29.pkg4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Boletin294 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Introduce el primer número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Introduce el segundo número: ");
            double numero2 = scanner.nextDouble();

            double resultado = dividir(numero1, numero2);
            System.out.println("El resultado de la división es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Entrada inválida. Debes ingresar un número.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero. No se puede dividir por cero.");
        }
    }

    public static double dividir(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("División por cero");
        }
        return numero1 / numero2;
    }

}
