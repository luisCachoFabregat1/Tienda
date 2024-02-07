package leer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leer {

    private static BufferedReader flujoEntrada = new BufferedReader(new InputStreamReader(System.in));

    // Lee una línea de texto desde la entrada estándar
    public static String dato() {
        try {
            return flujoEntrada.readLine().trim();
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
            return "";
        }
    }

    // Convierte un dato en un valor int y lo devuelve
    public static int datoInt() {
        return Integer.parseInt(dato());
    }

    // Convierte un dato en un valor float y lo devuelve
    public static float datoFloat() {
        return Float.parseFloat(dato());
    }

    // Lee un char desde la entrada estándar
    public static char datoChar() {
        try {
            return (char) System.in.read();
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
            return ' ';
        }
    }

    // Convierte un dato en un valor long y lo devuelve
    public static long datoLong() {
        return Long.parseLong(dato());
    }
}


