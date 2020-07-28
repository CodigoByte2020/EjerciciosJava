package clases;

public class Proceso1 extends Thread {

    public Proceso1(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        int i = 1;
        do {
            try {
                if (i == 1) {
                    //Cualquiera de las 2 formas está correcto
                    //Proceso1.sleep(0);
                    super.sleep(0);
                } else {
                    //Proceso1.sleep(2000);
                    super.sleep(2000);
                }
                System.out.println(getName() + " - Versión 1." + i);
            } catch (InterruptedException excepción) {
                System.out.println("Error causado en la clase Proceso 1: " + excepción);
            }
            i += 2;
        } while (i <= 9);
    }
}
