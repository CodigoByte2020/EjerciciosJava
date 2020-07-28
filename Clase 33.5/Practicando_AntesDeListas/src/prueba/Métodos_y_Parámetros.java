package prueba;

import javax.swing.JOptionPane;

public class Métodos_y_Parámetros {

    int suma, resta;

    public void Sumar(int valor1, int valor2) {
        suma = valor1 + valor2;
    }

    public void Restar(int valor1, int valor2) {
        resta = valor1 - valor2;
    }

    public void Imprimir() {
        JOptionPane.showMessageDialog(null, "La suma es: " + suma);
        JOptionPane.showMessageDialog(null, "La resta es: " + resta);
    }
}
