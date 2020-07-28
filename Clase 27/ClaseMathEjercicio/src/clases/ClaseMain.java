package clases;

import java.util.Scanner;

public class ClaseMain {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese un número: ");
        double ValorIngresado = entrada.nextDouble();
        System.out.println("¿ Que funcion trigonométrica desea realizar ?");
        System.out.println("1. Hallar Seno,  2. Hallar Coseno,  3. Hallar Tangente,  4. Hallar Arco Seno,  5. Hallar Arco Coseno,  6. Hallar Arco Tangente");
        int decisión = entrada.nextInt();

        Lógica_ClaseMath mensajero = new Lógica_ClaseMath(ValorIngresado, decisión);
        mensajero.FuncionesTrigonométricas();
    }
}
