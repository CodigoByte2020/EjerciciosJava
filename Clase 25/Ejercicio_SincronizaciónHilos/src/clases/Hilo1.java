package clases;

public class Hilo1 extends Thread {

    private String nombre;

    public Hilo1(String nombre) {
        super(nombre);
        this.nombre = nombre;
    }

    @Override
    public void run() {
        String dato = "";
        int longitud = nombre.length();

        for (int i = 0; i < longitud; i += 1) {
            dato = nombre.substring(i, i + 1);
            if (i <= (longitud - 2)) {
                System.out.print(dato);
            } else if (i == (longitud - 1)) {
                System.out.print(dato + " Y ");
            }
            try {
                Hilo1.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Excepción ejecutado en la clase Hilo1. " + e);
            }
        }
    }
}
