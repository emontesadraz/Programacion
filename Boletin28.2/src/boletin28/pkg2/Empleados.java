package boletin28.pkg2;

public class Empleados {
    String nombre;
    String departamento;
    int salario;

    public Empleados() {
    }

    public Empleados(String nombre, String departamento, int salario) {
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", departamento=" + departamento + ", salario=" + salario + '}';
    }
    

}
