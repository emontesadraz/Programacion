/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin.pkg2.pkg5;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double millas;
      final int VALOR= 1852;
      Scanner sc= new Scanner(System.in);
      System.out.println("Teclear distancia");
      millas= sc.nextFloat();
      double metros = millas* VALOR;
      System.out.println(millas+"millas="+metros+"metros");
       
    }
    
}
