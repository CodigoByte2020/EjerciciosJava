package polimorfismoejercicio;

public class ClaseMain {

    public static void main(String[] args) {
        ClasePadre MensajeroSuma = new Suma_ClaseHija();
        MensajeroSuma.IngresarDatos();
        MensajeroSuma.RealizarOperación();
        MensajeroSuma.MostrarDatos();

        ClasePadre MensajeroResta = new Resta_ClaseHija();
        MensajeroResta.IngresarDatos();
        MensajeroResta.RealizarOperación();
        MensajeroResta.MostrarDatos();

        ClasePadre MensajeroMultiplicación = new Multiplicación_ClaseHija();
        MensajeroMultiplicación.IngresarDatos();
        MensajeroMultiplicación.RealizarOperación();
        MensajeroMultiplicación.MostrarDatos();

        ClasePadre MensajeroDivisión = new División_ClaseHija();
        MensajeroDivisión.IngresarDatos();
        MensajeroDivisión.RealizarOperación();
        MensajeroDivisión.MostrarDatos();
    }
}
