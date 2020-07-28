package clases;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {

        //Sin Constructor
        /*SinConstructor MensajeroSC = new SinConstructor();
        MensajeroSC.EntradaDatos();
        MensajeroSC.CalcularPromedio();
        MensajeroSC.SalidaDatos();
        MensajeroSC.setVagina("Chochita");
        System.out.println(MensajeroSC.getVagina());*/
        //Con Constructor
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = entrada.nextLine();
        System.out.print("Ingrese su nota 1: ");
        int nota1 = entrada.nextInt();
        System.out.print("Ingrese su nota 2: ");
        int nota2 = entrada.nextInt();
        System.out.print("Ingrese su nota 3: ");
        int nota3 = entrada.nextInt();

        //Estos datos que pasamos a través del objeto son los encontrados (found), y a esto se le llama enviar datos por argumentos
        ConConstructor MensajeroCC = new ConConstructor(nota1, nota2, nota3, nombre, apellido);
        MensajeroCC.Prueba();
        MensajeroCC.Prueba(70, 20);
        MensajeroCC.Prueba(399);
        MensajeroCC.Prueba(12, 8);
        MensajeroCC.Prueba();
    }
}
