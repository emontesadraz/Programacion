/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin.pkg4;

/**
 *
 * @author dam1
 */
public class Libro {

    // atributos
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;

    // construtores 
    public Libro() {

    }
    // construtor parametrizado

    public Libro(String titulo, String autor, int ano, short numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.numPaginas = numPaginas;

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setNumPaginas(short numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public short getNumPaginas() {
        return numPaginas;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void amosar() {
        System.out.println("titulo: " + titulo + "\n autor: " + autor
                + "\n numero " + "Paginas: " + numPaginas + "\n valoracion: "
                + valoracion);

    }

}
