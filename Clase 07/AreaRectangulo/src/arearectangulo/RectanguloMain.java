package arearectangulo;

import java.util.Scanner;

public class RectanguloMain {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor de la base: ");
        double base = entrada.nextDouble();
        System.out.print("Ingrese el valor de la altura: ");
        double altura = entrada.nextDouble();

        Rectangulo mensajero = new Rectangulo(base, altura);
        mensajero.Imprimir();
    }

}
