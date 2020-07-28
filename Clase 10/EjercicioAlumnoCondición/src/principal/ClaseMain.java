package principal;

import java.util.Scanner;
import lógica.AlumnoCondición;

public class ClaseMain {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese la nota #1 de " + nombre + ": ");
        int nota1 = entrada.nextInt();
        System.out.print("Ingrese la nota #2 de " + nombre + ": ");
        int nota2 = entrada.nextInt();
        System.out.print("Ingrese la nota #3 de " + nombre + ": ");
        int nota3 = entrada.nextInt();

        AlumnoCondición Alumno = new AlumnoCondición(nombre, nota1, nota2, nota3);
        Alumno.setNota1(15);
        Alumno.setNota2(15);
        Alumno.setNota3(16);
        System.out.println((float) (Alumno.getNota1() + Alumno.getNota2() + Alumno.getNota3()) / 3);
        Alumno.ImprimirCondición();
        System.out.println((float) (Alumno.getNota1() + Alumno.getNota2() + Alumno.getNota3()) / 3);
    }
}
