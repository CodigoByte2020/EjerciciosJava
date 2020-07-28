package polimorfismoejercicio;

public class Suma_ClaseHija extends ClasePadre {

    @Override
    public void IngresarDatos() {
        System.out.print("Ingrese el primer valor: ");
        valor1 = entrada.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        valor2 = entrada.nextInt();
    }

    @Override
    public void RealizarOperación() {
        resultado = valor1 + valor2;
    }

    @Override
    public void MostrarDatos() {
        System.out.print("El resultado de la suma es: " + resultado);
    }
}
