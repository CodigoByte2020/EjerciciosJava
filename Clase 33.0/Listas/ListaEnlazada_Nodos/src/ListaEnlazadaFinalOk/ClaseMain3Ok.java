package ListaEnlazadaFinalOk;

public class ClaseMain3Ok {

    public static void main(String[] args) {
        ListaEnlazada3Ok lista = new ListaEnlazada3Ok();

        System.out.print("¿La lista esta vacía? " + lista.ListaVacía());

        lista.AñadirNodo("Vagina");
        lista.AñadirNodo('C');
        lista.AñadirNodo(2020);
        lista.AñadirNodo("Pene");
        lista.AñadirNodo(4.8);

        System.out.println("");
        
        for (int i = 0; i < lista.Tamaño(); i++) {
            System.out.println("Lista.Posición[" + i + "] = " + lista.RetornarPosición(i));
        }

        lista.Eliminar(2);
        lista.EliminarPrimero();
        lista.Cortar(3);
        System.out.println(lista.RetornarPosición(1));
    }
}
