package clases;

import java.util.Scanner;

public class SinConstructor {

    String nombre, apellido;
    int nota1, nota2, nota3;
    float promedio;
    private String vagina;

    public void EntradaDatos() {
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese su apellido: ");
        apellido = entrada.nextLine();
        System.out.print("Ingrese su nota 1: ");
        nota1 = entrada.nextInt();
        System.out.print("Ingrese su nota 2: ");
        nota2 = entrada.nextInt();
        System.out.print("Ingrese su nota 3: ");
        nota3 = entrada.nextInt();
        System.out.print("Ingrese el nombre de su vagina: ");
        vagina = entrada.next();
    }

    public void CalcularPromedio() {
        promedio = (float) (nota1 + nota2 + nota3) / 3;
    }

    public void SalidaDatos() {
        System.out.print(nombre + " " + apellido + " tu promedio es: " + promedio);
        System.out.println();
    }

    //Los métodos getter y setter se usan para acceder a datos privados de una clase desde otra clase
    public void setVagina(String vagina) {
        this.vagina = vagina;
    }

    public String getVagina() {
        return vagina;
    }
}
