package clases;

public class Hilo2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 1) {
            System.out.print("E");
            try {
                Hilo2.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Excepción en el hilo 2. " + e);
            }
        }
    }
}
