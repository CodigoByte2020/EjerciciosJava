package ejerciciopoo;

import java.util.Scanner;

public class SalarioMain {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        int HorasTrabajadas = entrada.nextInt();
        System.out.print("Ingrese la tarifa por hora trabajada: ");
        float ValorHora = entrada.nextFloat();

        Salario Trabajador = new Salario(nombre, HorasTrabajadas, ValorHora);
        Trabajador.Imprimir();
    }
}
