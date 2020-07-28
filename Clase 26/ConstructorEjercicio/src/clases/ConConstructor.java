package clases;

import java.util.Scanner;

public class ConConstructor {

    int valor1, valor2;

    //Estos datos que recibimos a través del constructor son los requeridos (required)
    public ConConstructor(int nota1, int nota2, int nota3, String nombre, String apellido) {
        float promedio = (float) (nota1 + nota2 + nota3) / 3;
        System.out.print(nombre + " " + apellido + " tu promedio es: " + promedio);
        System.out.println();
    }
    
    /*Los métodos con parámetros funcionan parecido al constructor, pueden tener el mismo nombre, pero deben tener diferente cantidad de parámetros.*/
    public void Prueba(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        int resultado = valor1 + valor2;
        System.out.println("Resultado 1: " + resultado);
    }

    public void Prueba() {
        int r2 = valor1 - valor2;
        System.out.println("Resultado 2: " + r2);
    }

    public void Prueba(int valor1) {
        System.out.println("Resultado 3: " + valor1);
    }
}
