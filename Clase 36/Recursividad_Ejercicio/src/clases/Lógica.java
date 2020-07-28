package clases;

public class Lógica {

    //Recursividad con parámetros
    public void RCParámetros(int valor, int multiplicando, int multiplicador) {
        if (multiplicador <= 5) {
            valor = multiplicando * multiplicador;
            System.out.print(valor + " "); //20 40 60 80 100 
            RCParámetros(valor, multiplicando, multiplicador + 1);
        } else if (multiplicador == 6) {
            System.out.println("");
            System.out.println("FIN DEL EJERCICIO");
            System.out.println("");
        }
    }

    //Recursividad sin Parámetros
    int valor = 0, multiplicando = 20, multiplicador = 1;
    public void RSParámetros() {
        if (multiplicador <= 5) {
            valor = multiplicando * multiplicador;
            System.out.print(valor + " ");
            multiplicador += 1;
            RSParámetros();
        } else if (multiplicador == 6) {
            System.out.println("");
            System.out.println("FIN DEL EJERCICIO");
        }
    }
}
