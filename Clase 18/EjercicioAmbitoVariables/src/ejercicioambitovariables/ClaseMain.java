package ejercicioambitovariables;

public class ClaseMain {

    public static void main(String[] args) {

        VariablesLocales menL = new VariablesLocales();
        menL.AmbitoLocal();
        //menL.Prueba();

        VariablesGlobales menG = new VariablesGlobales();
        menG.AmbitoGlobal();
        menG.Prueba();

        //Las variables o métodos estáticos no necesitan ser instanciados y su accesibilidad depende de su modificador de acceso.
        VariablesEstáticas.variable3 = 75;
        VariablesEstáticas.AmbitoEstático();
        VariablesEstáticas.Prueba();
    }
}
