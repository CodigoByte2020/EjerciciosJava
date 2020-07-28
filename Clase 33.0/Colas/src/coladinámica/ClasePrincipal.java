package coladinámica;

public class ClasePrincipal {

    public static void main(String[] args) {
        Lógica mensajero = new Lógica();
        mensajero.Consultar();
        mensajero.Eliminar();
        mensajero.Insertar();
        mensajero.Insertar();
        mensajero.Insertar();

        System.out.println("");
        for (int i = 0; i < mensajero.ColaDinámica.length; i++) {
            System.out.println("Cola.Posición[" + i + "] = " + mensajero.ColaDinámica[i]);
        }

        System.out.println("");
        System.out.print("Tamaño de la Cola Dinámica: " + mensajero.ColaDinámica.length);
        System.out.println("");

        mensajero.Eliminar();
        mensajero.Eliminar();
        System.out.println("");

        for (int i = 0; i < mensajero.ColaDinámica.length; i++) {
            System.out.println("Cola.Posición[" + i + "] = " + mensajero.ColaDinámica[i]);
        }
        
        System.out.println("");
        System.out.print("Tamaño de la Cola Dinámica: " + mensajero.ColaDinámica.length);
        System.out.println("");
        mensajero.Consultar();
        mensajero.Consultar();
    }
}
