
package boletin.aleatorio2;

import javax.swing.JOptionPane;


public class Comparacion {
    public void amosarComparacion(){
        String palabra1 = JOptionPane.showInputDialog(" Introduce una palabra ");
        String palabra2 = JOptionPane.showInputDialog(" Introduce otra palabra ");
        if(palabra1.toLowerCase().equals(palabra2.toLowerCase())){
            System.out.println(" Son iguales ");
        }else{
            System.out.println(" No son iguales ");
        }
    }
            
}
