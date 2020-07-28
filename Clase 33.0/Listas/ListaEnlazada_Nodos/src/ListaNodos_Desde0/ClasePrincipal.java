package ListaNodos_Desde0;

public class ClasePrincipal {

    public static void main(String[] args) {
        Nodo nodo1 = new Nodo("Eliot");
        Nodo nodo2 = new Nodo(20);
        Nodo nodo3 = new Nodo(8.5);
        Nodo nodo4 = new Nodo(30);

        /*nodo1.EnlazarSiguiente(nodo2); //<"Eliot">>>20>>>

        nodo1.ObtenerSiguiente().EnlazarSiguiente(nodo3); //<20>>>8.5>>>
        
        nodo2.ObtenerSiguiente().EnlazarSiguiente(nodo4);*/ //<8.5>>>30>>>
        
        nodo1.EnlazarSiguiente(nodo2);
        //nodo1.ObtenerSiguiente(); //20 //Llamar a este método de forma opcional

        nodo2.EnlazarSiguiente(nodo3);
        //nodo2.ObtenerSiguiente(); //8.5

        nodo3.EnlazarSiguiente(nodo4);
        //nodo3.ObtenerSiguiente(); //30

        //System.out.println(nodo3.ObtenerSiguiente()); //Error: ListaNodos_Desde0.Nodo@15db9742
        
        //2 formas distintas de obtener el valor del último nodo
        System.out.println(nodo3.ObtenerSiguiente().MostrarValor());
        System.out.println(nodo1.ObtenerSiguiente().ObtenerSiguiente().ObtenerSiguiente().MostrarValor());
        //<<<<<<<<<<<<<<<<<<<<<<<20>>>>>>>>>>>>>>8.5>>>>>>>>>>>>>>>>8.5>>>>>>        30
    }
}
