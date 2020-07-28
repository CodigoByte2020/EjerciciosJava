package clases;

public class MétodosReturn {

    //Cuándo son métodos con retorno si se podrá hacer la impresión en otra clase
    public int Sumar(int valor1, int valor2) {
        int suma = valor1 + valor2;
        return suma;
    }

    public int Restar(int valor1, int valor2) {
        int resta = valor1 - valor2;
        return resta;
    }

    //Es preferible usar métodos de tipo void para que todo se simplifique
    public void Multiplicar(int valor1, int valor2) {
        int multiplicación = valor1 * valor2;
        System.out.println("El resultado de la multiplicación es: " + multiplicación);
        //return multiplicación;
    }

    //Cuando es método de tipo void, hacer la impresión en el mismo método ya que en otra clase no se podra realizar
    public void Dividir(int valor1, int valor2) {
        int división = valor1 / valor2;
        System.out.println("El resultado de la división es: " + división);
        //return división;
    }

    public void MostrarResultados(int suma, int resta, int multiplicación, int división) {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplación es: " + multiplicación);
        System.out.println("La división es: " + división);
    }
}
