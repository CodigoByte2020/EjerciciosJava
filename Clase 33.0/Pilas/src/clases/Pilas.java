package clases;

public class Pilas {

    public void AgregarPila(Nodo pila, int valor) {
        Nodo NuevoNodo = new Nodo();
        NuevoNodo.dato = valor;
        NuevoNodo.siguiente = pila;
        pila = NuevoNodo;
    }
}
