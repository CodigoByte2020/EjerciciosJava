package clases;

import java.util.Scanner;

public class SinConstructor {

    private Scanner entrada = new Scanner(System.in);
    String nombre;

    //Creamos 2 métodos que van a suplir la función del constructor
    public void IngresarDatos() {
        System.out.print("Ingresa tu nombre: ");
        nombre = entrada.nextLine();
    }

    public void SalidaDatos() {
        System.out.println("Tu nombre es: " + nombre);
    }
}
