package ejemplos;

public class Conversiones {

    public static void main(String[] args) {
        double AnguloEnGrados = 200;
        double AnguloEnRadianes = Math.toRadians(AnguloEnGrados);
        System.out.println("Deg a Rad " + AnguloEnGrados + "° = " + AnguloEnRadianes + " rad");
        AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
        System.out.println("Rad a Deg " + AnguloEnRadianes + " rad = " + AnguloEnGrados + "°");
    }
}
