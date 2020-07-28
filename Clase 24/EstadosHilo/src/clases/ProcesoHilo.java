package clases;

public class ProcesoHilo extends Thread {

    public ProcesoHilo(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i += 1) {
            System.out.println(i + " " + getName());
            try {
                ProcesoHilo.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error dentro de la clase ProcesoHilo: " + e);
            }
        }
    }
}
