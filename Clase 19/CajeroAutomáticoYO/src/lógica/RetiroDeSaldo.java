package lógica;

public class RetiroDeSaldo extends LógicaCajero {

    @Override
    public void RealizarOperación() {
        System.out.print("Cuánto deseas retirar: ");
        DineroRetirado = entrada.nextInt();
        saldo = saldo - DineroRetirado;
        System.out.println("-----------------------------------");
        System.out.println("Retiraste: " + DineroRetirado);
        System.out.println("Tu saldo actual es: " + saldo);
        System.out.println("-----------------------------------");
        //bandera = true;
    }
}
