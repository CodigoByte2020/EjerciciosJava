package clases;

import java.util.Scanner;

public class ClassMain {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre? ");
        String NombreHombre = entrada.nextLine();
        System.out.println("¿Cuál es el nombre de la chica que te gusta?");
        String NombreMujer = entrada.nextLine();

        Hilo1 hilo1 = new Hilo1(NombreHombre);
        Hilo2 hilo2 = new Hilo2(NombreMujer);

        hilo1.start();
        try {
            hilo1.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Excepción ejecutada en el hilo1. " + e);
        }
        
        try {
            hilo2.sleep(NombreHombre.length() * 700);
            hilo2.start();
        } catch (InterruptedException e) {
            System.out.println("Excepción ejecutada en el hilo2. " + e);
        }
    }
}
