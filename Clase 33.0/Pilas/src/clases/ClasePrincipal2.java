//Intentando realizar según progrmación ATS

package clases;

class Nod {
    int dato;
    Nod siguiente;
};

//void AgrPila(Nodo, int);
public class ClasePrincipal2 {

    public static void main(String[] args) {
        Nod pi = null;
    }

    void APila(Nodo pila, int n) {
        Nod NN = new Nod();
        NN.dato = n;
        NN.siguiente = Nod.pi;
        pi = NN;
        System.out.println(pila);
    }

}
