/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin.pkg3.pkg1;

import java.util.Scanner;

/**
 * hoola
 * @author dam1
 */
public class Boletin31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float  tarifa,pagado;
       Scanner sc = new Scanner(System.in);
       System.out.println("Teclea tarifa");
       tarifa= sc.nextFloat();
       System.out.println("Teclear pago");
       pagado = sc.nextFloat();
       float desconto= (tarifa-pagado)/tarifa*100;
       System.out.println("porcentaxe descontada="+desconto+"%");
    }
    
}
