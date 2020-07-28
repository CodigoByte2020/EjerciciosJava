package parte2_piladesde0;

public class ClasePrincipal {

    public static void main(String[] args) {
        Lógica_Pila pila = new Lógica_Pila(3);

        pila.push("Hola");
        pila.push("Mundo");
        pila.push("Loco");
        /*Estos 2 elementos se están desbordando de la pila
        pila.push("Trola"); 
        pila.push("Vagina");*/

        pila.pop();
        pila.peek();
        pila.empty();
    }
}
