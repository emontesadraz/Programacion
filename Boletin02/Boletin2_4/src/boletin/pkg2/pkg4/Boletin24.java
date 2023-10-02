/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin.pkg2.pkg4;

import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double nº1,nº2;
        Scanner sc= new Scanner(System.in);
        System.out.println("Teclea nº1");
        nº1= sc.nextFloat();
        System.out.println("Teclea nº2");
        nº2= sc.nextFloat();
        double suma= nº1+nº2;
        double resta= nº1-nº2;
        double producto= nº1*nº2;
        double cociente= nº1/nº2;
        System.out.println("suma="+suma+"\n resta="+resta+"\n producto="+producto+ "\n cociente="+cociente);
    }
    
}
