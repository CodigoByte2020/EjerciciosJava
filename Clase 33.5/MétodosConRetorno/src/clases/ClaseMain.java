package clases;

import java.util.Scanner;

public class ClaseMain {
    
    static boolean salir = false;
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Decisión(entrada);
        //Pichula(entrada);
        System.out.println(salir);
    }
    
    public static void Decisión(Scanner entrada) {
        //boolean salir = false;
        do {
            System.out.println(salir + " 1");
            String no = "s";
            System.out.print("¿Desea salir de la aplicación? (S/N) ");
            String decisión = entrada.next();
            if (decisión.equalsIgnoreCase(no)) {
                salir = true;
            }
            System.out.println(salir + " 2");
        } while (salir == false);
        System.out.println(salir + " 3");
    }
    
    public static void Pichula(Scanner entrada) {
        //Decisión(entrada);
        System.out.println(salir + " otro");
    }
}

/*int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i += 1;
        }
        
        System.out.println("");
        
        int j = 1;
        do {
            System.out.println(j);
            j += 1;
        } while(j <= 5);*/
