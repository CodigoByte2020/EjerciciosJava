package clases;

public class Proceso2 implements Runnable {

    @Override
    public void run() {
        int i = 1;

        while (i <= 5) {
            System.out.println("Proceso 2.1");
            i += 1;
        }

        i = 1;

        while (i <= 5) {
            System.out.println("Proceo 2.2");
            i += 1;
        }

        i = 1;

        while (i <= 5) {
            System.out.println("Proceso 2.3");
            i += 1;
        }
    }
}
