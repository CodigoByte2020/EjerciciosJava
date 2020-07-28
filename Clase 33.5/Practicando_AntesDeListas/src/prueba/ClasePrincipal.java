package prueba;

import javax.swing.*;

public class ClasePrincipal {

    public static void main(String[] args) {
        int valor1, valor2;
        valor1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer valor"));
        valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));

        //Con constructor
        //Métodos_y_Constructor mensajero1 = new Métodos_y_Constructor(valor1, valor2);
        /*mensajero.Sumar();
        mensajero.Restar();*/
        //mensajero1.Imprimir();
        
        //Métodos con parámetros
        Métodos_y_Parámetros mensajero2 = new Métodos_y_Parámetros();
        mensajero2.Sumar(valor1, valor2);
        mensajero2.Restar(valor1, valor2);
        mensajero2.Imprimir();
    }
}
