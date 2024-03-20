package boletin28.pkg3;

public class Circulo extends FiguraGeometrica {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void calcularArea() {
        double area = Math.PI * (radio * radio);
        System.out.println("El area de este circulo es de: " + area + " metros");
    }

}
