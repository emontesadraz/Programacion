package boletin121;

import java.util.Scanner;

public class Garaxe {
    Coche obx = new Coche();
    

    private int numeroCoches = 0;

    public Garaxe() {
    }

    public Garaxe(int numeroCoches, String matricula, String marca) {
        this.numeroCoches = numeroCoches;

    }

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }

    @Override
    public String toString() {
        return "Garaxe{" + "numeroCoches=" + numeroCoches + '}';
    }

    /**
     * Comprueba que haya plazas disponibles
     */
    public void amosarCoches() {
        if (numeroCoches >= 0 && numeroCoches < 5) {
            System.out.println("PLAZAS DISPOÑIBLES ");
            numeroCoches++;
        } else {
            System.out.println("COMPLETO ");
        }
    }

    /**
     * Comprueba la factura del coche que ha entrado
     * Esto es para hacer un ejemplo
     */
    public void amosarPrezos() {
        Scanner sc = new Scanner(System.in);
        int horas = 0;
        float prezo;
        float total;
        System.out.println("Matricula: ");
        obx.setMatricula(sc.nextLine());
        System.out.println("Numero de horas ");
        horas = sc.nextInt();
        if (horas >= 0 && horas < 3) {
            prezo = 1.5f;
            total = prezo;
        } else {
            prezo = 0.2f;
            total = 1.5f + (prezo * (horas - 3));
        }
        System.out.println("FACTURA: " + total + " \nMATRICULA: " + obx.getMatricula() + "\nTEMPO: " + horas
                + " \nPRECIO: " + prezo);
        System.out.println("Introduce el dinero a pagar ");
        float dinero = sc.nextFloat();
        float recibo = dinero - total;
        System.out.println("La vuelta es: " + recibo);
        
        System.out.println("GRACIAS POR USAR O NOSO APARCADOIRO ");

    }
}
