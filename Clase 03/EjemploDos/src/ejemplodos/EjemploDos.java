package ejemplodos;

import java.util.Scanner;

public class EjemploDos {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);
        String CadenaOriginal, CadenaNueva = "";

        System.out.println("Ingresa un texto");
        CadenaOriginal = Entrada.nextLine();
        int longitud = CadenaOriginal.length();

        while (longitud >= 1) {
            CadenaNueva = CadenaNueva + CadenaOriginal.substring(longitud - 1, longitud);
            longitud--;
        }
        System.out.println("" + CadenaNueva);
    }

}
