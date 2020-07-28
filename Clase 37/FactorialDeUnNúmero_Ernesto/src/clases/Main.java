package clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el número que desea calcular su factorial: ");
        int parámetro = entrada.nextInt();

        Recursivity objeto = new Recursivity();

        int factorial = objeto.CalCularFactorial(parámetro);
        System.out.println("El factorial de " + parámetro + " es " + factorial);
    }
}
