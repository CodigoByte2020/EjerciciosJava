package clases;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Practicando_ArrayList_y_Foreach {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        System.out.print("¿Cuántos elementos tendrá la lista? ");
        int tamaño = entrada.nextInt();

        for (int i = 0; i < tamaño; i += 1) {
            System.out.print("Ingrese un número entero: ");
            int dato = entrada.nextInt();
            lista.add(dato);
        }

        for (int i : lista) {
            System.out.println(i);
        }

        System.out.println("El tamaño de la lista es: " + lista.size());
    }
}
