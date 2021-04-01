package poo;

public class UsoEmp {

    public static void main(String[] args) {

        Emp Array[] = new Emp[4];

        Array[0] = new Emp("Juan", 1500.5);
        Array[1] = new Emp("Miguel", 1700.8);

        Array[2] = new Jef("Carlitos", 3900.7); //En estos casos el constructor decide el tipo de objeto
        Jef jefe2 = (Jef) Array[2]; //El jefe2 guarda todos los atributos de Array[2] con sus respectivos valores y métodos
        jefe2.setIncentivo(200);
        Array[2] = jefe2;

        Jef jefe1 = new Jef("Gianmarco", 5100.8);
        jefe1.setIncentivo(500);
        Array[3] = jefe1;

        for (Emp i : Array) {
            i.setSueldoAumentado(10);
            System.out.println(i.getNombre() + " tiene un sueldo de: " + i.getSueldoAumentado());
        }

        Emp objeto1 = new Jef("eli", 240); //Si se usa herencia esto es posible
        objeto1.setIncentivo(30); //El objeto es de tipo Emp

        Emp objeto2 = new Emp("yuli", 155); //Objeto de tipo Emp
        objeto2.getNombre();

        Jef jefe5 = new Jef("Danna", 10); //Objeto de tipo Jef
        jefe5.setIncentivo(20);

        //Jef jefe6 = new Emp("Bony", 230); //Un empleado no siempre es un jefe --- INCORRECTO
    }
}

class Emp {

    private String nombre;
    private double sueldo;

    public Emp(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setSueldoAumentado(double porcentaje) { //Cuando queremos un resultado decimal, declarar el parámetro como double
        sueldo += sueldo * (porcentaje / 100);
    }

    public double getSueldoAumentado() {
        return sueldo;
    }
}

class Jef extends Emp {

    private int incentivo;

    public Jef(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    public void setIncentivo(int incentivo) {
        this.incentivo = incentivo;
    }

    public double getSueldoAumentado() {
        return super.getSueldoAumentado() + incentivo;
    }
}
