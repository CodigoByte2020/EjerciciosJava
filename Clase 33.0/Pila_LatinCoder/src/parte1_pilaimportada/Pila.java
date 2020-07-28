package parte1_pilaimportada;

import java.util.Stack;

public class Pila {

    public static void main(String[] args) {
        Stack pila = new Stack();

        pila.push(5); //PUSH: para añadir un elemento
        pila.push(10);
        pila.push(15);
        pila.push(20);
        
        /*pila.pop();
        System.out.println(pila.peek());*/

        for (int i = 1; i <= 4; i++) {
            System.out.println(pila.peek()); //PEEK: para ver el último elemento
            System.out.println(pila.pop()); //POP: para sacar el elemento final
        }

        System.out.println(pila.empty()); //EMPTY: para saber si la pila esta vacía
    }
}
