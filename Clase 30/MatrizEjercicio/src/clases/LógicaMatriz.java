package clases;

import java.util.Scanner;

public class LógicaMatriz {

    Scanner entrada = new Scanner(System.in);
    int CantidadFC, intentos;
    boolean bandera;
    int Matriz[][]; //declaración de un arreglo

    public LógicaMatriz(int CantidadFC) {
        this.CantidadFC = CantidadFC;
        Matriz = new int[this.CantidadFC][this.CantidadFC]; //inicialización de un arreglo
    }

    public void IngresarDatos() {
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                System.out.print("Ingresa un número a la fila #" + (i + 1) + ", columna #" + (j + 1) + ": ");
                Matriz[i][j] = entrada.nextInt();
            }
        }
    }

    public void ImprimirDatos() {
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                System.out.print("[ " + Matriz[i][j] + " ] ");
            }
            System.out.println("");
        }
    }

    //Seleccionamos una fila y sumamos todos los valores correspondientes a la fila
    public void SumarFila() {
        bandera = false;
        for (intentos = 2; intentos >= 0 && bandera == false; intentos -= 1) {
            System.out.print("¿ Qué fila desea sumar ? ");
            int fila = entrada.nextInt();
            int SumaFila = 0;
            if (fila >= 1 && fila <= Matriz.length) {
                for (int i = 0; i < Matriz.length; i++) {
                    SumaFila = SumaFila + Matriz[fila - 1][i];
                }
                System.out.println("La suma de la fila #" + fila + " es: " + SumaFila);
                bandera = true;
            } else {
                if (intentos != 0) {
                    System.out.println("Ingresaste un número de fila incorrecto, te queda " + intentos + " intento(s).");
                    System.out.println("Por favor vuelve a ingresar un número de fila.");
                } else {
                    System.out.println("Ya no le quedan intentos.");
                }
            }
        }
    }

    //Seleccionamos una columna y sumamos todos los valores correspondientes a la columna
    public void SumarColumna() {
        bandera = false;
        for (intentos = 2; intentos >= 0 && bandera == false; intentos -= 1) {
            System.out.print("¿ Qué columna desea sumar ? ");
            int columna = entrada.nextInt();
            int SumaColumna = 0;
            if (columna >= 1 && columna <= Matriz.length) {
                for (int i = 0; i < Matriz.length; i++) {
                    SumaColumna = SumaColumna + Matriz[i][columna - 1];
                }
                System.out.println("La suma de la columna #" + columna + " es: " + SumaColumna);
                bandera = true;
            } else {
                if (intentos != 0) {
                    System.out.println("Ingresaste un número de columna incorrecto, te queda " + intentos + " intento(s).");
                    System.out.println("Por favor vuelve a ingresar un número de columna.");
                } else {
                    System.out.println("Ya no le quedan intentos.");
                }
            }
        }
    }

    /*Sumamos todos los valores de la diagonal principal:
    [\][ ][ ][ ] fila0, columna0
    [ ][\][ ][ ] fila1, columna1
    [ ][ ][\][ ] fila2, columna2
    [ ][ ][ ][\] fila3, columna3
     */
    public void SumarDiagonalPrincipal() {
        int SumaDP = 0;
        for (int i = 0; i < Matriz.length; i++) {
            SumaDP = SumaDP + Matriz[i][i];
        }
        System.out.println("La suma de la Diagonal Principales es: " + SumaDP);
    }

    /*Sumamos todos los valores de la diagonal inversa:
    [ ][ ][ ][/] fila0, columna3
    [ ][ ][/][ ] fila1, columna2
    [ ][/][ ][ ] fila2, columna1
    [/][ ][ ][ ] fila3, columna0
     */
    public void SumarDiagonalInversa() {
        int SumaDI = 0;
        int j = Matriz.length - 1;
        for (int i = 0; i < Matriz.length; i++) {
            SumaDI = SumaDI + Matriz[i][j];
            j -= 1;
        }
        System.out.println("La suma de la Diagonal Inversa es: " + SumaDI);
    }

    //Sumamos todos los valores de la matriz, y sacamos el promedio
    public void MediaTotal() {
        int MediaTotal = 0;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz.length; j++) {
                MediaTotal = MediaTotal + Matriz[i][j];
            }
        }
        MediaTotal = MediaTotal / (Matriz.length * Matriz.length);
        System.out.println("La media de todos los valores de la Matriz es: " + MediaTotal);
    }
}
