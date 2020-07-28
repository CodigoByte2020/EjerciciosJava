package lógica;

import java.util.Scanner;

public abstract class LógicaCajero {

    Scanner entrada = new Scanner(System.in);

    protected int DineroRetirado, DineroDepositado;
    private int opción;
    static public int saldo = 1800;
    //static boolean bandera = false;

    public void SolicitarOpción() {
        System.out.println("Por favor seleccione una opción:");
        System.out.println("         1. Consulta de saldo");
        System.out.println("         2. Retiro de efectivo");
        System.out.println("         3. Depósito de efectivo");
        System.out.println("         4. Salir");
        setOpción(entrada.nextInt());
    }

    public abstract void RealizarOperación();

    public void setOpción(int opción) {
        this.opción = opción;
    }

    public int getOpción() {
        return opción;
    }
}
