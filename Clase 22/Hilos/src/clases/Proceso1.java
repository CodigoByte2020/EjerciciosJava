package clases;

//1ra forma de usar los hilos: Heredar la clase Thread
public class Proceso1 extends Thread {

    //Sobreescribimos el metodo run que heredamos de la clase Thread
    @Override
    public void run() {
        for (int i = 1; i <= 6; i += 1) {
            System.out.println("Proceso 1");
        }
    }
}
