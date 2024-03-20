package boletin29.pkg3.pkg2;

public class Coche implements Vehiculo{

    @Override
    public void arrancar() {
        System.out.println("El coche ha arrancado");
    }

    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando");
    }

    @Override
    public void detener() {
        System.out.println("El coche se ha detenido");
    }

}
