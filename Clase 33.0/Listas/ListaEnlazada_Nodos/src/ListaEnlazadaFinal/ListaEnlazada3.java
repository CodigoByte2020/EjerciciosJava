package ListaEnlazadaFinal;

public class ListaEnlazada3 {

    Nodo3 cabeza;
    int tamaño;

    /*ListaEnlazada3 trola;
    
    public void newww(ListaEnlazada3 vagina) {
        trola = vagina;
    }*/
    public ListaEnlazada3() {
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
            cabeza = new Nodo3(dato);
        } else {
            Nodo3 NuevoNodo = new Nodo3(dato);
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
        Nodo3 temp = cabeza;
        while (contador < índice) {
            temp = temp.ObtenerSiguiente();
            contador += 1;
        }
        return temp.MostrarValor();
    }

    public void EliminarPrimero() {
        /*Mi manera: Nodo3 temp = cabeza.ObtenerSiguiente();
        cabeza = null;*/
        cabeza = cabeza.ObtenerSiguiente();
        tamaño -= 1;
    }

    public void Eliminar(int index) {
        if (index == 0) {
            cabeza = cabeza.ObtenerSiguiente();
        } else {
            int contador = 0;
            Nodo3 temp = cabeza;
            //Mi manera: while (contador < index) {
            while (contador < index - 1) {
                temp = temp.ObtenerSiguiente();
                contador += 1;
            }
            temp.EnlazarSiguiente(temp.ObtenerSiguiente().ObtenerSiguiente());
        }
        tamaño -= 1;
    }

    public void Cortar(int index) {
        int contador = 0;
        Nodo3 temp = cabeza;
        while (contador < index - 1) {
            temp = temp.ObtenerSiguiente();
            contador += 1;
        }
        temp.EnlazarSiguiente(null);
        tamaño = index;
    }
}
