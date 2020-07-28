package clases;

import javax.swing.*;

public class ClasePrincipal {

    public static void main(String[] args) {
        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));

        MétodosReturn mensajero = new MétodosReturn();
        System.out.println("El resultado de la suma es: " + mensajero.Sumar(valor1, valor2));
        System.out.println("El resultado de la resta es: " + mensajero.Restar(valor1, valor2));
        mensajero.Multiplicar(valor1, valor2);
        mensajero.Dividir(valor1, valor2);

        //System.out.println("La multiplicación es: " + mensajero.Multiplicar(valor1, valor2));
        //System.out.println("La división es: " + mensajero.Dividir(valor1, valor2));
        //mensajero.MostrarResultados(suma, resta, multiplicación, división);
    }
}
