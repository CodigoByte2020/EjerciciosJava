package colaimportada;

import java.util.Queue;
import java.util.PriorityQueue;

public class ColaImportada {

    public static void main(String[] args) {

        Queue<String> cola = new PriorityQueue<>();

        for (int i = 0; i < 10; i++) {
            cola.offer(Integer.toString(i)); //Método offer: añadir un elemento.
        }

        /*while (cola.peek() != null) { //Método peek: consultar elemento
            System.out.println(cola.poll()); //Método pool: eliminar elemento.
        }*/
        
        for (int i = 0; i < 10; i++) {
            System.out.println(cola.peek());
        }
        
        cola.peek();
        cola.peek();
        cola.peek();
        cola.peek();
        cola.peek();
        
    }
}
