package clases;

import java.util.Scanner;

public class ConConstructor {

    Scanner entrada = new Scanner(System.in);
    String nombre;

    //Este constructor se ejecutará de forma automática si se crea una instancia de la clase
    public ConConstructor() {
        //Cuando declaramos una variable local con el mismo nombre que una variable global, la variable local oculta a la variable global
        /*Scanner entrada = new Scanner(System.in);
        String nombre;*/
        System.out.print("Ingresa tu nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Tu nombre es: " + nombre);
    }
}
