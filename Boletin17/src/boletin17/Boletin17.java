package boletin17;

public class Boletin17 {

    public static void main(String[] args) {
        Persoa cliente1 = new Persoa("Álvaro", "Pérez", "12345B");
        Persoa cliente2 = new Persoa("Paula", "Martínez", "71223G");

        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(1111, 0, cliente1);
        CuentaAhorro cuentaAhorro2 = new CuentaAhorro(0.5, 1500, 2222, 150, cliente2);

        cuentaCorriente1.ingresar(100);
        cuentaAhorro2.ingresar(1000);

        cuentaCorriente1.actualizarSaldo();
        
        cuentaCorriente1.retirar(25);
        cuentaAhorro2.retirar(450);
        
        cuentaAhorro2.actualizarSaldo();
    }

}
