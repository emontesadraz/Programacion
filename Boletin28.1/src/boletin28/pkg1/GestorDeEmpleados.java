package boletin28.pkg1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GestorDeEmpleados extends Empleados {

    ArrayList<Empleados> gestor = new ArrayList<>();

    public void agregarEmpleados(Empleados empleados) {
        gestor.add(empleados);
    }

    public void mostrarEmpleados() {
        for (Empleados empleados : gestor) {
            System.out.println("Nombre: "+ empleados.getNombre());
            System.out.println("Departemento: "+ empleados.getDepartamento());
            System.out.println("Salario: "+ empleados.getSalario());
        }
    }

    public Empleados buscarEmpleadoPorNombre(String nombre) {
        for (Empleados empleados : gestor) {
            if (empleados.getNombre().equals(nombre)) {
                return empleados;
            }
        }
        return null;
    }
}
