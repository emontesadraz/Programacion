package boletin29.pkg3.pkg2;

class Motocicleta implements Vehiculo{

    @Override
    public void arrancar() {
        System.out.println("La moto ha arrancado");    
    }

    @Override
    public void acelerar() {
        System.out.println("La moto ha acelerado");
    }

    @Override
    public void detener() {
        System.out.println("La moto se ha detenido");
    }
    
}
