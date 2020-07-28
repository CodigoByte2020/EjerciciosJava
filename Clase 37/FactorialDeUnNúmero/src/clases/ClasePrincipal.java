package clases;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);        
        System.out.print("Ingrese el número que desea calcular su factorial: ");
        int número = entrada.nextInt();
        
        Lógica_Recursividad mensajero = new Lógica_Recursividad();
        mensajero.CalcularFactorial(número, 1, 1);
    }
}
