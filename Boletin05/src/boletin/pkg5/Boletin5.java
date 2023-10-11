/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin.pkg5;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletin5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce kilometros : ");
        int km = sc.nextInt();
        System.out.print("Introduce litros : ");
        int litros = sc.nextInt();
        System.out.print("Introduce velocidad media : ");
        int vMed = sc.nextInt();
        System.out.print("Introduce precio gasolina : ");
        double pGas = sc.nextDouble();
        // constructor
        Consumo obx = new Consumo();
        obx.setLitros(50);
        obx.setpGas(1.57);
        // constructor parametrizado
        Consumo obx2 = new Consumo(km, litros, vMed, pGas);
        System.out.println("Consumo Medio=" + obx2.getConsumoMedio());
        System.out.println("Litros consumidos=" + litros);
        System.out.println("Velocidade Media=" + vMed);

    }

}
