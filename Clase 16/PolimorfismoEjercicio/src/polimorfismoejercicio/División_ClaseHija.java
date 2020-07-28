package polimorfismoejercicio;

public class División_ClaseHija extends ClasePadre {

    protected float ResultadoDivisión;

    @Override
    public void IngresarDatos() {
        System.out.println();
        System.out.print("Ingrese el primer valor: ");
        valor1 = entrada.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        valor2 = entrada.nextInt();
    }

    @Override
    public void RealizarOperación() {
        ResultadoDivisión = (float) valor1 / valor2;
    }

    @Override
    public void MostrarDatos() {
        System.out.print("El resultado de la división es: " + ResultadoDivisión);
        System.out.println();
    }
}
