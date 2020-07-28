package ListaEnlazadaFinal;

public class Nodo3 {

    Object valor;
    Nodo3 siguiente;

    public Nodo3(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Object MostrarValor() {
        return valor;
    }

    public void EnlazarSiguiente(Nodo3 n) {
        siguiente = n;
    }

    public Nodo3 ObtenerSiguiente() {
        return siguiente;
    }
}
