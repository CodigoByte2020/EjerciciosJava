package clases;

public class Recursividad {

    int value = 1;

    public void RecursividadConParámetros(int valor) {
        if (valor <= 5) {
            System.out.print(valor + " ");
            RecursividadConParámetros(valor + 1);
        }
    }

    public void SaltoDeLínea() {
        System.out.println("");
    }

    public void RecursividadSinParámetros() {
        if (value <= 5) {
            System.out.print(value + " ");
            value += 1;
            RecursividadSinParámetros();
        }
    }
}
