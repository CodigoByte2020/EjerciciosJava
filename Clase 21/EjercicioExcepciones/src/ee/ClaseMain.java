package ee;

public class ClaseMain {

    public static void main(String[] args) {

        try {
            Practicando mensajero = new Practicando();
            mensajero.Méto();
        } catch (Exception e) {
            System.out.println("Error !!! " + e);
        } finally {
            System.out.println("Ejecución finalizada");
        }
    }
}
