package ambitovariables;

public class VariablesGlobales {

    //Variables de Ambito Global, no es necesario inicializarlas.
    int edad;

    void AmbitoGlobal() {
        System.out.println("La edad de Gianmarco es: " + edad);
    }

    //Las podemos utilizar en cualquier parte de la clase donde han sido declaradas.
    void Prueba() {
        System.out.println(edad);
    }
}
