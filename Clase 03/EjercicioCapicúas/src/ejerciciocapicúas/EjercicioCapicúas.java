/*
* Autor: Gianmarco Contreras Pumamango
* Fecha: 05/03/2020
* Versión 1.0
 */
package ejerciciocapicúas;

import java.util.Scanner;

public class EjercicioCapicúas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String CadenaOriginal;
        int longitud;
        float CantidadVueltas;
        boolean bandera = false;

        System.out.println("Ingresa una palabra / frase o  número: ");
        CadenaOriginal = entrada.nextLine();
        longitud = CadenaOriginal.length();
        CantidadVueltas = longitud / 2;

        // Con esta sección de código validamos si el texto ingresado por el usuario es capicúa o no.
        for (int i = 0; i < CantidadVueltas && bandera == false; i += 1) {
            if (CadenaOriginal.substring(i, i + 1).equals(CadenaOriginal.substring(longitud - 1, longitud))) {
                longitud -= 1;
            } else {
                bandera = true;
            }
        }

        if (bandera == false) {
            System.out.println(CadenaOriginal + " SI es capicúa");
        } else {
            System.out.println(CadenaOriginal + " NO es capicúa");
        }

        // Probando comentarios
        // System.out.println(CadenaOriginal + " NO es capicúa");
    }

}
