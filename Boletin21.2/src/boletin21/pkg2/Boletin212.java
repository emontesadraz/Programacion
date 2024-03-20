package boletin21.pkg2;

import java.util.Arrays;

public class Boletin212 {

    public static void main(String[] args) {
        // Cargar el array con las notas de los alumnos
        int[] notas = cargarNotas();
        
        // Visualizar las notas de los alumnos
        System.out.println("Notas de los alumnos:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
        }

        // Visualizar el número de aprobados y suspensos
        visualizarAprobadosSuspensos(notas);

        // Calcular y visualizar la nota media de la clase
        double notaMedia = calcularNotaMedia(notas);
        System.out.println("Nota media de la clase: " + notaMedia);

        // Visualizar la nota más alta
        int notaMasAlta = obtenerNotaMasAlta(notas);
        System.out.println("Nota más alta de la clase: " + notaMasAlta);
    }

    // Método para cargar el array con las notas de los alumnos
    static int[] cargarNotas() {
        int numeroAlumnos = 30;
        int[] notas = new int[numeroAlumnos];

        // Generar notas aleatorias entre 0 y 10 (ambos inclusive)
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 11);
        }

        return notas;
    }

    // Método para visualizar el número de aprobados y suspensos
    static void visualizarAprobadosSuspensos(int[] notas) {
        int aprobados = 0;
        int suspensos = 0;

        for (int nota : notas) {
            if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }

        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspensos: " + suspensos);
    }

    // Método para calcular la nota media de la clase
    static double calcularNotaMedia(int[] notas) {
        int sumaNotas = 0;
        for (int nota : notas) {
            sumaNotas += nota;
        }

        return (double) sumaNotas / notas.length;
    }

    // Método para obtener la nota más alta
    static int obtenerNotaMasAlta(int[] notas) {
        Arrays.sort(notas); // Ordenar el array de notas
        return notas[notas.length - 1]; // Devolver la última nota (la más alta)
    }
}
