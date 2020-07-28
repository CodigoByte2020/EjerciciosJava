package lógica;

public class ClaseHijaSuma extends ClasePadre {

    /*La instanciación de objetos se harán fuera o dentro de los métodos
    ClasePadre chasqui = new ClasePadre();*/

    /* las variables protected y los objetos instanciados de otras clases se podrán utilizar sólo dentro de un método
    chasqui.valor1 = 0; 
    valor1 = 1; */
    
    public void Operación() {
        //chasqui.valor1 = 4;
        resultado = valor1 + valor2;
    }
}
