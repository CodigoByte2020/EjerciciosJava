package ListaEnlazada_MétodosBásicos;

public class Nodo {

    Object valor;
    Nodo siguiente;

    public Nodo(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Object MostrarValor() {
        return valor;
    }

    public void EnlazarSiguiente(Nodo n) {
        siguiente = n;
    }

    public Nodo ObtenerSiguiente() {
        return siguiente;
    }
}
