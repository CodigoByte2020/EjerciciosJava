package ejerciciothis;

import java.util.Scanner;

public class ClaseMain {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String figura = "";

        System.out.print("Ingresa una opción (1 = Triángulo  2 = Rectángulo): ");
        int decisión = entrada.nextInt();

        if (decisión == 1) {
            figura = "Triángulo";
            System.out.print("Ingrese la base del " + figura + ": ");
            int base = entrada.nextInt();
            System.out.print("Ingrese la altura del " + figura + ": ");
            int altura = entrada.nextInt();
            // El objeto creado puede tener el mismo nombre que la clase a la que pertenece.
            Triángulo Triángulo = new Triángulo(base, altura);
            Triángulo.Imprimir();
        }
        if (decisión == 2) {
            figura = "Rectángulo";
            System.out.print("Ingrese la base del " + figura + ": ");
            int base = entrada.nextInt();
            System.out.print("Ingrese la altura del " + figura + ": ");
            int altura = entrada.nextInt();
            Rectángulo Rectángulo = new Rectángulo(base, altura);
            Rectángulo.Imprimir();
        } else {
            System.out.println("Ingreso una opción incorrecta.");
        }

    }

}
