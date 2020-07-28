package excepciones;

import java.util.Scanner;

public class División {

    public static void main(String[] args) {
        
        try { //En el cuerpo del try colocamos todo el código que se ejecutará de manera inicial
            int valor1, valor2, división;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese el primer valor: ");
            valor1 = entrada.nextInt();
            System.out.print("Ingrese el segundo valor: ");
            valor2 = entrada.nextInt();
            división = valor1 / valor2;
            System.out.println("El resultado de la división es: " + división);
        } catch (Exception e) { //Creamos un objeto de la clase Exception para poder capturar la excepción
            System.out.println("ERROR !!! " + e); //Aquí colocamos el código que se ejecutará cuando suceda la excepción
        } finally { //En finally colocamos el código que se ejecutará, y no importa si sucedio el error o no
            System.out.println("Operación terminada");
        }
    }
}
