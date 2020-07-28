package ListaEnlazadaFinalOk;

public class Nodo3Ok {

    Object valor;
    Nodo3Ok siguiente;

    public Nodo3Ok(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public Object MostrarValor() {
        return valor;
    }

    public void EnlazarSiguiente(Nodo3Ok n) {
        siguiente = n;
    }

    public Nodo3Ok ObtenerSiguiente() {
        return siguiente;
    }
}
