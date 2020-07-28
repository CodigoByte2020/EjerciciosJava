package ListaEnlazada_MétodosBásicos;

public class ClaseMain {

    public static void main(String[] args) {

        ListaEnlazada lista = new ListaEnlazada();

        System.out.println("Esta vacía: " + lista.Vacía());

        lista.AñadirNodo(30);
        lista.AñadirNodo(8.5);
        lista.AñadirNodo(20);
        lista.AñadirNodo("Eliot");
        lista.AñadirNodo(7);

        System.out.println(lista.ObtenerTamaño());
        System.out.println(lista.ObtenerPosición(4));
    }
}
