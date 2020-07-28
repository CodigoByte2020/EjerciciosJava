package ejercicio1;

public class Lógica1 {

    public int SumaRecursiva(int número) {
        int suma;
        if (número > 1) {
            suma = número + SumaRecursiva(número - 1);            
        } else {
            suma = 1;
        }
        return suma;
    }
}
