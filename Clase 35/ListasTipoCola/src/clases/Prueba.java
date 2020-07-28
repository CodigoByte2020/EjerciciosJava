package clases;

public class Prueba {

    public static void main(String[] args) {
        String texto = "10-20-30-40-50";
        //El método split separa elementos dentro de un string, según un delimitador que le pasemos.
        String txt[] = texto.split("-");

        for (int i = 0; i < txt.length; i++) {
            System.out.println(txt[i]);
        }
    }
}
