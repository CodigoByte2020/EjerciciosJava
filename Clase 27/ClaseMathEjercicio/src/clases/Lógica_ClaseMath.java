package clases;

public class Lógica_ClaseMath {

    double ValorIngresado;
    int decisión;

    public Lógica_ClaseMath(double ValorIngresado, int decisión) {
        this.ValorIngresado = ValorIngresado;
        this.decisión = decisión;
    }

    public void FuncionesTrigonométricas() {
        double AnguloRadianes, AnguloGrados, resultado;
        int i = 2;
        boolean bandera = false;
        do {
            switch (decisión) {
                case 1:
                    AnguloRadianes = Math.toRadians(ValorIngresado);
                    AnguloGrados = Math.toDegrees(AnguloRadianes);
                    resultado = Math.sin(AnguloRadianes);
                    System.out.println("El seno de " + ValorIngresado + " = " + resultado);
                    bandera = true;
                    break;
                case 2:
                    AnguloRadianes = Math.toRadians(ValorIngresado);
                    AnguloGrados = Math.toDegrees(AnguloRadianes);
                    resultado = Math.cos(AnguloRadianes);
                    System.out.println("El coseno de " + ValorIngresado + " = " + resultado);
                    bandera = true;
                    break;
                case 3:
                    AnguloRadianes = Math.toRadians(ValorIngresado);
                    AnguloGrados = Math.toDegrees(AnguloRadianes);
                    resultado = Math.tan(AnguloRadianes);
                    System.out.println("La tangente de " + ValorIngresado + " = " + resultado);
                    bandera = true;
                    break;
                case 4:
                    AnguloRadianes = Math.toRadians(ValorIngresado);
                    AnguloGrados = Math.toDegrees(AnguloRadianes);
                    resultado = Math.asin(AnguloRadianes);
                    System.out.println("El arco seno de " + ValorIngresado + " = " + resultado);
                    bandera = true;
                    break;
                case 5:
                    AnguloRadianes = Math.toRadians(ValorIngresado);
                    AnguloGrados = Math.toDegrees(AnguloRadianes);
                    resultado = Math.acos(AnguloRadianes);
                    System.out.println("El arco coseno de " + ValorIngresado + " = " + resultado);
                    bandera = true;
                    break;
                case 6:
                    AnguloRadianes = Math.toRadians(ValorIngresado);
                    AnguloGrados = Math.toDegrees(AnguloRadianes);
                    resultado = Math.atan(AnguloRadianes);
                    System.out.println("El arco tangente de " + ValorIngresado + " = " + resultado);
                    bandera = true;
                    break;
                default:
                    if (i != 0) {
                        System.out.println("Función Trigonométrica inexistente, le quedan " + i + " intento(s), por favor vuelve a ingresar una opción.");
                        System.out.println("1. Hallar Seno,  2. Hallar Coseno,  3. Hallar Tangente,  4. Hallar Arco Seno,  5. Hallar Arco Coseno,  6. Hallar Arco Tangente");
                        decisión = ClaseMain.entrada.nextInt();
                    } else {
                        System.out.println("Ya no le quedan intentos, el programa se cerrará automáticamente ... ");
                    }
                    i -= 1;
                    break;
            }
        } while (i >= 0 && bandera == false);
    }
}
