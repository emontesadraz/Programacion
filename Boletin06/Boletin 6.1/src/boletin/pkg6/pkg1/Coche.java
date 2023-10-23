/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin.pkg6.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author dam1
 */
public class Coche {

    private int velocidade;

    //constructor
    public Coche() {
        velocidade = 0;

    }

    public int getVelocidade() {
        velocidade = Integer.parseInt(JOptionPane.showInputDialog("velocidade: "));
        return velocidade;
    }

    public void acelerar() {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Aceleración: "));
         velocidade = velocidade + valor;
        // JOptionPane.showMessageDialog(null, "Se aceleró a: " + aceleracion + "Km/h");
        amosar();
    }

    public void frenar() {
        int menos = Integer.parseInt(JOptionPane.showInputDialog("Frenada: "));
         velocidade = velocidade - menos;
        // JOptionPane.showMessageDialog(null, "Se frenó a: " + frenar + "Km/h");
        amosar();
    }

    public void amosar() {
        JOptionPane.showMessageDialog(null, "o valor é igual a: " + velocidade + "Km/h");

    }
}
