package paquete2;

import paquete1.AtributosMétodos;

public class Clase2 {

    public static void main(String[] args) {
        AtributosMétodos mensajero = new AtributosMétodos();
        
        //No se puede acceder a atributos y métodos con el modificador de acceso por defecto de una clase que este en otro paquete.
        mensajero.valor1 = 0;
        mensajero.cadena = "";
        mensajero.valor2 = 0;

    }
}

