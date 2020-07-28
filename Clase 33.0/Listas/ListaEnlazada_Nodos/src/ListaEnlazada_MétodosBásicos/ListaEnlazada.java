package ListaEnlazada_MétodosBásicos;

public class ListaEnlazada {

    Nodo cabeza;
    int tamaño;

    public ListaEnlazada() {
        cabeza = null;
        tamaño = 0;
    }

    public boolean Vacía() {
        boolean vacío = false;
        if (cabeza == null) {
            vacío = true;
        } else {
            vacío = false;
        }
        return vacío;
    }

    public void AñadirNodo(Object nudillo) {
        if (cabeza == null) {
            cabeza = new Nodo(nudillo);
        } else {
            Nodo NodoNuevo = new Nodo(nudillo);
            NodoNuevo.EnlazarSiguiente(cabeza);
            cabeza = NodoNuevo;
        }
        tamaño += 1;
    }

    public int ObtenerTamaño() {
        return tamaño;
    }

    public Object ObtenerPosición(int index) {
        int contador = 0;
        Nodo temporal = cabeza;
        while (contador < index) {
            temporal = temporal.ObtenerSiguiente();
            contador += 1;
        }
        return temporal.MostrarValor();
    }
}
