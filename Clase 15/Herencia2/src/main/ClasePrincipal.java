package main;

import lógica.ClaseHijaJunior;
import lógica.ClaseHijaSemiSenior;
import lógica.ClaseHijaSenior;
import lógica.ClasePadre;

public class ClasePrincipal {

    public static void main(String[] args) {

        /*Al usar la herencia, heredamos las variables y métodos de la clase padre, pero NO se heredan los datos que ingresamos en cada método de la clase padre o en alguna de las 
        clase hijas.*/
        ClasePadre MensajeroPadre = new ClasePadre();
        MensajeroPadre.IngresarDatos();

        if (MensajeroPadre.getAñosExperiencia() >= 0 && MensajeroPadre.getAñosExperiencia() <= 2) {
            ClaseHijaJunior MensajeroJunior = new ClaseHijaJunior();
            MensajeroJunior.SueldoJunior();
            System.out.print(MensajeroPadre.getNombre() + " usted es un programador JUNIOR y su sueldo es: ");
            MensajeroJunior.MostrarDatos();
        }
        else if (MensajeroPadre.getAñosExperiencia() >= 3 && MensajeroPadre.getAñosExperiencia() <= 8) {
            ClaseHijaSemiSenior MensajeroSemiSenior = new ClaseHijaSemiSenior();
            MensajeroSemiSenior.SueldoSemiSenior();
            System.out.print(MensajeroPadre.getNombre() + " usted es un programador SEMISENIOR y su sueldo es: ");
            MensajeroSemiSenior.MostrarDatos();
        } 
        else if (MensajeroPadre.getAñosExperiencia() > 8) {
            ClaseHijaSenior MensajeroSenior = new ClaseHijaSenior();
            MensajeroSenior.SueldoSenior();
            System.out.print(MensajeroPadre.getNombre() + " usted es un programador SENIOR y su sueldo es: ");
            MensajeroSenior.MostrarDatos();
        }
    }
}
