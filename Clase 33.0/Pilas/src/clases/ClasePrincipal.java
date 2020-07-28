package clases;

import java.util.Scanner;

public class ClasePrincipal {       

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);        
        
        Nodo pila = null;        
        Pilas mensajero = new Pilas();

        System.out.println("Ingrese que valor desea agregar a la pila");
        int valor1 = entrada.nextInt();
        mensajero.AgregarPila(pila, valor1);  
        
        System.out.println("Ingrese que valor desea agregar a la pila");
        int valor2 = entrada.nextInt();
        mensajero.AgregarPila(pila, valor2);
        System.out.println(pila);
    }

}
