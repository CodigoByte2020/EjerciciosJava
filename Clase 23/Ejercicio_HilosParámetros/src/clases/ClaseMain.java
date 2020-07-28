package clases;

import java.util.Scanner;

public class ClaseMain {

    public static void main(String[] args) {
        Scanner ingreso = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de repeticiones que tendrá el hilo 1: ");
        int valor1 = ingreso.nextInt();
        System.out.println("El número ingresado se multiplacará por 3 para saber el número de repeticiones.");
        System.out.println(valor1 + " * 3" + " = " + (valor1 * 3) + " repeticiones");
        System.out.print("Ingresa la cantidad de repeticiones que tendrá el hilo 2: ");
        int valor2 = ingreso.nextInt();
        System.out.println("El número ingresado se multiplacará por 3 para saber el número de repeticiones.");
        System.out.println(valor2 + " * 3" + " = " + (valor2 * 3) + " repeticiones");

        //Un hilo sólo puede mandar datos por argumento de tipo String
        Proceso1 hilo1 = new Proceso1("Hilo 1", (Integer.toString(valor1)));
        Proceso2 hilo2 = new Proceso2("Hilo 2", (Integer.toString(valor2)));

        /*hilo1.setValorArgumento(valor1);
        hilo2.setValorArgumento(valor2);*/
        hilo2.start();
        hilo1.start();
    }
}
