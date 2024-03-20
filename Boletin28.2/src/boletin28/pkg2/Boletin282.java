package boletin28.pkg2;

public class Boletin282 {

    public static void main(String[] args) {
        Caja <Integer> cajaEntero = new Caja<>();
        cajaEntero.agregar(123);
        System.out.println("Esta caja almacena un entero: "+ cajaEntero.obtener());
        
        // Ahora hacemos una caja tipo String
        Caja <String> cajaString = new Caja<>();
        cajaString.agregar("Hola mundo");
        System.out.println("Esta caja almacena un string: "+ cajaString.obtener());
        
        //Ahora con el método empleado del apartado anterior, hacemos una caja tipo empleado
        Empleados empleado = new Empleados ("Juan","Informatico", 1350);
        Caja <Empleados> cajaEmpleados = new Caja<>();
        cajaEmpleados.agregar(empleado);
        System.out.println("Esta caja almacena empleados: "+ cajaEmpleados.obtener());
    }

}