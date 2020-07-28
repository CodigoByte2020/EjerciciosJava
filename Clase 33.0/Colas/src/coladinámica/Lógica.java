package coladinámica;

import java.util.Scanner;

public class Lógica {

    String ColaDinámica[] = new String[1];
    private int frente = 0, fin = 1;
    private String temporal[];
    private Scanner entrada = new Scanner(System.in);

    //Insertar datos en la cola
    public void Insertar() {
        
        System.out.print("Insertar elemento: ");
        if (ColaDinámica[frente] == null) { //Verificamos si la primera posición de la cola esta vacía o llena
            ColaDinámica[frente] = entrada.nextLine();
        } else if (ColaDinámica[frente] != null) {
            temporal = new String[ColaDinámica.length + 1]; //Creamos una cola temporal con 1 posición más que la cola original
            for (int i = 0; i < ColaDinámica.length; i++) {
                temporal[i] = ColaDinámica[i]; //Realizamos el correspondiente intercambio de valores entre las 2 colas
            }
            ColaDinámica = temporal; //Guardamos el número de posiciones y los datos de la cola temporal en la cola original
            ColaDinámica[fin] = entrada.nextLine(); //Guardamos el dato ingresado por el usuario en la posición final de la cola
            fin += 1; //Corremos el valor de fin una posición a la derecha
        }
    }

    //Eliminar datos de la cola
    public void Eliminar() {

        if (ColaDinámica[frente] != null) { //Verificamos si la primera posición de la cola esta vacía o llena
            int i;
            System.out.print("Eliminar elemento: " + ColaDinámica[frente]);
            if (ColaDinámica.length >= 2) { //Comprobamos la longitud de la Cola Dinámica
                for (i = 0; i < ColaDinámica.length - 1; i++) {
                    ColaDinámica[i] = ColaDinámica[i + 1]; //Corremos todos los valores de la Cola Dinámica hacia la izquierda
                }
                if (ColaDinámica.length >= 3) {
                    fin -= 1;
                }
                ColaDinámica[i] = null; //Anulamos la posición final de la cola dinámica
                temporal = new String[ColaDinámica.length - 1]; //Creamos una cola temporal con 1 posición menos que la cola original
                for (int j = 0; j < temporal.length; j++) {
                    temporal[j] = ColaDinámica[j]; //Realizamos el correspondiente intercambio de valores entre las 2 colas
                }
                ColaDinámica = temporal; //Guardamos el número de posiciones y los datos de la cola temporal en la cola original
            } else if (ColaDinámica.length == 1) {
                ColaDinámica[frente] = null;
            }
            System.out.println("");
        }
    }

    //Consultar datos de la cola
    public void Consultar() {
        if (ColaDinámica[frente] != null) { //Comprobamos si la primera posición de la cola es diferente a null
            System.out.println("Consultar elemento: " + ColaDinámica[frente]);
        }
    }
}
