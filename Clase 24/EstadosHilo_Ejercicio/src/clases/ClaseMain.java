package clases;

public class ClaseMain {

    public static void main(String[] args) {
        Proceso1 hilo1 = new Proceso1("Hilo 1");
        Proceso2 hilo2 = new Proceso2("Hilo 2");

        hilo1.start();
        hilo2.start();
    }
}
