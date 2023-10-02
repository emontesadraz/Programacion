/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin.pkg3.pkg4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin34 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Pedir al usuario la cantidad en euros
        System.out.print("Introduce una cantidad en euros: ");
        int cantidadEuros = sc.nextInt();
        
        // Calcular el desglose en billetes de 100
        int billetes100 = cantidadEuros / 100;
        cantidadEuros %= 100;
        
        // Calcular el desglose en billetes de 20
        int billetes20 = cantidadEuros / 20;
        cantidadEuros %= 20;
        
        // Calcular el desglose en billetes de 5
        int billetes5 = cantidadEuros / 5;
        cantidadEuros %= 5;
        
        // La cantidad restante es el desglose en monedas de 1 euro
        int monedas1 = cantidadEuros;
        
        // Mostrar el desglose
        System.out.println("Desglose en billetes de 100: " + billetes100);
        System.out.println("Desglose en billetes de 20: " + billetes20);
        System.out.println("Desglose en billetes de 5: " + billetes5);
        System.out.println("Desglose en monedas de 1 euro: " + monedas1);
    }
    
}
