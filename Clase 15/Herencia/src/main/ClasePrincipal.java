package main;

import lógica.ClaseHijaSuma;
import lógica.ClaseHijaResta;

public class ClasePrincipal {

    public static void main(String[] args) {
        ClaseHijaSuma MensajeroSuma = new ClaseHijaSuma();
        MensajeroSuma.Entrada();
        MensajeroSuma.Operación();
        System.out.print("El resultado de la suma es: ");
        MensajeroSuma.MostrarResultado();

        ClaseHijaResta MensajeroResta = new ClaseHijaResta();
        MensajeroResta.Entrada();
        MensajeroResta.Operación();
        System.out.print("El resultado de la resta es: ");
        MensajeroResta.MostrarResultado();
    }
}
