package clases;

public class ClasePrincipal {

    public static void main(String[] args) {

        //El orden de los hilos se determina, según el orden que los creemos
        Proceso1 hilo3 = new Proceso1(" Hilo1"); //Pasamos los datos a través de argumentos
        Proceso1 hilo1 = new Proceso1(" Hilo2");

        //Establecemos los argumentos gracias al método setArgumento
        hilo1.setArgumento(10);
        System.out.println("");
        hilo3.setArgumento(5);

        //Arrancamos los hilos
        hilo1.start();
        hilo3.start();
    }
}
