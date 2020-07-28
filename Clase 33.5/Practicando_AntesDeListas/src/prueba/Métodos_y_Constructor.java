package prueba;

import javax.swing.*;

public class Métodos_y_Constructor {

    int valor1, valor2, resultado;

    public Métodos_y_Constructor(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void Sumar() {
        resultado = valor1 + valor2;
        JOptionPane.showMessageDialog(null, "La suma es: " + resultado);
    }

    public void Restar() {
        resultado = valor1 - valor2;
        JOptionPane.showMessageDialog(null, "La resta es: " + resultado);
    }

    public void Imprimir() {
        Sumar();
        Restar();
    }
}
