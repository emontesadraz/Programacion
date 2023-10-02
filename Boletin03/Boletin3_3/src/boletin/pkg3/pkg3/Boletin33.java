/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin.pkg3.pkg3;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int cien, veinte, cinco, uno;
       Scanner sc = new Scanner(System.in);
       System.out.println("Teclea billetes de 100");
       cien= sc.nextInt();
       System.out.println("Teclea billetes de 20");
       veinte= sc.nextInt();
       System.out.println("Teclea billetes de 5");
       cinco= sc.nextInt();
       System.out.println("Teclea monedas de 1");
       uno= sc.nextInt();
       int suma= (cien*100)+(veinte*20)+(cinco*5)+(uno*1);
       System.out.println("Total="+suma);
    }
    
}
