package clases;

public class Hilo2 extends Thread {

    private String name;

    public Hilo2(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public void run() {
        String dato = "";
        int longitud = name.length();

        for (int i = 0; i < longitud; i += 1) {
            dato = name.substring(i, i + 1);
            if (i <= (longitud - 2)) {
                System.out.print(dato);
            } else if (i == (longitud - 1)) {
                System.out.println(dato + " SE AMAN.");
            }
            try {
                Hilo2.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Excepción ejecutada en la clase Hilo2. " + e);
            }
        }
    }
}
