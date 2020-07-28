package polimorfismo;

import java.util.Scanner;

public abstract class ClasePadre { //Clase abstracta para que pueda contener métodos abstractos.

    Scanner entrada = new Scanner(System.in);
    protected int valor1, valor2, resultado;

    public void IngresarDatos() {
        System.out.print("Ingrese el primer valor: ");
        valor1 = entrada.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        valor2 = entrada.nextInt();
    }
    
    public abstract void Operaciones(); // Método abstracto, para realizar el polimorfismo
    
    public void MostrarDatos() {
        System.out.print(resultado);
        System.out.println();
    }
}
