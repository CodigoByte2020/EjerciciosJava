package Descifra;

public class Out {

    public static void main(String[] args) {
        In objeto = new In();
        objeto.IngresoDatos();
        objeto.ComprobarCadena();

        if (In.bandera == false) {
            objeto.SalidaDatos();
        }
    }
}
