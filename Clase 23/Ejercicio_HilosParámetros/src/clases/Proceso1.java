package clases;

public class Proceso1 extends Thread {

    //int DatoArgumento;
    String v1;

    public Proceso1(String nombre, String V1) {
        super(nombre);
        this.v1 = V1;
    }

    @Override
    public void run() {
        int j = 1;
        int i = 1;

        while (j <= (Integer.parseInt(v1))) {
            while (i <= 3) {
                System.out.println("PROCESO 1: Ejecutando subproceso #" + j + "." + i + " - " + getName());
                i += 1;
            }
            i = 1;
            j += 1;
        }
    }

    /*public void setValorArgumento(int valor) {
        this.DatoArgumento = valor;
    }*/
}
