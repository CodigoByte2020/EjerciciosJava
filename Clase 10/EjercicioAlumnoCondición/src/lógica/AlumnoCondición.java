package lógica;

import java.util.Scanner;
//principal.ClaseMain;

public class AlumnoCondición {

    Scanner entrada = new Scanner(System.in);
    private String nombre = "";
    private int nota1, nota2, nota3, condición = 0;
    float promedio;

    public AlumnoCondición(String nombre, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    private void CalcularPromedio() {
        promedio = (float) (nota1 + nota2 + nota3) / 3;
    }

    private void CalcularCondición() {
        for (int i = 3; i >= 1 && condición == 0; i -= 1) {
            CalcularPromedio();
            if (promedio >= 13) {
                condición = 1;
            } else {
                System.out.println("El alumno " + nombre + " esta desaprobado, con un promedio de: "
                        + promedio + " tiene " + i + " oportunidad(es) más de aprobar el curso.");
                System.out.print("Ingrese la nota #1 de " + nombre + " : ");
                nota1 = entrada.nextInt();
                System.out.print("Ingrese la nota #2 de " + nombre + " : ");
                nota2 = entrada.nextInt();
                System.out.print("Ingrese la nota #3 de " + nombre + " : ");
                nota3 = entrada.nextInt();
            }
        }
        CalcularPromedio();
        if (condición == 1) {
            System.out.println("El alumno " + nombre + " esta aprobado, con un promedio de: " + promedio);
        } else {
            System.out.println("El alumno " + nombre + " esta desaprobado, con un promedio de: " + promedio);
        }
    }

    public void ImprimirCondición() {
        CalcularCondición();
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }
}
/* Investigar si se puede crear un objeto de la ClaseMain para poder importar sus variables
                ClaseMain Alumno1_1 = new ClaseMain();
                Alumno1_1.nota1; */
