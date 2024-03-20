package boletin24;

import java.util.Scanner;

public class Boletin24 {

    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú: ");
            System.out.println("1. Engadir libro");
            System.out.println("2. Vender libro");
            System.out.println("3. Amosar libros");
            System.out.println("4. Dar de baixa libros");
            System.out.println("5. Consultar libro");
            System.out.println("0. Sair");
            System.out.println("Escolle unha opción");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Título: ");
                    String titulo = sc.nextLine();
                    System.out.println("Autor: ");
                    String autor = sc.nextLine();
                    System.out.println("ISBN: ");
                    String ISBN = sc.nextLine();
                    System.out.println("Prezo: ");
                    double prezo = sc.nextDouble();
                    System.out.println("Número de unidades: ");
                    int unidades = sc.nextInt();
                    Libro nuevoLibro = new Libro (titulo, autor, ISBN, prezo, unidades);
                    libreria.engadirLibro(nuevoLibro);
                    break;
                case 2:
                    System.out.println("Titulo del libro a vender: ");
                    String tituloVender = sc.nextLine();
                    Libro libroVender = libreria.consultarLibro(tituloVender);
                    if (libroVender != null){
                        libreria.venderLibro(libroVender);
                        System.out.println("Libro vendido con éxito");
                    }else {
                        System.out.println("El libro no se encuentra en la libreria");
                    }
                    break;
                case 3:
                    System.out.println("Libros en la libreria: ");
                    libreria.amosarLibros();
                    break;
                case 4:
                    libreria.darDeBaja();
                    System.out.println("Libros con números de unidades igual a 0 dados de baja");
                    break;
                case 5:
                    System.out.println("Titulo del libro a consultar: ");
                    String tituloConsultar = sc.nextLine();
                    Libro libroConsultar = libreria.consultarLibro(tituloConsultar);
                    if (libroConsultar != null){
                        System.out.println("Información del libro: ");
                        System.out.println(libroConsultar);
                    }else {
                        System.out.println("El libro no se encuentra en la libreria");
                    }
                    break;
                case 0:
                    System.out.println("Saliendo del preograma...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, escoge una opción válida");
            }
        }while(opcion != 0);

    }

}
