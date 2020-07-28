package clases;

import java.util.Scanner;

public class Clase2 {
    
    static boolean salir;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("hola");
        //boolean salir;

        do {
            System.out.println(salir + " 1");
            Decisión(entrada);
            System.out.println(salir + " 4");
        } while (salir == false);
    }

    public static void Decisión(Scanner entrada) {
        //boolean salir = false;
        System.out.println(salir + " 2");
        String no = "s";
        System.out.print("¿Desea salir de la aplicación? (S/N) ");
        String decisión = entrada.next();
        if (decisión.equalsIgnoreCase(no)) {
            salir = true;
        }
        System.out.println(salir + " 3");
    }
    
}
