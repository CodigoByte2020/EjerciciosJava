package ejercicio2;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int base, exponente;

        do {
            System.out.print("Ingrese el número base: ");
            base = entrada.nextInt();
            System.out.print("Ingrese el exponente: ");
            exponente = entrada.nextInt();
        } while (base < 1 || exponente < 0);

        Lógica2 mensajero = new Lógica2();
        System.out.print("Resultado de la potencia: " + mensajero.CalcularPotencia(base, exponente));
    }
}
