package clases;

public class Recursivity {

    int indicador = 0;

    public int CalCularFactorial(int parámetro) {
        if (parámetro > 0) {
            int ValorCalculado = parámetro * CalCularFactorial(parámetro - 1);
            System.out.println((indicador += 1) + "! = " + ValorCalculado);
            return ValorCalculado;
        } else {
            System.out.println(indicador + "! = " + 1);
            return 1;
        }
    }
}
