package boletin29.pkg2;

public class Caja<T> {
    private T objeto;
    
    public void engadir (T objeto){
        this.objeto = objeto;
    }
    public T obtener(){
        return objeto;
    }
}
