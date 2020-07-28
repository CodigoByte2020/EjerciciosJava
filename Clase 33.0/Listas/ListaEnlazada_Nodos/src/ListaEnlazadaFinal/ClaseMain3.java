package ListaEnlazadaFinal;

public class ClaseMain3 {

    public static void main(String[] args) {
        ListaEnlazada3 lista = new ListaEnlazada3();

        System.out.println("Lista Vacía: " + lista.ListaVacía());

        lista.AñadirNodo("Gianmarco");
        lista.AñadirNodo(20);
        lista.AñadirNodo(4.5);
        lista.AñadirNodo('C');

        System.out.println(lista.RetornarPosición(0));
        System.out.println(lista.RetornarPosición(1));
        System.out.println(lista.RetornarPosición(2));
        System.out.println(lista.RetornarPosición(3));

        System.out.println("Lista Vacía: " + lista.ListaVacía());

        System.out.println("El tamaño de la lista es: " + lista.Tamaño());
        System.out.println("El primer elemento es: " + lista.RetornarPosición(0));
        System.out.println("Se elimina el primer elemento");
        lista.EliminarPrimero();
        System.out.println("El primer elemento es: " + lista.RetornarPosición(0));
        //lista.Eliminar(1);
        System.out.println("Posición [1] = " + lista.RetornarPosición(1));
        System.out.println("El último elemento es: " + lista.RetornarPosición(lista.Tamaño() - 1));
        lista.Cortar(2);
        System.out.println("El último elemento es: " + lista.RetornarPosición(lista.Tamaño() - 1));        
    }
}
