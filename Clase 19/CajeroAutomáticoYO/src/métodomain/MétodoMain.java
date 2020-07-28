/* 
 * Cajero Automático - POO
 * Version 1.0
 * Sw de código libre desarrollado por el programador Junior Contreras Pumamango Gianmarco
 */
package métodomain;

import lógica.LógicaCajero;
import lógica.ConsultaDeSaldo;
import lógica.RetiroDeSaldo;
import lógica.DepósitoDeSaldo;
import lógica.Salida;

public class MétodoMain {

    public static void main(String[] args) {

        LógicaCajero MConsulta = new ConsultaDeSaldo();
        LógicaCajero MRetiro = new RetiroDeSaldo();
        LógicaCajero MDepósito = new DepósitoDeSaldo();
        LógicaCajero MSalida = new Salida();

        MConsulta.SolicitarOpción();

        int intentos = 2;

        while (intentos >= 0) {
            if (MConsulta.getOpción() == 1) {
                MConsulta.RealizarOperación();
                intentos = 2;
            } else if (MConsulta.getOpción() == 2) {
                MRetiro.RealizarOperación();
                intentos = 2;
            } else if (MConsulta.getOpción() == 3) {
                MDepósito.RealizarOperación();
                intentos = 2;
            } else if (MConsulta.getOpción() == 4) {
                MSalida.RealizarOperación();
                intentos = -1;
            } else {
                if (intentos >= 1) {
                    System.out.println("Opción incorrecta, por favor vuelva a ingresar una opción.");
                    System.out.println("Le quedan " + intentos + " intento(s).");
                } else {
                    System.out.println("Opción incorrecta, ya no le quedan intentos.");
                    System.out.println("El programa se cerrará en: 3, 2, 1, 0 ... ");
                }
                intentos -= 1;
            }

            if (intentos >= 0) {
                MConsulta.SolicitarOpción();
            }
        }
    }
}
