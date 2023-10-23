package boletin.pkg6.pkg3;


public class Circulo {

    // atributos
    private double radio;
// Constructores

    public Circulo() {
    }
// constructor parametrizado

    public Circulo(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void calcularArea() {
        double area = Math.pow(radio, 2) * Math.PI;
        System.out.println("Area: "+area);
    }

    public void calcularLonxitude() {
        double lonxitude = 2 * Math.PI * radio;
        System.out.println("Loxitude: "+lonxitude);
    }
}
