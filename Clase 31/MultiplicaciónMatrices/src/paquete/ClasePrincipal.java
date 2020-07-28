package paquete;

public class ClasePrincipal {

    static int valor; //Si declaramos una variable global estática ya no será necesario inicializarla dentro de un método

    public static void main(String[] args) {
        int Matriz1[][] = new int[2][3];
        int Matriz2[][] = new int[3][2];
        int MatrizResultado[][] = new int[2][2]; //Al indicar la cantidad de posiciones de una matriz, esta automáticamente rellena todas sus posiciones con 0

        //Llenado de Matriz1
        for (int i = 0;
                i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                Matriz1[i][j] = (int) (Math.random() * 5 + 1);
            }
        }

        //Llenado de Matriz2
        for (int i = 0;
                i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                Matriz2[i][j] = (int) (Math.random() * 5 + 1);
            }
        }

        //Multiplicación de Matrices
        for (int i = 0; i < 4; i++) {
            if (MatrizResultado[0][0] == 0) {
                int temporal = (Matriz1[0][0] * Matriz2[0][0]) + (Matriz1[0][1] * Matriz2[1][0]) + (Matriz1[0][2] * Matriz2[2][0]);
                MatrizResultado[0][0] = temporal;
            } else if (MatrizResultado[1][0] == 0) {
                int temporal = (Matriz1[1][0] * Matriz2[0][0]) + (Matriz1[1][1] * Matriz2[1][0]) + (Matriz1[1][2] * Matriz2[2][0]);
                MatrizResultado[1][0] = temporal;
            } else if (MatrizResultado[0][1] == 0) {
                int temporal = (Matriz1[0][0] * Matriz2[0][1]) + (Matriz1[0][1] * Matriz2[1][1]) + (Matriz1[0][2] * Matriz2[2][1]);
                MatrizResultado[0][1] = temporal;
            } else if (MatrizResultado[1][1] == 0) {
                int temporal = (Matriz1[1][0] * Matriz2[0][1]) + (Matriz1[1][1] * Matriz2[1][1]) + (Matriz1[1][2] * Matriz2[2][1]);
                MatrizResultado[1][1] = temporal;
            }
        }

        //Impresión de Matrices
        for (int i = 0; i < 3; i++) {

            //Impresión de la Matriz1
            if (i < 2) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("[ " + Matriz1[i][j] + " ] ");
                }
            }

            if (i == 0) {
                System.out.print("      ");
            } else if (i == 1) {
                System.out.print("  *   ");
            } else if (i == 2) {
                System.out.print("                        ");
            }

            //Impresión de la Matriz2
            for (int j = 0; j < 2; j++) {
                System.out.print("[ " + Matriz2[i][j] + " ] ");
            }

            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }

            //Impresión de la MatrizResultado
            if (i < 2) {
                for (int j = 0; j < 2; j++) {
                    System.out.print("[ " + MatrizResultado[i][j] + " ] ");
                }
            }
            System.out.println("");
        }
        Prueba();
    }

    public static void Prueba() { //Este método tiene que ser estático para que pueda ser llamado desde el Método Main
        System.out.println(valor);
    }
}
