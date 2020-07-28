package ListaEnlazada_MétodosBásicos.dos;

public class Nodo2 {

    Object valor;
    Nodo2 siguiente;

    public Nodo2(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Object MostrarValor() {
        return valor;
    }

    public void EnlazarSiguiente(Nodo2 n) {
        siguiente = n;
    }

    public Nodo2 ObtenerSiguiente() {
        return siguiente;
    }
}
