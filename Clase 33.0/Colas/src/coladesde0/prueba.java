package coladesde0;

public class prueba {

    public static void main(String[] args) {
        String pinga[] = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println(pinga[i]);
        }

        //Cuándo es un array de tipo int no se puede ingresar null
        for (int i = 0; i < 5; i++) {
            pinga[i] = null;
            System.out.println(pinga[i]);
        }
    }
}
