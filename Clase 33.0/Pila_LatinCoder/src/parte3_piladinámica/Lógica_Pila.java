package parte3_piladinámica;

public class Lógica_Pila {

    String array[];
    int ApuntadorPila = 0;

    public Lógica_Pila() {
        array = new String[3];
    }

    //www.youtube.com/watch?v=v8Qqo7r6ZGs
    //Método para añadir un elemento
    public void push(String cadena) {
        if (ApuntadorPila < array.length) {
            array[ApuntadorPila] = cadena;
            System.out.println(array[ApuntadorPila]);
            ApuntadorPila += 1;
        } else {
            String temporal[] = new String[array.length + 3]; //Creamos un array temporal con 3 posiciones mas que el array actual
            for (int i = 0; i < array.length; i++) {
                temporal[i] = array[i]; //Copiamos la información del array actual en el array temporal
            }
            array = temporal; //Copiamos todo(posiciones y contenido) del array temporal en el array actual
            array[ApuntadorPila] = cadena;
            System.out.println(array[ApuntadorPila]);
            ApuntadorPila += 1;
        }
    }

    //Método para eliminar el elemento final - Reduciendo el tamaño del array
    public void pop() {
        if (ApuntadorPila > 0) {
            boolean bandera = false;
            int i = 0;
            System.out.println(array[ApuntadorPila - 1]);
            array[ApuntadorPila - 1] = null;
            ApuntadorPila -= 1;
 
            for (i = 0; i < array.length && bandera == false; i++) {
                if (array[i + 1] == null) { //Verificamos que posición del array actual es null
                    bandera = true;
                }
            }

            String temporal[] = new String[i];

            for (i = 0; i < temporal.length; i++) {
                temporal[i] = array[i]; //Copiamos la información del array actual en el array temporal
            }
            array = temporal; //Copiamos todo(posiciones y contenido) del array temporal en el array actual
        }
    }

    //Método para mostrar el último elemento
    public void peek() {
        if (ApuntadorPila > 0) {
            System.out.println(array[ApuntadorPila - 1]);
        }
    }

    //Método para saber si la pila está vacía
    public void empty() {
        if (ApuntadorPila == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
