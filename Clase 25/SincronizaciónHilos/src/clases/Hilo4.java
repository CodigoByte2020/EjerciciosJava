package clases;

public class Hilo4 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 1) {
            System.out.println("K");
            try {
                super.sleep(1000);
                //Hilo4.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Excepción en el hilo 4. " + e);
            }
        }
    }
}
