package parte2_piladesde0;

public class Lógica_Pila {

    String array[];
    int tamaño;
    int ApuntadorPila = 0;

    public Lógica_Pila(int tamaño) {
        this.tamaño = tamaño;
        array = new String[tamaño];
    }

    public void push(String cadena) {
        if (ApuntadorPila < array.length) {
            array[ApuntadorPila] = cadena;
            System.out.println(array[ApuntadorPila]);
            ApuntadorPila += 1;
        }
    }

    public void pop() {
        if (ApuntadorPila > 0) {
            System.out.println(array[ApuntadorPila - 1]);
            array[ApuntadorPila - 1] = null;
            ApuntadorPila -= 1;
        }
    }

    public void peek() {
        if (ApuntadorPila > 0) {
            System.out.println(array[ApuntadorPila - 1]);
        }
    }

    public void empty() {
        if (ApuntadorPila == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
