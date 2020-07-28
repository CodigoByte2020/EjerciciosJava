package clases;

public class Hilo3 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i += 1) {
            System.out.print("E");
            try {
                super.sleep(1000);
                //Hilo3.sleep(1000);                
            } catch (InterruptedException e) {
                System.out.println("Exceción en el hilo 3. " + e);
            }
        }
    }
}
