//11: 22 - 
package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsoEmpleado {

    public static void main(String[] args) {

//        Empleado empleado1 = new Empleado("Gianmarco", 2500, 2010, 05, 18);
//        Empleado empleado2 = new Empleado("Maicol", 2100.50, 1995, 07, 25);
//        Empleado empleado3 = new Empleado("Geraldine", 1900.3, 1999, 01, 29);
//        
//        empleado1.setSueldoAumentado(5);
//        empleado2.setSueldoAumentado(5);
//        empleado3.setSueldoAumentado(5);
//        
//        System.out.println("El empleado " + empleado1.getNombre() + " tiene un sueldo de " + empleado1.getSueldo()
//                + " e ingreso a laborar en la empresa en la fecha: " + empleado1.getFechaAlta());
//
//        System.out.println("El empleado " + empleado2.getNombre() + " tiene un sueldo de " + empleado2.getSueldo()
//                + " e ingreso a laborar en la empresa en la fecha: " + empleado2.getFechaAlta());
//
//        System.out.println("El empleado " + empleado3.getNombre() + " tiene un sueldo de " + empleado3.getSueldo()
//                + " e ingreso a laborar en la empresa en la fecha: " + empleado3.getFechaAlta());
        //Programando con arrays        
//        for (int i = 0; i < 3; i += 1) {
//            MisEmpleados[i].setSueldoAumentado(5);
//        }
//
//        for (int i = 0; i < 3; i += 1) {
//            System.out.println("El empleado " + MisEmpleados[i].getNombre()
//                    + " tiene un sueldo de " + MisEmpleados[i].getSueldo()
//                    + " e ingreso a laborar en la empresa en la fecha: " + MisEmpleados[i].getFechaAlta());
//        }
        Empleado MisEmpleados[] = new Empleado[9];

        MisEmpleados[0] = new Empleado("Gianmarco", 2500, 2010, 05, 18);
        MisEmpleados[1] = new Empleado("Maicol", 2100.50, 1995, 07, 25);
        MisEmpleados[2] = new Empleado("Geraldine", 1900.3, 1999, 01, 29);
        MisEmpleados[3] = new Empleado("Claudio", 1000);
        MisEmpleados[4] = new Empleado(1900.3, "Mandingo", 1999, 01, 29);
        MisEmpleados[5] = new Empleado(1200.50, "Jose");

        Jefe RRHH = new Jefe("Lorena", 4200, 1998, 10, 04);
        RRHH.setEstableceIncentivo(500);
        MisEmpleados[6] = RRHH;

        Jefe Admin = new Jefe("Cynthia", 4500, 1999, 04, 07);
        Admin.setEstableceIncentivo(500);
        MisEmpleados[7] = Admin;

        MisEmpleados[8] = new Jefe("Claudia", 1500, 1999, 07, 07);
        Jefe Logística = (Jefe) MisEmpleados[8];
        Logística.setEstableceIncentivo(200);
        //MisEmpleados[8] = Logística; //Por que si no escribo esta línea tengo el mismmo resultado ???

        //Con foreach
        for (Empleado i : MisEmpleados) {
            i.setSueldoAumentado(5); //Porque sale 1775 si debería salir 1575 u otro número
        }

        for (Empleado i : MisEmpleados) {
            System.out.println("El empleado " + i.getNombre() + " tiene un sueldo de " + i.getSueldo()
                    + " e ingreso a laborar en la empresa en la fecha: " + i.getFechaAlta());
        }
    }
}

class Empleado {

    /*Sobrecarga de constructores:
    Ningún constructor debe coincidir en la conjunción de 3 factores en cuanto a los parámetros: (nº, tipo y orden)*/
    public Empleado(String nombre, double sueldo, int annio, int mes, int día) {

        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(annio, mes - 1, día);
        FechaAlta = calendario.getTime();
    }

    public Empleado(double sueldo, String nombre, int annio, int mes, int día) {

        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendario = new GregorianCalendar(annio, mes - 1, día);
        FechaAlta = calendario.getTime();
    }

    //Sólo cuando es necesario un constructor debe llamar a un constructor que tenga mas parámetros y no a uno que tenga menos parámetros
    public Empleado(String nombre, double sueldo) {
//        this(nombre);
        this(nombre, sueldo, 1990, 10, 10);
    }

    public Empleado(double sueldo, String nombre) {
//        this(nombre, sueldo);
        this(sueldo, nombre, 1995, 01, 29);
    }

    //GETTER
    public String getNombre() {
        return nombre;
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

    private String nombre;
    private double sueldo;
    private Date FechaAlta;

}

class Jefe extends Empleado {

    public Jefe(String nombre, double sueldo, int annio, int mes, int día) {

        super(nombre, sueldo, annio, mes, día);

    }

    public void setEstableceIncentivo(double b) {

        incentivo = b;
    }

    public double getSueldo() {

        double SueldoJefe = super.getSueldo() + incentivo; //???

        return SueldoJefe;
    }

    private double incentivo; //?

}
