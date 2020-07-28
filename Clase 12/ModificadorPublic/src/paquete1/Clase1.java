package paquete1;

public class Clase1 {

    public static void main(String[] args) {

        AtributosMétodos mensajero = new AtributosMétodos();
        //Si se puede acceder a atributos y métodos con el modificador de acceso public, desde otra clase, incluso si esta está en otro paquete.
        mensajero.número1 = 0;
        mensajero.número2 = 0;
        mensajero.cadena = "";
        mensajero.Método2();

    }
}
