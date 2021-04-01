package poo;

public class Coche {

    private int ruedas;
    private int PesoPlataforma;
    private int ancho;
    private int altura;
    private int PesoFinal;
    private String color;
    private boolean AsientosCuero, climatizador;

    public Coche() {
        ruedas = 4;
        PesoPlataforma = 1000;
        ancho = 120;
        altura = 50;
    }

    public String getDatos() {
        return "El vehículo tiene " + ruedas + " ruedas, un peso de " + PesoPlataforma + " Kg, un ancho de " + ancho
                + " metros y una altura de " + altura + " metros.";
    }

    //SETTER
    public void EstablecerColor(String color) {
        this.color = color;
    }

    //GETTER
    public String DevolverColor() {
        return color;
    }

    //SETTER
    public void setAsientosCuero(String AsientosCuero) {

        if (AsientosCuero.equalsIgnoreCase("si")) {
            this.AsientosCuero = true;
        } else {
            this.AsientosCuero = false;
        }
    }

    //GETTER
    public String getAsientosCuero() {

        if (AsientosCuero == true) {
            return "El coche tiene asientos de cuero";
        } else {
            return "El coche tiene asientos de nivel";
        }
    }

    //SETTER
    public void setClimatizador(String climatizador) {

        if (climatizador.equalsIgnoreCase("si")) {
            this.climatizador = true;
        } else {
            this.climatizador = false;
        }
    }

    //GETTER
    public String getClimatizador() {
        if (climatizador == true) {
            return "El coche tiene climatizador";
        } else {
            return "El coche NO tiene climatizador";
        }
    }

    //SETTER AND GETTER --Un método setter es cuando asigna valor a una variable de clase
    public String getPesoCarro() {

        int PesoCarrocería = 300;
        PesoFinal = PesoPlataforma + PesoCarrocería;

        if (AsientosCuero == true) {
            PesoFinal += 50;
        }
        if (climatizador == true) {
            PesoFinal += 20;
        }

        return "El peso final del coche es: " + PesoFinal;
    }

    //GETTER
    public int getPrecioCarro() {

        int PrecioFinal = 3000;

        if (AsientosCuero == true) {
            PrecioFinal += 100;
        }

        if (climatizador == true) {
            PrecioFinal += 50;
        }
        return PrecioFinal;
    }
}
