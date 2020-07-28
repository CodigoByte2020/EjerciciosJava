package clases;

import java.util.ArrayList;
import java.util.List;

public class Practicando_Foreach {

    public static void main(String[] args) {

        /*El ciclo foreach es para imprimir una array o lista siempre y cuando estos ya tengan los elementos insertados, 
        xq sino el iterador del foreach no imprimiría nada*/
        
        List<Object> lista = new ArrayList<>();

        lista.add(30000);
        lista.add(35.254187524150);
        lista.add("Gianmarco");
        lista.add('C');
        lista.add(true);

        //ciclo repetivo for normal
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("");

        //ciclo repetitivo for mejorado
        for (Object i : lista) {
            System.out.println(i);
        }

        System.out.println("--------------------------------------------------");

        //Probando el ciclo foreach con un array
        Object array[] = {10, 52.502510, true, "Gianmarco", 'D'};

        for (Object i : array) {
            System.out.println(i);
        }
    }
}
