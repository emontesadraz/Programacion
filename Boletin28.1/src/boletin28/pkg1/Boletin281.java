package boletin28.pkg1;

import java.util.Scanner;

public class Boletin281 {

    public static void main(String[] args) {
        GestorDeEmpleados gest = new GestorDeEmpleados();
        Empleados emp = new Empleados();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Añadir un empleado \n2. Mostrar empleados \n3. Buscar empleados \n0. Salir del programa");
            System.out.println("Indique lo que quiere hacer");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Nombre del empleado: ");
                    String nombre = sc.nextLine();
                    System.out.println("Introduce el departamento: ");
                    String departamento = sc.nextLine();
                    System.out.println("Introduce el salario: ");
                    int salario = sc.nextInt();
                    Empleados nuevoEmpleado = new Empleados(nombre, departamento, salario);
                    gest.agregarEmpleados(nuevoEmpleado);
                    break;
                case 2:
                    System.out.println("Empleados en plantilla: ");
                    gest.mostrarEmpleados();
                    break;

                case 3:
                    System.out.println("Nombre del empleado a buscar: ");
                    String nombreBuscar = sc.nextLine();
                    Empleados empleadoBuscar = gest.buscarEmpleadoPorNombre(nombreBuscar);
                    if (empleadoBuscar != null){
                        System.out.println("Información del empleado "+ empleadoBuscar+": ");
                        System.out.println("Departamento: "+ gest.getDepartamento() +"\nSalario: "+ gest.getSalario());
                    }else{
                        System.out.println("Este empleado no existe");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no disponible");
                    break;
            }  
        }while (opcion != 0);
    }

}
