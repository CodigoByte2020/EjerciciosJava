package lavadorassamsung;

import librerías.LógicaLavadora;
import java.util.Scanner;

public class LavadorasMain {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de kilos que desee lavar: ");
        int kilos = entrada.nextInt();
        System.out.print("Ingrese el tipo de ropa que desee lavar: 1 - Ropa Blanca / 2 - Ropa de Color: ");
        int TipoRopa = entrada.nextInt();

        LógicaLavadora Lavadora = new LógicaLavadora(kilos, TipoRopa);
        Lavadora.CicloFinalizado();
    }
}
