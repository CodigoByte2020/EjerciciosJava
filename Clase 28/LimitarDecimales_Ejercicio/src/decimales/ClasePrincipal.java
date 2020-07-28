package decimales;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClasePrincipal {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int número = 5;
        double raíz = Math.sqrt(número);

        System.out.print("Ingrese una opción para formatear su raíz cuadrada: (1 - 2 - 3 - 4): ");
        int decisión = entrada.nextInt();
        boolean bandera = false;

        for (int i = 2; i >= 0 && bandera == false; i -= 1) {
            switch (decisión) {
                case 1: //Utilizando String format --- Forma más sencilla para limitar la cantidad de decimales
                    System.out.println("La raíz cuadrada de " + número + " = " + String.format("%.2f", raíz));
                    bandera = true;
                    break;
                case 2: //Utilizando la clase DecimalFormat
                    DecimalFormat df = new DecimalFormat("#.00");
                    System.out.println("La raíz cuadrada de " + número + " = " + df.format(raíz));
                    bandera = true;
                    break;
                case 3: //Utilizando la clase Math y el método Round
                    System.out.println("La raíz cuadrada de " + número + " = " + (double) Math.round(raíz * 100d) / 100);
                    bandera = true;
                    break;
                case 4: //Utilizando la clase BigDecimal --- Con esta forma puedo establecer la cantidad de decimales que tendrá la raíz, según lo ingresado por el usuario
                    System.out.print("¿Cuántos decimales desea que tenga su raíz cuadrada?: ");
                    int CantidadDecimales = entrada.nextInt();
                    BigDecimal bd = new BigDecimal(raíz);
                    bd = bd.setScale(CantidadDecimales, RoundingMode.HALF_UP);
                    System.out.println("La raíz cuadrada de " + número + " = " + bd.doubleValue());
                    bandera = true;
                    break;
                default:
                    if (i != 0) {
                        System.out.println("Opción incorrecta, le quedan " + i + " intento(s), por favor vuelve a ingresar una opción.");
                        System.out.print("Ingrese una opción para formatear su raíz cuadrada: (1 - 2 - 3 - 4): ");
                        decisión = entrada.nextInt();
                    } else {
                        System.out.println("Opción incorrecta ya no le quedan intentos, el programa se cerrará automáticamente.");
                    }
                    break;
            }
        }
    }
}
