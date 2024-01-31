package app;

/**
*@author luiscachofabregat
*
*
 */

import leer.Leer;
import menu.Menu;

public class Aplicacion {

    public static void main(String[] args) {
        ejecutarAplicacion();
    }

    private static void ejecutarAplicacion() {
        Menu.mostrarMensajeInicial();

        boolean continuar = true;

        do {
            Menu.mostrarOpcionesMenu();
            int opcion = Leer.datoInt();

            switch (opcion) {
                case 1:
                    // Lógica para mostrar productos
                    break;
                case 2:
                    // Lógica para comprar productos
                    break;
                case 3:
                    // Lógica para mostrar caja
                    break;
                default:
                    // Se sale del programa
                    continuar = false;
                    break;
            }

        } while (continuar);

        Menu.mostrarMensajeFin();
    }
}

