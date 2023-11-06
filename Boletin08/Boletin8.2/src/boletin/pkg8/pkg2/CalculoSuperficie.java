package boletin.pkg8.pkg2;

import java.util.Scanner;

public class CalculoSuperficie {

    Scanner sc = new Scanner(System.in);
    float lado;
    float area;
    float base;
    float altura;
    float radio;

    public void verCuadrado() {
        System.out.println(" Introduce valor del lado");
        lado = sc.nextFloat();
        area = lado * lado;
        System.out.println(" La superficie del cuadrado es: " + area);
    }

    public void verTriangulo() {
        System.out.println(" Introduce valor de la base");
        base = sc.nextFloat();
        System.out.println(" Introducir valor de la altura ");
        altura = sc.nextFloat();
        area = (int) (base * altura * 0.5);
        System.out.println(" La superficie del triángulo es: " + area);
    }

    public void verCirculo() {
        System.out.println(" Introduce valor del radio");
        radio = sc.nextFloat();

        area = (float) (Math.PI * radio * radio);
        System.out.println(" La superficie del circulo es: " + area);
    }

    public void seleccionarCaso() {
        System.out.println(" Elige: \n1. Cuadrado \n2. Triangulo \n3. Circulo");
        int caso = sc.nextInt();
        switch (caso) {
            case 1:
                verCuadrado();
                break;
            case 2:
                verTriangulo();
                break;
            case 3:
                verCirculo();
                break;

        }
    }

}
