package arraylist;

import java.util.List;
import java.util.ArrayList;


public class ListasTipoArray1 {

    public static void main(String[] args) {
        
        List<Integer> Números = new ArrayList<>();

        Números.add(5);
        Números.add(10);
        Números.add(15);
        
        System.out.println("Tamaño del ArrayList: " + Números.size());
        Números.remove(1);
        System.out.println(Números.get(0));
        System.out.println(Números.get(1));
    }
}
