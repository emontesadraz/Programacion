package boletin21.pkg3;

import java.util.Arrays;
import java.util.Scanner;

public class Boletin213 {

    public static void main(String[] args) {
        // Array con los nombres de los alumnos
        String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis", "Laura", "Carlos", "Sofía", "Pablo", "Elena",
                            "Diego", "Lucía", "Javier", "Isabel", "Mario", "Eva", "Alberto", "Carmen", "Daniel", "Rosa",
                            "Alejandro", "Sara", "Miguel", "Nuria", "Gonzalo", "Beatriz", "Ricardo", "Lorena", "Ignacio", "Raquel"};

        // Cargar el array con las notas de los alumnos
        int[] notas = cargarNotas();

        // Visualizar la nota de un alumno determinado
        visualizarNotaAlumno("María", nombres, notas);

        // Visualizar una lista con los nombres de los alumnos aprobados
        visualizarAlumnosAprobados(nombres, notas);

        // Visualizar una lista ordenada por orden creciente de notas
        visualizarListaOrdenada(nombres, notas);

        // Visualizar la nota de un alumno determinado introducido por teclado
        visualizarNotaAlumnoPorTeclado(nombres, notas);
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

    // Método para visualizar la nota de un alumno determinado
    static void visualizarNotaAlumno(String nombreAlumno, String[] nombres, int[] notas) {
        int indice = Arrays.asList(nombres).indexOf(nombreAlumno);
        if (indice != -1) {
            System.out.println("La nota de " + nombreAlumno + " es: " + notas[indice]);
        } else {
            System.out.println("El alumno " + nombreAlumno + " no está en la lista.");
        }
    }

    // Método para visualizar una lista con los nombres de los alumnos aprobados
    static void visualizarAlumnosAprobados(String[] nombres, int[] notas) {
        System.out.println("Alumnos aprobados:");
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(nombres[i]);
            }
        }
    }

    // Método para visualizar una lista ordenada por orden creciente de notas
    static void visualizarListaOrdenada(String[] nombres, int[] notas) {
        // Clonar los arrays para mantener el original intacto
        int[] notasOrdenadas = notas.clone();
        String[] nombresOrdenados = nombres.clone();

        // Ordenar las notas y los nombres al mismo tiempo
        for (int i = 0; i < notasOrdenadas.length - 1; i++) {
            for (int j = i + 1; j < notasOrdenadas.length; j++) {
                if (notasOrdenadas[i] > notasOrdenadas[j]) {
                    // Intercambiar las notas
                    int tempNota = notasOrdenadas[i];
                    notasOrdenadas[i] = notasOrdenadas[j];
                    notasOrdenadas[j] = tempNota;

                    // Intercambiar los nombres
                    String tempNombre = nombresOrdenados[i];
                    nombresOrdenados[i] = nombresOrdenados[j];
                    nombresOrdenados[j] = tempNombre;
                }
            }
        }

        // Visualizar la lista ordenada
        System.out.println("Lista de alumnos ordenada por orden creciente de notas:");
        for (int i = 0; i < notasOrdenadas.length; i++) {
            System.out.println(nombresOrdenados[i] + ": " + notasOrdenadas[i]);
        }
    }

    // Método para visualizar la nota de un alumno determinado introducido por teclado
    static void visualizarNotaAlumnoPorTeclado(String[] nombres, int[] notas) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del alumno: ");
        String nombreAlumno = scanner.nextLine();

        visualizarNotaAlumno(nombreAlumno, nombres, notas);

        scanner.close();
    }
}
