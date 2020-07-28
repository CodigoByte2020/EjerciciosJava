package ListaEnlazada_MétodosBásicos.dos;

public class ListaEnlazada2 {

    Nodo2 cabeza;
    int tamaño;

    /*ListaEnlazada2 trola;
    
    public void newww(ListaEnlazada2 vagina) {
        trola = vagina;
    }*/

    public ListaEnlazada2() {
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
            cabeza = new Nodo2(dato);
        } else {
            Nodo2 NuevoNodo = new Nodo2(dato);
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
        Nodo2 temp = cabeza;
        while (contador < índice) {
            temp = temp.ObtenerSiguiente();
            contador += 1;
        }
        return temp.MostrarValor();
    }
}
