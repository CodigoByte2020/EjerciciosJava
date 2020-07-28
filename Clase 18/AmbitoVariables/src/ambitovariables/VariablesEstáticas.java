package ambitovariables;

public class VariablesEstáticas {

    //Variables de ámbito estático, no necesitan ser instanciadas y dependen de su modificador de acceso para poder ser accedidas.
    static int sueldo;

    static void AmbitoEstático() {
        sueldo = 200;
    }

    static void MiPrueba() {
        sueldo = 500;
    }
}
