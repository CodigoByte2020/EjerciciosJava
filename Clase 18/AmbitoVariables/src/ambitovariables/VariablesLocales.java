package ambitovariables;

public class VariablesLocales {

    //Variables de Ambito Local
    void AmbitoLocal() {
        String nombre = ""; //Estas variables siempre deben de ser inicializadas.
        System.out.println("Mi nombre es: " + nombre);
    }

    void Prueba() {
        //Las variables de ambito local sólo pueden ser accedidas dentro del bloque de código donde han sido declaradas.
        //nombre = "Gianmarco";
    }
}
