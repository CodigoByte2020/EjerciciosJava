package clases;

public class ClasePrincipal {

    public static void main(String[] args) {

        //Creamos los 3 objetos de la clase Nodo
        Nodo primero = new Nodo("Gianmarco");
        Nodo segundo = new Nodo("20");
        Nodo tercero = new Nodo("Contreras");

        //Con el objeto primero llamamos al método EnlazarSiguiente y le pasamos como argumento el objeto segundo
        primero.EnlazarSiguiente(segundo);
        //Y así obtenemos <"Gianmarco >>>20>>>

        //Con el objeto primero llamamos al método Obtener siguiente
        primero.ObtenerSiguiente().EnlazarSiguiente(tercero);
        //<20 >>>"Contreras">>>

        System.out.println(primero.ObtenerSiguiente().ObtenerSiguiente().ObtenerValor().toString());
    }

}
