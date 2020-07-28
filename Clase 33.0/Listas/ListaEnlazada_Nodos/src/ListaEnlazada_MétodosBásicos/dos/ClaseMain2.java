package ListaEnlazada_MétodosBásicos.dos;

public class ClaseMain2 {

    public static void main(String[] args) {
        ListaEnlazada2 lista = new ListaEnlazada2();

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
        System.out.println("El último elemento es: " + lista.RetornarPosición(lista.Tamaño() - 1));
    }
}
