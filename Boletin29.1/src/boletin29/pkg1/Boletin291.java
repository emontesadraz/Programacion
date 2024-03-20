package boletin29.pkg1;

import java.util.Random;

public class Boletin291 {

    public static void main(String[] args) {
        // Definir las dimensiones del array bidimensional
        int filas = 3;
        int columnas = 4;

        // Crear el array bidimensional
        int[][] array = new int[filas][columnas];

        // Inicializar el array con valores aleatorios
        Random rand = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = rand.nextInt(100); // Genera valores aleatorios entre 0 y 99
            }
        }

        // Encontrar el valor máximo y su posición
        int maxValor = array[0][0];
        int maxFila = 0;
        int maxColumna = 0;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (array[i][j] > maxValor) {
                    maxValor = array[i][j];
                    maxFila = i;
                    maxColumna = j;
                }
            }
        }

        // Imprimir el array
        System.out.println("Array generado:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // Imprimir el valor máximo y su posición
        System.out.println("El valor máximo es: " + maxValor);
        System.out.println("Se encuentra en la posición fila: " + maxFila + ", columna: " + maxColumna);
    }
}
