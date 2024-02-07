package app;

import leer.Leer;
import menu.Menu;

public class Aplicacion {

    public static void main(String[] args) {

        Menu.mensajeInicial();

        boolean continuar = true;

        do {
            Menu.opcionesMenu();
            int opcion = Leer.datoInt();
            switch (opcion) {
            case 1:
                // Implementación de mostrar productos
                break;
            case 2:
                // Implementación de comprar productos
                break;
            case 3:
                // Implementación de mostrar caja
                break;
            default:
                continuar = false;
            }
        } while (continuar);

        Menu.mensajeFin();
    }
}
