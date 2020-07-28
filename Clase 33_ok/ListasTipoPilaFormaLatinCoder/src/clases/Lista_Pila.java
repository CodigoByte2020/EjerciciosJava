    package clases;

import javax.swing.*;

public class Lista_Pila {

    private Nodo UltimoValorIngresado; //Cabeza de la pila
    int tamaño;
    String lista = "";

    public Lista_Pila() {
        UltimoValorIngresado = null;
        tamaño = 0;
    }

    //Método para saber si la pila esta vacía
    public boolean PilaVacía() {
        return UltimoValorIngresado == null; //----- devuelve un true
    }

    //Método para insertar nodos
    public void InsertarNodo(Object dato) {
        Nodo NuevoNodo = new Nodo(dato);
        NuevoNodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = NuevoNodo;
        tamaño++;
    }

    //Método para eliminar nodos
    public Object EliminarNodo() {
        Object auxiliar = null;
        if (!PilaVacía()) {
            auxiliar = UltimoValorIngresado.dato;
            UltimoValorIngresado = UltimoValorIngresado.siguiente;
            tamaño--;
        }
        return auxiliar;
    }

    //Método para mostrar el último valor ingresado
    public Object MostrarUltimoValorIngresado() {
        return UltimoValorIngresado.dato;
    }

    //Método para mostrar el tamaño de la pila
    public int TamañoPila() {
        return tamaño;
    }

    //Método para vaciar la pila
    public void VaciarPila() {
        if (!PilaVacía()) {
            while (!PilaVacía()) {
                EliminarNodo();
            }
            JOptionPane.showMessageDialog(null, "La pila se ha vaciado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "La pila está vacía");
        }
    }

    //Método para mostrar el contenido de la pila, guardamos los datos de todos los nodos en la variable lista
    public void MostrarContenido() {
        Nodo temporal = UltimoValorIngresado;
        while (temporal != null) {
            lista = lista + temporal.dato + "\n";
            temporal = temporal.siguiente;
        }
        JOptionPane.showMessageDialog(null, lista);
        lista = "";
    }

    //Método para mostrar el primer valor ingresado, el valor que se encuentra al fondo de la pila
    public Object MostrarPrimerValorIngresado() {
        Nodo temporal = UltimoValorIngresado;
        for (int i = TamañoPila() - 1; i > 0; i--) {
            temporal = temporal.siguiente;
        }
        return temporal.dato;
    }

    //Método para mostrar el valor de una posición determinada
    public void MostrarValor(int posición) {
        Nodo temporal = UltimoValorIngresado;
        if (posición >= 0 && posición < TamañoPila()) {
            for (int i = TamañoPila() - 1; i > posición; i--) {
                temporal = temporal.siguiente;
            }
            JOptionPane.showMessageDialog(null, temporal.dato);
        } else {
            JOptionPane.showMessageDialog(null, "La posición ingresada no existe");
        }
    }
}
