package ejerciciopoo;

import java.util.Scanner;

public class AreaMain {

    public static void main(String args[]) {
        Scanner EntradaDatos = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        float base = EntradaDatos.nextFloat();
        System.out.print("Ingrese la altura del triángulo: ");
        float altura = EntradaDatos.nextFloat();

        Area valores = new Area(base, altura);
        valores.Imprimir();
    }
}