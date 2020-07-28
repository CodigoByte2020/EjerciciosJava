package coladesde0;

import java.util.Scanner;

public class Cola_Lógica {

    private Scanner entrada = new Scanner(System.in);
    String cola[];
    private int frente, fin, IntercambioEliminaciones;
    private boolean bandera = false;

    public Cola_Lógica(int posiciones) {
        cola = new String[posiciones];
        frente = 0;
        fin = 1;
        IntercambioEliminaciones = posiciones - 1;
    }

    //Método para insertar datos en la cola
    public void Insertar() {

        if (fin < cola.length) { //Primero se verifica que el fin de la pila no esté apuntando afuera de la cola
            System.out.print("Ingrese un elemento en la cola: ");
            if (bandera == false) { //Esta variable nos ayudará a determinar si ya se ejecutó la operación insertar al menos una vez
                cola[frente] = entrada.nextLine();
                bandera = true;
            } else if (bandera == true) {
                cola[fin] = entrada.nextLine();
                fin += 1;
            }
        }
    }

    //Método para eliminar datos de la cola
    public void Eliminar() {

        int i = 0; //Nos ayudará a contar la cantidad de intercambio de elementos 

        if (cola[frente] != null) { //Verificamos si la primera posición de la cola esta vacía
            System.out.println("Elemento eliminado: " + cola[0]);
            for (; i < IntercambioEliminaciones; i++) { //Establecemos cuantos intercambios de posiciones por cada eliminación se ejecutarán
                cola[i] = cola[i + 1]; //Realizamos el intercambio de posiciones en la cola
            }
            cola[i] = null; //Establecemos el valor nulo a las posiciónes sin ningún valor
            IntercambioEliminaciones -= 1;
        }
    }

    //Método para consultar el primer elemento de la cola
    public void Consultar() {
        if (cola[frente] != null) { //Verficamos si la primera posición de la cola esta vacía
            System.out.println("El primer elemento es: " + cola[frente]);
        }
    }
}
