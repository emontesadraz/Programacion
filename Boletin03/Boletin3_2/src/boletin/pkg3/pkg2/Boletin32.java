/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin.pkg3.pkg2;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float ºC;
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclear temperatrura ºC");
        ºC= sc.nextFloat();
        float F=(ºC*9/5)+32;
        float K= ºC+273;
        System.out.println("Farenheit="+F+"\n Kelvin="+K);
         
                
    }
    
}
