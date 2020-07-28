package ejercicio3;

import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int inicio, fin;

        do {
            System.out.print("Ingrese el número de inicio: ");
            inicio = entrada.nextInt();
            System.out.print("Ingrese el número de fin: ");
            fin = entrada.nextInt();
            Lógica3 instancia = new Lógica3();
            instancia.ImprimirRangoAscendente(inicio, fin);
        } while (inicio > fin);
    }
}
