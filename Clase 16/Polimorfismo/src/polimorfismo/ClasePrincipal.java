package polimorfismo;

/*import polimorfismo.Suma_ClaseHija;
import polimorfismo.Resta_ClaseHija;
import polimorfismo.ClasePadre;*/

public class ClasePrincipal {

    public static void main(String[] args) {
        // Cremos un objeto de la clase Padre, pero le indicamos con que clase queremos instanciarlo para comunicarnos con esa clase.
        ClasePadre MensajeroSuma = new Suma_ClaseHija();
        MensajeroSuma.IngresarDatos();
        MensajeroSuma.Operaciones();
        MensajeroSuma.MostrarDatos();

        ClasePadre MensajeroResta = new Resta_ClaseHija();
        MensajeroResta.IngresarDatos();
        MensajeroResta.Operaciones();
        MensajeroResta.MostrarDatos();
    }
}
