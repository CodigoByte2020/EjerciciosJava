package ambitovariables;

public class ClaseMain {

    public static void main(String[] args) {
        
        /*VariablesEstáticas MensajeroEstático = new VariablesEstáticas();
        MensajeroEstático.AmbitoEstático();*/
        
        VariablesEstáticas.sueldo = 10;
        VariablesEstáticas.AmbitoEstático();
        VariablesEstáticas.MiPrueba();
    }
}
