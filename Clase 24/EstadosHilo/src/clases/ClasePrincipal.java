package clases;

public class ClasePrincipal {

    public static void main(String[] args) {

        //El primer estado es cuando el hilo ha sido creado pero no inicializado
        ProcesoHilo hilo1 = new ProcesoHilo("Hilo 1");
        ProcesoHilo hilo2 = new ProcesoHilo("Hilo 2");

        //El segundo estado es cuando el hilo ha sido inicializado gracias al método start() y entra en ejecución por que llama al método run()
        hilo1.start();

        //El tercer estado es cuando el hilo esta en ejecución pero existe una tarea que se lo impide (método sleep)
        try {
            hilo1.sleep(1000); //Estos milisegundos se cuentan desde que inicializamos el hilo
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo1: " + e);
        }

        //El hilo1 se despierta      
        hilo2.start(); //Inicializamos el hilo2
        //Y como los hilos se ejecutan de manera simultánea, ahora hilo1 é hilo2 se ejecutarán de manera simultánea
        //hilo2.stop(); //Matamos al hilo2

        try {
            hilo2.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo2: " + e);
        }
    }
}
