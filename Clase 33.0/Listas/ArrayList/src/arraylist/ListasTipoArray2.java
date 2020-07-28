package arraylist;

import java.util.List;
import java.util.ArrayList;

public class ListasTipoArray2 {

    public static void main(String[] args) {

        List<String> ColecciónExs = new ArrayList<>();
        ColecciónExs.add("Roxana");
        ColecciónExs.add("Rubí");
        ColecciónExs.add("Melina");

        System.out.println(ColecciónExs.get(0));
        System.out.println(ColecciónExs.get(1));
        System.out.println(ColecciónExs.get(2));

        System.out.println(ColecciónExs.contains("Melina"));
        System.out.println(ColecciónExs.isEmpty());
        System.out.println(ColecciónExs.indexOf("Rubí"));

        //ColecciónExs.removeAll(ColecciónExs);
    }
}
