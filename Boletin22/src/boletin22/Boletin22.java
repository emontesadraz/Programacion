package boletin22;

import java.util.*;


public class Boletin22 {

    public static void main(String[] args) {
        // Crear la tabla de goles marcados por cada equipo en cada jornada
        Map<String, List<Integer>> tablaGoles = new HashMap<>();
        
        // Añadir datos a la tabla (estos datos podrían ser ingresados manualmente o desde algún otro origen de datos)
        // Aquí se muestra un ejemplo con datos predefinidos
        tablaGoles.put("Celta", Arrays.asList(3, 4, 2));
        tablaGoles.put("Bilbao", Arrays.asList(1, 2, 1));
        tablaGoles.put("Malaga", Arrays.asList(3, 0, 1));
        
        // Imprimir la tabla de goles
        System.out.println("Tabla de goles:");
        imprimirTabla(tablaGoles);
        
        // Obtener una lista de equipos por orden de menor número de goles en la liga
        List<String> equiposOrdenados = ordenarEquiposPorGoles(tablaGoles);
        System.out.println("\nEquipos por orden de menor número de goles en la liga:");
        System.out.println(equiposOrdenados);
        
        // Indicar el equipo que marca más goles en cada jornada
        Map<Integer, String> equipoMasGolesPorJornada = obtenerEquipoMasGolesPorJornada(tablaGoles);
        System.out.println("\nEquipo que marca más goles en cada jornada:");
        System.out.println(equipoMasGolesPorJornada);
        
        // Determinar el equipo y la jornada con más goles
        String equipoMasGoles = null;
        int jornadaMasGoles = 0;
        int maxGoles = Integer.MIN_VALUE;
        for (String equipo : tablaGoles.keySet()) {
            List<Integer> golesEquipo = tablaGoles.get(equipo);
            for (int jornada = 0; jornada < golesEquipo.size(); jornada++) {
                if (golesEquipo.get(jornada) > maxGoles) {
                    equipoMasGoles = equipo;
                    jornadaMasGoles = jornada + 1; // Sumamos 1 porque las jornadas comienzan desde 1, no desde 0
                    maxGoles = golesEquipo.get(jornada);
                }
            }
        }
        System.out.println("\nEquipo con más goles: " + equipoMasGoles + ", Jornada: " + jornadaMasGoles + ", Goles: " + maxGoles);
        
        // Consultas por equipo y jornada indicando el número de goles
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el equipo: ");
        String equipoConsulta = scanner.nextLine();
        System.out.print("Ingrese la jornada: ");
        int jornadaConsulta = scanner.nextInt();
        int golesConsulta = tablaGoles.get(equipoConsulta).get(jornadaConsulta - 1); // Restamos 1 porque las jornadas comienzan desde 1, no desde 0
        System.out.println("Número de goles de " + equipoConsulta + " en la jornada " + jornadaConsulta + ": " + golesConsulta);
        scanner.close();
    }
    
    // Método para imprimir la tabla de goles
    static void imprimirTabla(Map<String, List<Integer>> tablaGoles) {
        System.out.printf("%-15s", "Equipo");
        for (int i = 1; i <= tablaGoles.get(tablaGoles.keySet().iterator().next()).size(); i++) {
            System.out.printf("%-5s", "X" + i);
        }
        System.out.println();
        
        for (String equipo : tablaGoles.keySet()) {
            System.out.printf("%-15s", equipo);
            for (int goles : tablaGoles.get(equipo)) {
                System.out.printf("%-5d", goles);
            }
            System.out.println();
        }
    }
    
    // Método para obtener una lista de equipos por orden de menor número de goles en la liga
    static List<String> ordenarEquiposPorGoles(Map<String, List<Integer>> tablaGoles) {
        List<String> equiposOrdenados = new ArrayList<>(tablaGoles.keySet());
        equiposOrdenados.sort(Comparator.comparingInt(equipo -> tablaGoles.get(equipo).stream().mapToInt(Integer::intValue).sum()));
        return equiposOrdenados;
    }
    
    // Método para obtener el equipo que marca más goles en cada jornada
    static Map<Integer, String> obtenerEquipoMasGolesPorJornada(Map<String, List<Integer>> tablaGoles) {
        Map<Integer, String> equipoMasGolesPorJornada = new HashMap<>();
        for(String equipo : tablaGoles.keySet()) {
            List<Integer> golesEquipo = tablaGoles.get(equipo);
            for (int jornada = 0; jornada < golesEquipo.size(); jornada++) {
                int golesJornadaActual = golesEquipo.get(jornada);
                if (!equipoMasGolesPorJornada.containsKey(jornada) || golesJornadaActual > golesEquipo.get(jornada)) {
                    equipoMasGolesPorJornada.put(jornada, equipo);
                }
            }
        }
        return equipoMasGolesPorJornada;
    }
}