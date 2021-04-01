package poo;

public class Furgoneta extends Coche {

    private int CapacidadCarga;
    private int PlazasExtra;

    public Furgoneta(int CapacidadCarga, int PlazasExtra) {
        super();
        this.CapacidadCarga = CapacidadCarga;
        this.PlazasExtra = PlazasExtra;
    }

    public String getDatosFurgoneta() {
        return "La furgoneta tiene una capacidad de carga de " + CapacidadCarga + " kg y " + PlazasExtra + " plazas extras.";
    }
}
