
package boletin.pkg9.pkg3;


public class Datos {
    public void amosarDatos(){
        float base=LerDatos.lerFloatPositivo(" Introduce valor base ");
        float altura=LerDatos.lerFloatPositivo(" Introduce valor altura ");
        float area = base*altura;
        System.out.println(" El area es: "+area);
    }
}
