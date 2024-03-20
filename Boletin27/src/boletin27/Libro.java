package boletin27;

public class Libro {
    public String titulo;
    public String autor;
    public double prezo;
    public int unidades;

    public Libro(String titulo, String autor,double prezo, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    public Libro() {
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", prezo=" + prezo + ", unidades=" + unidades + '}';
    }
    public void modificarPrezo(double nuevoPrezo) {
        this.prezo = nuevoPrezo;
    }

}
