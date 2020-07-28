package lógica;

public class DepósitoDeSaldo extends LógicaCajero {

    @Override
    public void RealizarOperación() {
        System.out.print("Cuánto deseas depositar: ");
        DineroDepositado = entrada.nextInt();
        saldo = saldo + DineroDepositado;
        System.out.println("-----------------------------------");
        System.out.println("Despositaste: " + DineroDepositado);
        System.out.println("Tu saldo actual es: " + saldo);
        System.out.println("-----------------------------------");
        //bandera = true;
    }
}
