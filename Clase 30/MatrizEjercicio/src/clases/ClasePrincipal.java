package clases;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("¿ Cuántas filas y columnas desea que tenga la matriz ? ");
        int CantidadFC = entrada.nextInt();

        LógicaMatriz mensajero = new LógicaMatriz(CantidadFC);

        int intentos = 2;
        int decisión;
        String ejecución = "S";
        String continuación = "";
        boolean bandera = false;

        /*Con este segmento de código comprobaremos que el usuario primero ingrese la opción 1 para poder continuar con el resto del programa, tendrá 3 intentos para poder ingresar 
        la opción 1, de lo contrario el programa se cerrará automáticamente.*/
        while (intentos >= 0 && bandera == false) {
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar Fila");
            System.out.println("3. Sumar Columna");
            System.out.println("4. Sumar Diagonal Principal");
            System.out.println("5. Sumar Diagonal Inversa");
            System.out.println("6. Hallar la media de la Matriz");
            System.out.print("Ingresa que opción deseas realizar: ");
            decisión = entrada.nextInt();
            if (decisión == 1) {
                mensajero.IngresarDatos();
                mensajero.ImprimirDatos();
                System.out.print("¿ Desea seguir ejecutando el programa ? (S/N) ");
                continuación = entrada.next();
                bandera = true;
            } else if (decisión >= 2 && decisión <= 6) {
                if (intentos != 0) {
                    System.out.println("");
                    System.out.println("Primero se debe rellenar la Matriz");
                    System.out.println("Le queda " + intentos + " intento(s).");
                } else {
                    System.out.println("Ya no te quedan intentos.");
                    System.out.println("El programa se cerrará automáticamente.");
                }
                intentos -= 1;
            } else {
                if (intentos != 0) {
                    System.out.println("");
                    System.out.println("Opción incorrecta.....");
                    System.out.println("Le queda " + intentos + " intento(s).");
                } else {
                    System.out.println("Ya no te quedan intentos.");
                    System.out.println("El programa se cerrará automáticamente.");
                }
                intentos -= 1;
            }
        }

        //En esta parte solicitamos al usuario que opción desea que realize el programa, también verificamos si desea continuar con la ejecución del programa.
        while (intentos >= 0 && ejecución.equalsIgnoreCase(continuación)) {
            System.out.println("");
            System.out.println("1. Rellenar Matriz");
            System.out.println("2. Sumar Fila");
            System.out.println("3. Sumar Columna");
            System.out.println("4. Sumar Diagonal Principal");
            System.out.println("5. Sumar Diagonal Inversa");
            System.out.println("6. Hallar la media de la Matriz");
            System.out.print("Ingresa que opción deseas realizar: ");
            decisión = entrada.nextInt();
            switch (decisión) {
                case 1:
                    if (intentos != 0) {
                        System.out.println("Opción ya ejecutada");
                        System.out.println("Le queda " + intentos + " intento(s).");
                    } else {
                        System.out.println("Ya no le quedan intentos.");
                        System.out.println("El programa se cerrará automáticamente.");
                    }
                    intentos -= 1;
                    break;
                case 2:
                    mensajero.SumarFila();
                    System.out.print("¿ Desea seguir ejecutando el programa ? (S/N) ");
                    continuación = entrada.next();
                    break;
                case 3:
                    mensajero.SumarColumna();
                    System.out.print("¿ Desea seguir ejecutando el programa ? (S/N) ");
                    continuación = entrada.next();
                    break;
                case 4:
                    mensajero.SumarDiagonalPrincipal();
                    System.out.print("¿ Desea seguir ejecutando el programa ? (S/N) ");
                    continuación = entrada.next();
                    break;
                case 5:
                    mensajero.SumarDiagonalInversa();
                    System.out.print("¿ Desea seguir ejecutando el programa ? (S/N) ");
                    continuación = entrada.next();
                    break;
                case 6:
                    mensajero.MediaTotal();
                    System.out.print("¿ Desea seguir ejecutando el programa ? (S/N) ");
                    continuación = entrada.next();
                    break;
                default:
                    if (intentos != 0) {
                        System.out.println("Opción incorrecta...");
                        System.out.println("Le queda " + intentos + " intento(s).");
                    } else {
                        System.out.println("Ya no le quedan intentos.");
                        System.out.println("El programa se cerrará automáticamente.");
                    }
                    intentos -= 1;
                    break;
            }
        }
    }
}
