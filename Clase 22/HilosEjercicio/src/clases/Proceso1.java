package clases;

public class Proceso1 extends Thread {

    @Override
    public void run() {
        int i = 1;

        while (i <= 5) {
            System.out.println("Proceso 1.1");
            i += 1;
        }

        i = 1;

        while (i <= 5) {
            System.out.println("Proceso 1.2");
            i += 1;
        }

        i = 1;

        while (i <= 5) {
            System.out.println("Proceso 1.3");
            i += 1;
        }
    }
}
