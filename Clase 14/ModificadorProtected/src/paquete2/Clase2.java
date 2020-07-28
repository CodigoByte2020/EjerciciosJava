package paquete2;

import paquete1.AtributosMétodos;

public class Clase2 {

    public static void main(String[] args) {
        
        AtributosMétodos mensajero = new AtributosMétodos();
        /*Solo se puede acceder desde clases del mismo paquete a atributos y métodos con el modificador de acceso protected (al igual que el modificador por defecto). 
        Y también desde cualquier clase que herede la clase en que se encuentra, independientemente de si esta se  encuentra en el mismo paquete o no.*/
        mensajero.número1;
        mensajero.número2;
        mensajero.cadena;
        mensajero.Método2();
    }
}
