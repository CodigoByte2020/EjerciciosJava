package paquete2;

import paquete1.AtributosMétodos;

public class Clase2 {

    public static void main(String[] args) {
        AtributosMétodos mensajero = new AtributosMétodos();

        /*No se puede acceder desde ningún lado a atributos y métodos con el modificador de acceso private. La única forma es con los métodos Getter y Setter.
        mensajero.número1 = 0;
        mensajero.número2 = 0;
        mensajero.cadena = "";
        mensajero.Método2();*/
        
        mensajero.setNúmero1(20);
        System.out.println(mensajero.getNúmero1());
    }
}
