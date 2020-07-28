package decimales;

import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClasePrincipal {

    public static void main(String[] args) {
        double número = 2;
        double raíz = Math.sqrt(número);

        System.out.println("La raíz cuadrada de " + número + " = " + raíz);

        //Utilizando la clase DecimalFormat *********************
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("La raíz cuadrada de " + número + " = " + df.format(raíz));

        //Utilizando String format  ***********************
        System.out.println("La raíz cuadrada de " + número + " = " + String.format("%.2f", raíz));

        //Utilizando la clase Math y el método Round
        System.out.println("La raíz cuadrada de " + número + " = " + (double) Math.round(raíz * 100d) / 100);

        //Utilizando la clase BigDecimal
        BigDecimal bd = new BigDecimal(raíz);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println("La raíz cuadrada de " + número + " = " + bd.doubleValue());
    }
}
