package polimorfismo;

public class Suma_ClaseHija extends ClasePadre {

    //Sobreescribimos el método declarado en la ClasePadre
    @Override
    public void Operaciones() {
        resultado = valor1 + valor2;
    }
}
