package ListaNodos_Desde0_MiManera;

public class ClaseMain {

    //int j = 2;
    NodoLógica puntero;

    public static void main(String[] args) {

        NodoLógica nodo_1 = new NodoLógica("Eliot");
        NodoLógica nodo_2 = new NodoLógica(20);
        NodoLógica nodo_3 = new NodoLógica(8.5);
        NodoLógica nodo_4 = new NodoLógica(30);

        //Enlazamos todos los nodos
        nodo_1.EnlazarSiguiente(nodo_2); //>>>20>>>
        nodo_2.EnlazarSiguiente(nodo_3); //>>>8.5>>>
        nodo_3.EnlazarSiguiente(nodo_4); //>>>30>>>

        //Impremimos: Desde el nodo_1 enlazamos hasta el nodo_4 e imprimimos este nodo
        System.out.println(nodo_1.EnlazarSiguiente(nodo_2).EnlazarSiguiente(nodo_3).EnlazarSiguiente(nodo_4).ObtenerValor());
    }
    
    /*Probando punteros
    public void bug() {
        puntero.siguiente.ObtenerValor();
        puntero.ObtenerValor();
    }*/
}
