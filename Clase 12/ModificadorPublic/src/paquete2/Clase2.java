package paquete2;

import paquete1.AtributosMétodos;

public class Clase2 {

    public static void main(String[] args) {
        AtributosMétodos mensajero = new AtributosMétodos();

        //Es posible acceder a atributos y  métodos con el modificador de acceso public, desde cualquier otra clase, así  esta esté en otro paquete.
        mensajero.número1 = 0;
        mensajero.número2 = 0;
        mensajero.cadena = "";
        mensajero.Método2();
    }
}
