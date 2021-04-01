package poo;

public class Alumno {

    private String nombre;
    private int edad;
    private int nota1, nota2, nota3;
    private double promedio;
    private boolean aprobado;

    public Alumno(String nombre, int edad, int nota1, int nota2, int nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getNota1() {
        return nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setPromedio() {
        promedio = (double) (nota1 + nota2 + nota3) / 3;
        if (promedio >= 13) {
            aprobado = true;
        } else {
            aprobado = false;
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public String getMensajeFinal() {
        if (aprobado) {
            return "Aprobado";
        } else if (!aprobado) {
            return "Desaprobado";
        }
        return null;
    }
}
