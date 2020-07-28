package clases;

public class ClasePrincipal {

    public static void main(String[] args) {

        Proceso1 hilo1 = new Proceso1();
        Proceso1 hilo2 = new Proceso1();
        Thread hilo3 = new Thread(new Proceso2());
        Thread hilo4 = new Thread(new Proceso2());
                
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
    }
}
