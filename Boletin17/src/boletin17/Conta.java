package boletin17;

import java.util.Scanner;

public class Conta {

    private int numeroConta;
    private double saldo;
    private Persoa cliente;

    public Conta() {
    }

    public Conta(int numeroConta, double saldo, Persoa cliente) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persoa getCliente() {
        return cliente;
    }

    public void setCliente(Persoa cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta{" + "numeroConta=" + numeroConta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }

    public void ingresar(double ingreso) {
        saldo += ingreso;
        System.out.println("Se han ingresado una cantidad de " + ingreso + " €");
    }

    public void retirar(double retiro) {
        saldo -= retiro;
        if (retiro > saldo) {
            System.out.println("No se ha podido realizar la opereación");
            
        }else{
            System.out.println("Se han retirado una cantidad de "+retiro+" €");
        }
    }
    public void actualizarSaldo(){
        
    }
}
