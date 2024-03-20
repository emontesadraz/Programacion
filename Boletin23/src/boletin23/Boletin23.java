package boletin23;

public class Boletin23 {

    public static void main(String[] args) {

        String texto = "Esto é Java!";
        int longitud = texto.length();
        System.out.println("Longitud del texto: " + longitud);

        String palabra = "Java";
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println(palabra.charAt(i));
        }

        String txt = "Java desde 0";
        String invertido = new StringBuilder(texto).reverse().toString();
        System.out.println("Texto invertido: " + invertido);

        String nuevoTexto = "James Gosling Created Xava";
        String sinEspacios = texto.replaceAll("\\s", "");
        System.out.println("Texto sin espacios: " + sinEspacios);

        String nTexto = "java java java";
        int vocales = texto.replaceAll("[^aeiouAEIOU]", "").length();
        int consonantes = texto.replaceAll("[aeiouAEIOU\\s]", "").length();
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);

        String text = "www.javadesde0.com";
        int index = texto.indexOf(" ");
        String parte1 = texto.substring(0, index);
        String parte2 = texto.substring(index + 1);
        System.out.println("Parte 1: " + parte1);
        System.out.println("Parte 2: " + parte2);
        String concatenado = parte1 + parte2;
        System.out.println("Texto concatenado: " + concatenado);

        String txto = "javeros";
        String mayusculas = texto.toUpperCase();
        System.out.println("Mayúsculas: " + mayusculas);
        String minusculas = mayusculas.toLowerCase();
        System.out.println("Minúsculas: " + minusculas);

        String texto1 = "Java";
        String texto2 = "JavaScript";
        boolean iguales = texto1.equals(texto2);
        System.out.println("¿Son iguales?: " + iguales);

        String newTxt = "Jeve jeve jeve";
        String resultado = texto.replaceAll("[aeiouAEIOU]", "a");
        System.out.println("Texto modificado: " + resultado);

        String siglas = "ABCD";
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            int ascii = (int) caracter;
            System.out.println(caracter + ": " + ascii);
        }
    }
}