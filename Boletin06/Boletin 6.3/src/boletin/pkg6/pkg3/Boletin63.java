package boletin.pkg6.pkg3;

import java.util.Scanner;

/**
 *
 * @author p
 */
public class Boletin63 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduceme el radio: ");
        double radio = sc.nextDouble();
        Circulo obx = new Circulo(radio);

        obx.calcularArea();
        obx.calcularLonxitude();

    }

}
