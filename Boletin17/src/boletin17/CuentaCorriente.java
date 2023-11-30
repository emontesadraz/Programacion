package boletin17;

public class CuentaCorriente extends Conta {
    private final double INTERESE = 1.5;

    public CuentaCorriente(int numeroConta, double saldo, Persoa cliente) {
        super(numeroConta, saldo, cliente);
    }

    public CuentaCorriente() {
    }

    public double getIntereseFixo() {
        return INTERESE;
    }
    @Override
   public void actualizarSaldo(){
        setSaldo(getSaldo() * (1+INTERESE/100.0));
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "INTERESE=" + INTERESE + '}';
    }

}
