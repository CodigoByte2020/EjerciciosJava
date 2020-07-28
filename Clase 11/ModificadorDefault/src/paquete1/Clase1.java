package paquete1;

public class Clase1 {

    public static void main(String[] args) {
        AtributosMétodos mensajero = new AtributosMétodos();
        
        //Si se puede acceder a atributos y métodos que estén con el modificador de acceso por defecto, desde otra clase pero siempre y cuando sea del mismo paquete.
        mensajero.valor1 = 0;
        mensajero.valor2 = 0;
        mensajero.cadena1 = "";
        mensajero.Método1();
    }
}
