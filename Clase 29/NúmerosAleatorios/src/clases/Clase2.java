package clases;

import java.util.Random;

public class Clase2 {

    public static void main(String[] args) {

        int aleatorio;
        Random r = new Random();

        /*El primer número del método random indica la cantidad de números que tendrá el rango, 
        y el segundo número indica desde dónde se comienza a contar dichos rango. Si no hay el segundo número 
        el rango empieza desde 0*/
        aleatorio = (int) (r.nextDouble() * 5);
        System.out.println(aleatorio);
    }
}
