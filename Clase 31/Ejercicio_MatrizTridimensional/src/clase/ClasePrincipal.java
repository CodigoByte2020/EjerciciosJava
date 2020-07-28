package clase;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int MatrizTridimensional[][][] = new int[2][4][2];

        //Llenado de MatrizTridimensional
        for (int i = 0; i < 2; i++) { //Filas

            for (int j = 0; j < 4; j++) { //Columnas

                for (int k = 0; k < 2; k++) { //Profundidad
                    System.out.print("Ingrese un valor en la posición [" + i + "][" + j + "][" + k + "]: ");
                    MatrizTridimensional[i][j][k] = entrada.nextInt();
                }
            }
        }
        System.out.println("");

        //Impresión de MatrizTridimensional - forma realista        
        for (int i = 0; i < 2; i++) { //Filas

            for (int k = 1; k >= 0; k--) { //Profundidad 

                if (k == 1) { //Columnas
                    for (int j = 0; j < 4; j++) {
                        System.out.print("   [ " + MatrizTridimensional[i][j][k] + " ]");
                    }
                } else { //Columnas
                    for (int j = 0; j < 4; j++) {
                        System.out.print("[ " + MatrizTridimensional[i][j][k] + " ]   ");
                    }
                }
                System.out.println("");
            }
        }
    }
}
