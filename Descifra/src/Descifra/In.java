package Descifra;

import java.util.Scanner;

public class In {

    private String[] cadena;
    private int[] NúmerosClaves = new int[4];
    private int cantidad, j = 0; //posición del array NúmerosClaves
    static boolean bandera = false;

    //Método para validar la longitud que tendrá el texto cifrado
    public String[] IngresoDatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cadena de texto cifrada (puede contener O y *");

        do {
            System.out.print("¿Cuántos caracteres tendrá su texto cifrado ? ");
            cantidad = entrada.nextInt();
            if (cantidad > 50000) {
                System.out.println("Capacidad de texto cifrado excedida, por favor ingrese un número menor");
            }
        } while (cantidad > 50000);

        cadena = new String[cantidad];

        for (int i = 0; i < cantidad; i += 1) {
            System.out.print("Ingrese un caracter: ");
            cadena[i] = entrada.next();
        }
        return cadena;
    }

    //Método lógico del programa, comprueba si la cadena tiene 2 asteriscos seguidos o caracteres no permitidos, también para contar las O entre * *
    public void ComprobarCadena() {

        int ContadorAstericos = 0, ContadorOs = 0;

        for (int i = 0; i < cantidad && bandera == false; i += 1) {

            if (ContadorAstericos == 0) {
                switch (cadena[i]) {
                    case "*":
                        ContadorAstericos += 1;
                        break;
                    case "O":
                        break;
                    default:
                        bandera = true;
                        System.out.println("ERROR, caracter no permitido ... El programa finalizará");
                        break;
                }
            } else if (ContadorAstericos >= 1 && ContadorAstericos <= 4) {
                switch (cadena[i]) {
                    case "*":
                        if (cadena[i - 1].equals("*")) {
                            System.out.println("No pueden haber 2 asteriscos seguidos, El programa finalizará");
                            bandera = true;
                        }
                        NúmerosClaves[j] = ContadorOs;
                        ContadorOs = 0;
                        j += 1;
                        ContadorAstericos += 1;
                        break;
                    case "O":
                        ContadorOs += 1;
                        break;
                    default:
                        System.out.println("ERROR, caracter no permitido ... El programa finalizará");
                        bandera = true;
                        break;
                }
            } else if (ContadorAstericos >= 5) {
                switch (cadena[i]) {
                    case "*":
                        if (cadena[i - 1].equals("*")) {
                            System.out.println("No se permiten más de 5 asteriscos ... El programa finalizará");
                            bandera = true;
                        }
                        NúmerosClaves[j] = ContadorOs;
                        ContadorAstericos += 1;
                        break;
                    case "O":
                        break;
                    default:
                        System.out.println("ERROR, caracter no permitido ... El programa finalizará");
                        bandera = true;
                        break;
                }
            }
        }
    }

    public void SalidaDatos() {

        System.out.println("");
        System.out.print("Cadena ingresada: ");
        for (int i = 0; i < cantidad; i += 1) {
            System.out.print(cadena[i]);
        }

        System.out.println("");
        System.out.println("Clave secreta: ");
        for (j = 0; j < 4; j += 1) {
            System.out.println(NúmerosClaves[j]);
        }
    }
}
