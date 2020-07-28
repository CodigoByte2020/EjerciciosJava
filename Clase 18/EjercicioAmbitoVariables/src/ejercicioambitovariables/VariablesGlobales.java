package ejercicioambitovariables;

public class VariablesGlobales {

    //Las variables globales no es necesario inicializarlas, y toman el valor de 0.
    int variable1;

    void AmbitoGlobal() {
        if (variable1 == 5) {
            System.out.println("Practicando Ambitos de variables");
        }
    }

    void Prueba() {
        variable1 = 150;
        System.out.println(variable1);
    }
}
