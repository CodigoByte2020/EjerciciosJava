package poo;

public class UsoJugador {

    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Messi", 25, "Barcelona");
        Jugador jugador2 = new Jugador("Ronaldo", 32, "Real Madrid");
        Jugador jugador3 = new Jugador("Paolo", 15, "Flamengo");

        System.out.println(jugador1.getInformación());
        jugador1.setSueldo();
        System.out.println(jugador1.getSueldo());
        System.out.println(jugador1.getNúmero());

        System.out.println();

        System.out.println(jugador2.getInformación());
        jugador2.setSueldo();
        System.out.println(jugador2.getSueldo());
        System.out.println(jugador2.getNúmero());

        System.out.println();

        System.out.println(jugador3.getInformación());
        jugador3.setSueldo();
        System.out.println(jugador3.getSueldo());
        System.out.println(jugador3.getNúmero());

        System.out.println();
        System.out.println(Jugador.getNúmeroSiguiente());
    }
}

//Esta clase debe tener toda la lógica de programación
class Jugador {

    private static int ContadorNúmero;
    private int número;
    private final String nombre;
    private int edad;
    private String club;
    private int sueldo;

    public Jugador(String nombre, int edad, String club) {
        this.nombre = nombre;
        this.edad = edad;
        this.club = club;
        ContadorNúmero += 1;
        número = ContadorNúmero;
    }

    public String getNúmero() {
        return "El número del jugador es: " + número;
    }

    public static String getNúmeroSiguiente() {
        return "El número siguiente es: " + (ContadorNúmero + 1);
    }

    public String getInformación() {
        return "Jugador " + nombre + ", tiene " + edad + " años y juega en el club " + club;
    }

    public void setSueldo() {
        if (edad >= 18 && edad <= 29) {
            sueldo = 5000;
        } else if (edad >= 30) {
            sueldo = 4000;
        } else {
            sueldo = 0;
        }
    }

    public String getSueldo() {
        if (sueldo == 0) {
            return "El jugador es menor de edad y no recibe sueldo";
        } else {
            return "El jugador gana un sueldo de: S/." + sueldo;
        }
    }
}
