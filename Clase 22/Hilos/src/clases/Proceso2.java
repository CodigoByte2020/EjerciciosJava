package clases;

//2da forma de usar los hilos: Implementar la interfaz Runnable
public class Proceso2 implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 6; i += 1) {
            System.out.println("Proceso 2");
        }
    }
}
