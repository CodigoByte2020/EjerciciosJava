package lógica;

public class ConsultaDeSaldo extends LógicaCajero {

    @Override
    public void RealizarOperación() {
        System.out.println("-----------------------------------");
        System.out.println("Tu saldo actual es: " + saldo);
        System.out.println("-----------------------------------");
    }
}
