package boletin17;

public class CuentaAhorro extends Conta{
    private double intereseVariable;
    private int saldoMinimo;

    public CuentaAhorro() {
    }

    public CuentaAhorro(double intereseVariable, int saldoMinimo, int numeroConta, double saldo, Persoa cliente) {
        super(numeroConta, saldo, cliente);
        this.intereseVariable = intereseVariable;
        this.saldoMinimo = saldoMinimo;
    }

    public double getIntereseVariable() {
        return intereseVariable;
    }

    public void setIntereseVariable(double intereseVariable) {
        this.intereseVariable = intereseVariable;
    }

    public int getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(int saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }
    @Override
     public void actualizarSaldo(){
        if(getSaldo() >= saldoMinimo){
            setSaldo(getSaldo() * 1 + intereseVariable / 100.0);
            System.out.println("El nuevo saldo de tu cuenta ahorro es: "+getSaldo()+ " €");
        }
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "intereseVariable=" + intereseVariable + ", saldoMinimo=" + saldoMinimo + '}';
    }

}
