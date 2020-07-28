package ejercicioambitovariables;

public class VariablesLocales {

    void AmbitoLocal() {
        int i = 0; //Esta es una variables local y se tiene que inicializar
        for (i = 0; i <= 3; i += 1) {
            System.out.println("Mi nombre es: Gianmarco");
        }
        for (i = 0; i <= 3; i += 1) {
            System.out.println("Mis apellidos son: Contreras Pumamango");
        }
        if (i == 20) {
            System.out.println("Mi edad es: 27 años");
        }
    }
    /*void Prueba() {
        System.out.println("" + i);
    }*/
}
