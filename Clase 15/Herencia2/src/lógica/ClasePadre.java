package lógica;

import java.util.Scanner;

public class ClasePadre {

    Scanner entrada = new Scanner(System.in);
    protected String nombre;
    protected int AñosExperiencia, sueldo;

    public void IngresarDatos() {
        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.print("¿ Cuantos años de experiencia tiene como programador ?: ");
        AñosExperiencia = entrada.nextInt();
    }

    public void MostrarDatos() {
        System.out.println(sueldo);
    }

    public int getAñosExperiencia() {
        return AñosExperiencia;
    }

    public void setAñosExperiencia(int AñosExperiencia) {
        this.AñosExperiencia = AñosExperiencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
