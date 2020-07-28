package clases;

public class Clase1 {

    public static void main(String[] args) {

        int aleatorio;

        /*El primer número del método random indica la cantidad de números que tendrá el rango, 
        y el segundo número indica desde dónde se comienza a contar dicho rango*/        
        aleatorio = (int) (Math.random() * 5) + 2; //Da lo mismo si el segundo número se coloca dentro o fuera del paréntesis
        System.out.println(aleatorio);
    }
}
