package clases;

public class Lógica_Recursividad {

    public void CalcularFactorial(int número, int multiplicador, int resultado) {
        if (multiplicador <= número) {
            resultado = resultado * multiplicador;
            CalcularFactorial(número, multiplicador + 1, resultado);
        } else if (multiplicador > número) {
            System.out.println(número + "! =  " + resultado);
        }
    }
}
