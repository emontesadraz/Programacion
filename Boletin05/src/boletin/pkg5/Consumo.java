/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin.pkg5;

/**
 *
 * @author dam1
 */
public class Consumo {

    // atributos
    private int km;
    private int litros;
    private int vMed;
    private double pGas;

    // constructor
    public Consumo() {

    }

    //constructores parametrizados
    public Consumo(int km, int litros, int vMed, double pGas) {
        this.km = km;
        this.litros = litros;
        this.vMed = vMed;
        this.pGas = pGas;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public void setvMed(int vMed) {
        this.vMed = vMed;
    }

    public void setpGas(double pGas) {
        this.pGas = pGas;
    }

    public int getTempo() {
        int tempo = km / vMed;
        return tempo;
    }

    public double getConsumoMedio() {
        double consumoMedio = (double) litros / km * 100;
        return consumoMedio;
    }

    public double getConsumoEuros() {
        double consumoEuros = ((double) litros / km * 100) * pGas;
        return consumoEuros;
    }
}
