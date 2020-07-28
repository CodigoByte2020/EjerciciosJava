package listastipopila;

import javax.swing.*;

public class Pila {

    Nodo UltimoValorIngresado;
    int tamaño;
    String lista = "";

    public Pila() {
        UltimoValorIngresado = null;
        tamaño = 0;
    }

    //Método para insertar un nodo en la pila
    public void InsertarNodo(int dato) {
        Nodo NuevoNodo = new Nodo(dato);
        NuevoNodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = NuevoNodo;
        tamaño += 1;
    }

    //Método para eliminar un nodo en la pila
    public int EliminarNodo() {
        int auxiliar = UltimoValorIngresado.dato;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamaño -= 1;
        return auxiliar;
    }

    //Método para saber cuando la pila está vacía
    public boolean PilaVacía() {
        boolean vacío = false;
        if (UltimoValorIngresado == null) {
            vacío = true;
        }
        return vacío;
    }

    //Método para conocer cual es el ultimo valor ingresado
    public int UltimoValorIngresado() {
        return UltimoValorIngresado.dato;
    }

    //Método para conocer el tamaño de la pila
    public int TamañoPila() {
        return tamaño;
    }

    //Método para vaciar la pila
    public void VaciarPila() {
        EliminarNodo();
    }

    //Método para mostrar el contenido de la pila
    public String MostrarContenido() {
        Nodo temporal = UltimoValorIngresado;
        while (temporal != null) {
            lista = lista + temporal.dato + "\n";
            temporal = temporal.siguiente;
        }
        return lista;
    }
}
