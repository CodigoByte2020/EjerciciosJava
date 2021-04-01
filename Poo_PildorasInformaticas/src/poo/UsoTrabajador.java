package poo;

public class UsoTrabajador {

    public static void main(String[] args) {

        Trabajador trabajador1 = new Trabajador("Micky");
        Trabajador trabajador2 = new Trabajador("Jose");
        Trabajador trabajador3 = new Trabajador("Lucía");
        Trabajador trabajador4 = new Trabajador("Mauricio");

//        trabajador1.setSección("Almacén");
        System.out.println(trabajador1.getDevolverDatos());
//        trabajador1.getId() += 1;
        System.out.println(trabajador2.getDevolverDatos());        
//        Trabajador.Id += 1;
        System.out.println(trabajador3.getDevolverDatos());
        System.out.println(trabajador4.getDevolverDatos());
        
        System.out.println("El id siguiente es: " + Trabajador.getIdSiguiente());
    }

}

class Trabajador {

    //Con la palabra reservada final declaramos una constante, la cual nunca puede cambiar su valor
    private final String nombre;
    private String sección;
    private int Id;
    private static int ContadorId;

    public Trabajador(String nombre) {
        this.nombre = nombre;
        sección = "Administración";
        ContadorId += 1; //ContadorId = 1, 2, 3, 4  
        Id = ContadorId; //Id = 1, 2, 3, 4
    }

//    public int getId() {
//        return Id;
//    }
    
    public static int getIdSiguiente() {
        return ContadorId + 1;
    }
    
    public void setSección(String sección) {
        this.sección = sección;
    }

    public String getDevolverDatos() {
//        Id += 1;
        return "El trabajador " + nombre + " pertenece al area de " + sección + " con el id: " + Id;
    }
}
