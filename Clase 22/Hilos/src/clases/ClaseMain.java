package clases;

public class ClaseMain {

    public static void main(String[] args) {

        //Creamos uno o mas objetos para cada clase que tiene un hilo
        Proceso1 hilo1 = new Proceso1();
        //hilo1.start(); --- Hacer esto es incorrecto cuando usamos hilos, primero creamos todos los objetos y luego arrancamos todos los hilos
        Proceso1 hilo1_1 = new Proceso1();
        //Usando un constructor le pasamos como parametro la clase donde se encuentra el proceso que se ejecutara en este hilo
        Thread hilo2 = new Thread(new Proceso2());

        //Con ayuda del metodo start arracamos los hilos
        hilo1.start();
        hilo1_1.start();
        hilo2.start();
    }
}
