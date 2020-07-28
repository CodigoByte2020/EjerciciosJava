package clases;

public class Proceso1 extends Thread {

    private int argumento;

    public Proceso1(String nombre) {
        //Con la palabra reservada super, le indicamos que vamos a utilizar un parámetro       
        super(nombre);
    }

    @Override
    public void run() {
        for (int i = 1; i <= argumento; i += 1) {
            System.out.println(i + this.getName());
        }
    }

    public void setArgumento(int valor) {
        this.argumento = valor;
    }
}
