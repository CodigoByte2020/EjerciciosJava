package ListaNodos_Desde0_MiManera;

public class NodoLógica {

    Object valor;
    NodoLógica siguiente;
    //ClaseMain trola;

    public NodoLógica(Object valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public NodoLógica EnlazarSiguiente(NodoLógica n) {
        siguiente = n;
        //trola.j = 20; Probando objetos
        return siguiente;
    }

    public Object ObtenerValor() {
        return valor;
    }
}
