package ejercicioambitovariables;

public class VariablesEstáticas {

    //Las variables estáticas tienen que declararse justo después de la llave de apertura de la clase
    static int variable3;

    static void AmbitoEstático() {
        variable3 = 100;
    }

    static void Prueba() {
        System.out.println(variable3);
    }
}
