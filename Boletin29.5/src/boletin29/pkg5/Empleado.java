
package boletin29.pkg5;

import java.io.Serializable;


public class Empleado implements Serializable {
     private static final long serialVersionUID = 1L;
     
     private String nombre;
     private int id;
     private String departamento;

    public Empleado() {
    }

    public Empleado(String nombre, int id, String departamento) {
        this.nombre = nombre;
        this.id = id;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", id=" + id + ", departamento=" + departamento + '}';
    }
     
     

}
