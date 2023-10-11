/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin.pkg4;

/**
 *
 * @author dam1
 */
public class Boletin4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro obx = new Libro();
        obx.setTitulo("Las brujas");
        obx.setAutor("Roald Dahl");
        obx.setAno(1983);
        obx.setNumPaginas((short) 158);
        
        
       Libro obx1 = new Libro("El cantar de mio cid", "anonimo", 460, (short) 400);
       obx.amosar();
       obx1.amosar();
    }
    
}
