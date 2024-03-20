package boletin24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Libreria {

    ArrayList<Libro> libreria = new ArrayList<>();

    public void engadirLibro(Libro libro) {
        libreria.add(libro);
    }

    public void venderLibro(Libro libro) {
        libreria.remove(libro);
    }

    public void amosarLibros() {
        Collections.sort(libreria, Comparator.comparing(Libro::getTitulo));
        for (Libro libro : libreria) {
            System.out.println(libro);
        }
    }
    public void darDeBaja (){
        libreria.removeIf(libro -> libro.getUnidades() == 0);
    }
    public Libro consultarLibro (String titulo){
        for (Libro libro : libreria){
            if (libro.getTitulo().equals(titulo)){
                return libro;
            }
        }
        return null;
    }
}
