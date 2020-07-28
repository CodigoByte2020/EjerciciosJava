package clases;

public class ListaTipoPila {

    Nodo UltimoValorIngresado;

    public ListaTipoPila() {
        UltimoValorIngresado = null;
    }

    public void Insertar(char dato) {
        Nodo NuevoNodo = new Nodo(dato);
        NuevoNodo.dato = dato;
        NuevoNodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = NuevoNodo;
    }

    public char Eliminar() {
        if (UltimoValorIngresado != null) {
            char dato = UltimoValorIngresado.dato;
            UltimoValorIngresado = UltimoValorIngresado.siguiente;
            return dato;
        } else {
            return Character.MAX_VALUE; //???????????????????
        }
    }
}
