/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin.pkg2.pkg3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float euros,cambio = 0;
        Scanner sc = new Scanner (System.in);
        System.out.println("teclea euros");
        euros= sc.nextFloat();
        System.out.println("Teclea el cambio");
        cambio= sc.nextFloat();
        float dolares= euros*cambio;
        System.out.println("$="+dolares);
        
    }
    
}
