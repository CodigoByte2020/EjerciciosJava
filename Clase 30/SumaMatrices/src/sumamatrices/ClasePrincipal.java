package sumamatrices;

public class ClasePrincipal {

    public static void main(String[] args) {

        int MatrizUno[][] = new int[3][3];
        int MatrizDos[][] = new int[3][3];
        int MatrizResultado[][] = new int[3][3];

        //Llenado de la MatrizUno
        for (int i = 0; i < MatrizUno.length; i++) {
            for (int j = 0; j < MatrizDos.length; j++) {
                MatrizUno[i][j] = (int) (Math.random() * 5 + 1);
            }
        }

        //Llenado de la MatrizDos
        for (int i = 0; i < MatrizDos.length; i++) {
            for (int j = 0; j < MatrizDos.length; j++) {
                MatrizDos[i][j] = (int) (Math.random() * 5 + 1);
            }
        }

        //Llenado de la MatrizResultado
        for (int i = 0; i < MatrizResultado.length; i++) {
            for (int j = 0; j < MatrizResultado.length; j++) {
                MatrizResultado[i][j] = MatrizUno[i][j] + MatrizDos[i][j];
            }
        }

        //Impresión de las Matrices
        for (int i = 0; i < MatrizUno.length; i++) {
            for (int j = 0; j < MatrizUno.length; j++) {
                System.out.print("[ " + MatrizUno[i][j] + " ] ");
            }

            if (i == 1) {
                System.out.print("  +   ");
            } else {
                System.out.print("      ");
            }

            for (int j = 0; j < MatrizDos.length; j++) {
                System.out.print("[ " + MatrizDos[i][j] + " ] ");
            }

            if (i == 1) {
                System.out.print("  =   ");
            } else {
                System.out.print("      ");
            }

            for (int j = 0; j < MatrizResultado.length; j++) {
                System.out.print("[ " + MatrizResultado[i][j] + " ] ");
            }

            System.out.println("");
        }
    }
}
