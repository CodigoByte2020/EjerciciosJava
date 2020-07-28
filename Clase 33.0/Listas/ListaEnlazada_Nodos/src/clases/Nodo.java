package clases;

public class Nodo {

    Object valor;
    Nodo siguiente;

    public Nodo(Object valor) { //Gianmarco<null> --- 20<null> --- Contreras<null>
        this.valor = valor;
        this.siguiente = null;
    }

    public Object ObtenerValor() {
        return valor;
    }

    public void EnlazarSiguiente(Nodo n) {
        this.siguiente = n;
    }

    public Nodo ObtenerSiguiente() {
        return siguiente;
    }
}
