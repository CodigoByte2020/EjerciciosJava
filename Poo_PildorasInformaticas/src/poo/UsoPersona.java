package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoPersona {

    public static void main(String[] args) {

        Persona personas[] = new Persona[3];

        personas[0] = new Empleado2("Enrique", 1800.5, 1999, 04, 15);
        personas[1] = new Alumno2("Gilberto", "Ingeniería de Software");
        personas[2] = new Empleado2("Michel", 2030, 2010, 11, 30); // <----------------------------------------------------

//        Solución cuando instanciamos un objeto directamente en un array y queremos usar sus métodos.        
//        Empleado2 empli = (Empleado2) personas[2];
//        empli.setSueldoAumentado(10);
//        personas[2] = empli;
//        Aunque la mejor opción sería primero crear el objeto y luego usar sus métodos y después guardarlos en el array
//        Empleado2 empli = new Empleado2("Michel", 2030, 2010, 11, 30);
//        empli.setSueldoAumentado(10);
//        personas[2] = empli;
        for (Persona i : personas) {
//            System.out.println("La persona " + i.getNombre() + i.getDescripción());
            System.out.println(i.getNombre() + ", " + i.getDescripción());
        }
    }
}

abstract class Persona {

    public Persona(String nombre) {

        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String getDescripción();

    private String nombre;

}

class Empleado2 extends Persona {

    /*Sobrecarga de constructores:
    Ningún constructor debe coincidir en la conjunción de 3 factores en cuanto a los parámetros: (nº, tipo y orden)*/
    public Empleado2(String nombre, double sueldo, int annio, int mes, int día) {

        super(nombre);
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(annio, mes - 1, día);
        FechaAlta = calendario.getTime();
        ContadorID += 1;
        ID = ContadorID;
    }

    public String getDescripción() {

        return "el empleado posee el ID #" + ID + " y tiene un sueldo de " + sueldo;
    }

    //GETTER
    public Date getFechaAlta() {
        return FechaAlta;
    }

    //SETTER
    public void setSueldoAumentado(double porcentaje) {
        sueldo += sueldo * (porcentaje / 100);
    }

    //GETTER
    public double getSueldo() {
        return sueldo;
    }

    private double sueldo;
    private Date FechaAlta;
    private int ID;
    private static int ContadorID;
}

class Alumno2 extends Persona {

    public Alumno2(String nombre, String carrera) {

        super(nombre);
        this.carrera = carrera;

    }

    public String getDescripción() {

        return "el alumno estudia la carrera profesional de " + carrera;
    }

    private String carrera;
}
