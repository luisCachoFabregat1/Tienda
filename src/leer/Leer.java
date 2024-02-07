package leer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer {

    private static final BufferedReader flujoEntrada = new BufferedReader(new InputStreamReader(System.in));

    // Método para leer una línea de texto desde la consola y eliminar espacios extra.
    public static String dato() {
        try {
            return flujoEntrada.readLine().trim();
        } catch (IOException e) {
            System.err.println("Error al leer entrada: " + e.getMessage());
            return "";
        }
    }

    /**
     * Método para leer un entero desde la consola.
     * Convierte la entrada de texto a un valor entero. En caso de error de formato, muestra un mensaje y retorna 0.
     */
    public static int datoInt() {
        try {
            return Integer.parseInt(dato());
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir a entero: " + e.getMessage());
            return 0;
        }
    }

    /**
     * Método para leer un flotante desde la consola.
     * Convierte la entrada de texto a un valor flotante. En caso de error de formato, muestra un mensaje y retorna 0.0f.
     */
    public static float datoFloat() {
        try {
            return Float.parseFloat(dato());
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir a flotante: " + e.getMessage());
            return 0.0f;
        }
    }

    /**
     * Método para leer un largo desde la consola.
     * Convierte la entrada de texto a un valor largo. En caso de error de formato, muestra un mensaje y retorna 0L.
     */
    public static long datoLong() {
        try {
            return Long.parseLong(dato());
        } catch (NumberFormatException e) {
            System.err.println("Error al convertir a largo: " + e.getMessage());
            return 0L;
        }
    }
}