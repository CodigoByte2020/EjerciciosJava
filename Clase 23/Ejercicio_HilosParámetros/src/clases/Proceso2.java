package clases;

public class Proceso2 extends Thread {

    //int DatoArgumento;
    String v2;

    public Proceso2(String nombre, String V2) {
        super(nombre);
        this.v2 = V2;
    }

    @Override
    public void run() {
        int j = 1;
        int i = 1;

        while (j <= (Integer.parseInt(v2))) {
            while (i <= 3) {
                System.out.println("PROCESO 2: Ejecutando subproceso #" + j + "." + i + " - " + getName());
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
