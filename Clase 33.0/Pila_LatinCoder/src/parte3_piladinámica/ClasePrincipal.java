package parte3_piladinámica;

public class ClasePrincipal {

    public static void main(String[] args) {
        Lógica_Pila pila = new Lógica_Pila();

        pila.push("Ella ");
        pila.push("no ");
        pila.push("te ");
        pila.push("ama ");
        pila.push("imbécil");

        System.out.println("");
        System.out.println("Longitud actual de la pila: " + pila.array.length);
        System.out.print("Eliminamos el último elemento: ");
        pila.pop();
        System.out.println("Longitud actual de la pila: " + pila.array.length);
        System.out.print("Mostramos el último elemento: ");
        pila.peek();
        pila.empty();
    }
}
