package boletin29.pkg5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Boletin295 {

    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new Empleado("Roberto", 12, "Informatico"));
        listaEmpleados.add(new Empleado("Elena", 11, "Informatica"));
        listaEmpleados.add(new Empleado("Jorge", 10, "Secretario"));
        
         // Guardar la lista de empleados en un archivo
        guardarEmpleados(listaEmpleados, "empleados.dat");

        // Cargar la lista de empleados desde el archivo
        List<Empleado> empleadosCargados = cargarEmpleados("empleados.dat");

        // Imprimir los empleados cargados
        System.out.println("Empleados cargados:");
        for (Empleado empleado : empleadosCargados) {
            System.out.println(empleado);
        }
    }
         

    

     public static void guardarEmpleados(List<Empleado> empleados, String nombreArchivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            outputStream.writeObject(empleados);
            System.out.println("Empleados guardados correctamente en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar los empleados: " + e.getMessage());
        }
    }

    public static List<Empleado> cargarEmpleados(String nombreArchivo) {
        List<Empleado> empleados = new ArrayList<>();
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            empleados = (List<Empleado>) inputStream.readObject();
            System.out.println("Empleados cargados correctamente desde " + nombreArchivo);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los empleados: " + e.getMessage());
        }
        return empleados;
    }
}
