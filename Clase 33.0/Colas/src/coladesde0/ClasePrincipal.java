package coladesde0;

public class ClasePrincipal {

    public static void main(String[] args) {

        Cola_Lógica cola = new Cola_Lógica(6);

        cola.Eliminar();
        cola.Consultar();

        for (int i = 0; i < cola.cola.length; i++) {
            cola.Insertar();
        }

        cola.Insertar();
        System.out.println("");

        for (int i = 0; i < cola.cola.length; i++) {
            System.out.println(cola.cola[i]);
        }

        System.out.println("");
        cola.Eliminar();
        cola.Eliminar();
        cola.Eliminar();
        System.out.println("");

        for (int i = 0; i < cola.cola.length; i++) {
            System.out.println(cola.cola[i]);
        }

        System.out.println("");
        cola.Consultar();
        cola.Consultar();
    }
}
