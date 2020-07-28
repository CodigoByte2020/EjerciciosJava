package clases;

public class CategoríaJunior extends LógicaMTB {

    //Según el puesto que ingreso el usuario, establecemos la cantidad de puntos que se le asignará en cada fecha
    @Override
    public void EstablecerPuntaje() {
        
        switch (puesto) {
            case 1:
                PuntajeFecha = 15;
                System.out.println("Se le asignarán " + PuntajeFecha + " puntos.");
                break;
            case 2:
                PuntajeFecha = 10;
                System.out.println("Se le asignarán " + PuntajeFecha + " puntos.");
                break;
            case 3:
                PuntajeFecha = 5;
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
        PuntajeFinal = PuntajeFinal + PuntajeFecha; //En la variable PuntajeFinal acumulamos los puntos asignados al usuario en cada fecha
    }
}
