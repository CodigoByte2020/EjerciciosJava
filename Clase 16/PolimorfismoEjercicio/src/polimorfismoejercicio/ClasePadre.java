package polimorfismoejercicio;

import java.util.Scanner;

public abstract class ClasePadre {

    Scanner entrada = new Scanner(System.in);

    protected int valor1, valor2, resultado;

    public abstract void IngresarDatos();

    public abstract void RealizarOperación();

    public abstract void MostrarDatos();
}
