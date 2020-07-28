package clases;

public class Proceso2 extends Thread {

    public Proceso2(String name) {
        super(name);
    }

    @Override
    public void run() {
        int i = 2;
        do {
            try {
                if (i == 2) {
                    Proceso2.sleep(1000);
                } else {
                    Proceso2.sleep(2000);
                }
                System.out.println(getName() + " - Versión 1." + i);
            } catch (InterruptedException expcn) {
                System.out.println("Error ejecutado en la clase Proceso 2: " + expcn);
            }
            i += 2;
        } while (i <= 8);
    }
}
