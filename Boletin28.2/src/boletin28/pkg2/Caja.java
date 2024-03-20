
package boletin28.pkg2;


public class Caja <T>{
    private T objeto;
    
    public void agregar (T objeto){
        this.objeto = objeto;
    }
    
    public T obtener(){
        return objeto;
    }
}
