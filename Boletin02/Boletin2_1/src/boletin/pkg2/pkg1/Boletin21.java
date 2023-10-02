/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin.pkg2.pkg1;

/**
 *
 * @author dam1
 */
public class Boletin21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float lado= 3;
        float area= lado*lado;
        // tamen
        area=(float) Math.pow(lado,2);
        System.out.println("area="+area);
        // sen declarar a variable area
        System.out.println("area2 ="+ lado*lado);
    }
    
}
