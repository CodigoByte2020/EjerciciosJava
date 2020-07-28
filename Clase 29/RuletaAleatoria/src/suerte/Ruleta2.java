package suerte;

import java.util.Scanner;
import java.util.Random;

public class Ruleta2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Random r = new Random();
        int NúmeroUsuario, NúmeroPc, intentos = 2, ingresos = 2;
        boolean bandera = false;
        System.out.println("Tendrás 3 intentos para ingresar un número mayor que la Pc");
        System.out.println("! QUE COMIENZE EL JUEGO ¡");
        System.out.println("----------------------------------------------------------------------------------------");

        while (ingresos >= 0 && intentos >= 0 && bandera == false) {
            System.out.println("");
            System.out.print("Ingrese un número, dentro del rango 1 - 10: ");
            NúmeroUsuario = entrada.nextInt();

            if (NúmeroUsuario >= 1 && NúmeroUsuario <= 10) {
                ingresos = 2;
                NúmeroPc = (int) (r.nextDouble() * 10 + 1);
                System.out.print("Número del Usuario: " + NúmeroUsuario);
                System.out.println("");
                System.out.println("Número de la Pc: " + NúmeroPc);

                if (NúmeroUsuario > NúmeroPc) {
                    System.out.println("GANASTE " + NúmeroUsuario + " es mayor a " + NúmeroPc);
                    bandera = true;
                } else if (NúmeroUsuario == NúmeroPc) {
                    System.out.println("EMPATE " + NúmeroUsuario + " es igual a " + NúmeroPc);
                } else if (NúmeroUsuario < NúmeroPc) {
                    System.out.println("PERDISTE " + NúmeroUsuario + " es menor a " + NúmeroPc);
                    if (intentos != 0) {
                        System.out.println("Le quedan " + intentos + " intento(s)");
                    } else {
                        System.out.println("Ya no le quedan intentos, el programa finalizará su ejecución.");
                    }
                    intentos -= 1;
                }
            } 
            
            else {
                System.out.println("Número ingresado incorrecto");
                if (ingresos != 0) {
                    System.out.println("Le quedan " + ingresos + " ingreso(s)");
                } else {
                    System.out.println("Ya no le quedan ingresos, el programa finalizará su ejecución.");
                }
                ingresos -= 1;
            }
        }
    }

}
