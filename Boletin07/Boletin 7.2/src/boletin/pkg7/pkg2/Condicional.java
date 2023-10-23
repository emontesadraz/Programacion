package boletin.pkg7.pkg2;

import java.util.Scanner;

public class Condicional {

    Scanner sc = new Scanner(System.in);

    public void verSuma() {
        System.out.println(" Introducir numero 1 ");
        short num1 = sc.nextShort();
        System.out.println(" Introducir numero 2 ");
        short num2 = sc.nextShort();
        short suma = (short) (num1 + num2);
        if (num1 >= num2) {
            short resta = (short) (num1 - num2);
            System.out.println(" Suma " + suma + "\n Resta "+ resta);
        } else {
            System.out.println(" Suma " + suma);
        }
    }

}
