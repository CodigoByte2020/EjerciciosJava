package lógica;

import java.util.Scanner;

public class ClasePadre {

    Scanner entrada = new Scanner(System.in);
    protected int valor1, valor2, resultado;

    public void Entrada() {
        System.out.print("Ingrese el primer valor: ");
        valor1 = entrada.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        valor2 = entrada.nextInt();
    }

    public void MostrarResultado() {
        System.out.print(resultado); 
        System.out.println(); 
    }
}
