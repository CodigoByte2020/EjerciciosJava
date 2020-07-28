package ejercicio2;

public class Lógica2 {

    int resultado = 0;
    int indicador = 0;

    //Método recursivo para hallar la potencia de un número
    public int CalcularPotencia(int base, int exponente) {

        if (exponente > 1) {
            resultado = base * CalcularPotencia(base, exponente - 1);
            System.out.println(base + " ^ " + (indicador += 1) + " = " + resultado);
        } else if (exponente == 1) {
            CalcularPotencia(base, exponente - 1);
            resultado = base;
            System.out.println(base + " ^ " + (indicador += 1) + " = " + resultado);
        } else if (exponente == 0) {
            resultado = 1;
            System.out.println(base + " ^ " + indicador + " = " + resultado);
        }
        return resultado;
    }
}
