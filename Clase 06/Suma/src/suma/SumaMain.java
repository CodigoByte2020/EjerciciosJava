package suma;

import java.util.Scanner;

public class SumaMain {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer número: ");
        int ValorUno = entrada.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int ValorDos = entrada.nextInt();
        
        //Creamos un objeto del tipo de la clase a la que le vamos a enviar los datos a través de argumentos.
        Suma Valores = new Suma(ValorUno, ValorDos);
        // Con ayuda del objeto mandamos a llamar al método que nos permite imprimir en pantalla el resultado
        Valores.Imprimir(); 
        
        /* Otra forma: 
        Valores.Operación();
         System.out.println("El resultado de la suma es: " + Valores.resultado);
        */
    }

}
