package clases;

public class CategoríaNovel extends LógicaMTB {

    @Override
    public void EstablecerPuntaje() {
        
        switch (puesto) {
            case 1:
                PuntajeFecha = 30;
                System.out.println("Se le asignarán " + PuntajeFecha + " puntos.");
                break;
            case 2:
                PuntajeFecha = 20;
                System.out.println("Se le asignarán " + PuntajeFecha + " puntos.");
                break;
            case 3:
                PuntajeFecha = 10;
                System.out.println("Se le asignarán " + PuntajeFecha + " puntos.");
                break;
            case 4:
                System.out.println("No se le asignará ningún punto.");
                break;
            case 5:
                System.out.println("No se le asignará ningún punto.");
                break;
            default:
                System.out.println("El puesto ingresado no existe.");
                break;
        }
        PuntajeFinal = PuntajeFinal + PuntajeFecha;
    }
}
