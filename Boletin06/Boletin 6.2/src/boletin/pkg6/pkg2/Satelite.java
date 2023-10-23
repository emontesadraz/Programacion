/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin.pkg6.pkg2;

/**
 *
 * @author dam1
 */
public class Satelite {

    private double meridiano;
    private double paralelo;
    private double distanciaTerra;

    public Satelite() {

        meridiano = paralelo = distanciaTerra = 0;
    }

    public Satelite(double m, double p, double d) {

        meridiano = m;
        paralelo = p;
        distanciaTerra = d;
    }

    public void verPosicion() {

        System.out.println("O satelite atópase no paralelo" + paralelo + "meridiano"
                + meridiano + "a unha distancia da Terra" + distanciaTerra);
    }
}
