package ListaEnlazadaFinalOk;

public class ListaEnlazada3Ok {

    Nodo3Ok cabeza;
    int tamaño;

    public ListaEnlazada3Ok() {
        cabeza = null;
        tamaño = 0;
    }

    public boolean ListaVacía() {
        boolean vacío;
        if (cabeza == null) {
            vacío = true;
        } else {
            vacío = false;
        }
        return vacío;
    }

    public void AñadirNodo(Object dato) {
        if (cabeza == null) {
            cabeza = new Nodo3Ok(dato);
        } else {
            Nodo3Ok NuevoNodo = new Nodo3Ok(dato);
            NuevoNodo.EnlazarSiguiente(cabeza);
            cabeza = NuevoNodo;
        }
        tamaño += 1;
    }

    public int Tamaño() {
        return tamaño;
    }

    public Object RetornarPosición(int índice) {
        int contador = 0;
        Nodo3Ok temp = cabeza;
        while (contador < índice) {
            temp = temp.ObtenerSiguiente();
            contador += 1;
        }
        return temp.MostrarValor();
    }

    public void EliminarPrimero() {
        cabeza = cabeza.ObtenerSiguiente();
        tamaño -= 1;
    }

    public void Eliminar(int índex) {
        if (índex == 0) {
            cabeza = cabeza.ObtenerSiguiente();
        } else {
            int contador = 0;
            Nodo3Ok NodoTemp = cabeza;
            while (contador < índex - 1) {
                NodoTemp = NodoTemp.ObtenerSiguiente();
                contador += 1;
            }
            NodoTemp.EnlazarSiguiente(NodoTemp.ObtenerSiguiente().ObtenerSiguiente());
        }
        tamaño -= 1;
    }

    public void Cortar(int índex) {
        int contador = 0;
        Nodo3Ok NodoTemp = cabeza;
        while (contador < índex - 1) {
            NodoTemp = NodoTemp.ObtenerSiguiente();
            contador += 1;
        }
        NodoTemp.EnlazarSiguiente(null);
        tamaño = índex;
    }
}
