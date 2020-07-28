package prueba;

import com.sun.nio.sctp.AssociationChangeNotification;
import javax.swing.JOptionPane;

public class ClaseMain {

    static int resultado = 20, trola = 69;

    public static void main(String[] args) {

        int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor"));
        int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
        //ClaseMain mensajero = new ClaseMain(valor1, valor2);

        //Cuando es una variable o un método de tipo estático al cambiar el valor de estos, se cambian en todos los objetos.
        ClaseMain mensajero = new ClaseMain();
        ClaseMain mensajero2 = new ClaseMain();

        mensajero.trola = 850;

        System.out.println(mensajero.trola);
        System.out.println(mensajero2.trola);

        System.out.println(mensajero.Sumar(valor1, valor2));
        System.out.println(mensajero2.Sumar(valor1, valor2));

        //System.out.println(ClaseMain.Restar(valor1, valor2));
        //System.out.println(mensajero2.Sumar(valor1, valor2));
    }

    //Los constructores se usan cuando programamos con mínimo 2 clases y queremos inicializar atributos desde otra clase.
    /*public ClaseMain(int valor1, int valor2) {
        resultado = valor1 * valor2;
    }*/
    public static int Sumar(int valor1, int valor2) {
        resultado = valor1 + valor2;
        return resultado;
    }

    public static int Restar(int valor1, int valor2) {
        resultado = valor1 - valor2;
        return resultado;
    }
}
