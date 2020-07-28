package clases;

import java.util.List;
import java.util.ArrayList;

public class Practicando_ArrayList {

    public static void main(String[] args) {

        List<Integer> números = new ArrayList<>();

        números.add(1);
        números.add(2);
        números.add(3);

        System.out.println("Elemento eliminado: " + números.remove(1));
        System.out.println(números.get(0));
        System.out.println(números.get(1));
        System.out.println(números.contains(3));
        System.out.println(números.size());
        System.out.println(números.isEmpty());

        System.out.println("");

        List<String> cadena = new ArrayList<>();

        cadena.add("Jorge");
        cadena.add("Janeth");
        cadena.add("Luis");
        cadena.add("Gian");
        cadena.add("Mario");
        cadena.add("Janice");
        cadena.add("Lucho");
        cadena.add("Marco");
        cadena.add("Geronimo");
        cadena.add("Danna");
        cadena.add("Sergio");
        cadena.add("Anthony");

        System.out.println(cadena.contains("Janeth"));
        System.out.println(cadena.indexOf("Sergio"));
    }
}
