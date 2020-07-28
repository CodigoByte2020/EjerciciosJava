package ejercicio3;

public class Lógica3 {

    public void ImprimirRangoAscendente(int inicio, int fin) {
        if (fin > inicio) {
            ImprimirRangoAscendente(inicio, fin - 1);
            System.out.println(fin);
        } else if (fin == inicio) {
            System.out.println(fin);
        }
    }
}
