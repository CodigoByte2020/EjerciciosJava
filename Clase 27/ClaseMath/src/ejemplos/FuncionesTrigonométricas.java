package ejemplos;

public class FuncionesTrigonométricas {

    public static void main(String[] args) {
        double resultado;
        double AnguloEnGrados = 45;
        double AnguloEnRadianes = Math.toRadians(AnguloEnGrados);

        //Seno
        resultado = Math.sin(AnguloEnRadianes); //La clase math acepta y devuelve los angulos en radianes.
        System.out.println("El seno de " + AnguloEnGrados + "° es: " + resultado);

        //Coseno
        resultado = Math.cos(AnguloEnRadianes);
        System.out.println("El coseno de " + AnguloEnGrados + "° es: " + resultado);

        //Tangente
        resultado = Math.tan(AnguloEnRadianes);
        System.out.println("La tangente de: " + AnguloEnGrados + "° es: " + resultado);
        System.out.println("-----------------------------------------------------");

        double ValorIngresado = 0.707;

        //Arcoseno
        AnguloEnRadianes = Math.asin(ValorIngresado);
        AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
        System.out.println("El arcoseno de " + ValorIngresado + " es: " + AnguloEnGrados);

        //Arcocoseno
        AnguloEnRadianes = Math.acos(ValorIngresado);
        AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
        System.out.println("El arcocoseno de " + ValorIngresado + " es: " + AnguloEnGrados);

        //Arcotangente
        AnguloEnRadianes = Math.atan(ValorIngresado);
        AnguloEnGrados = Math.toDegrees(AnguloEnRadianes);
        System.out.println("El arcotangente de " + ValorIngresado + " es: " + AnguloEnGrados);
    }
}
