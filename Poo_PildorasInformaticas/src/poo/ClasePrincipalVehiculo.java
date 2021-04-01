package poo;

public class ClasePrincipalVehiculo {

    public static void main(String[] args) {

        Vehiculo MisVehiculos[] = new Vehiculo[6];

        MisVehiculos[0] = new Vehiculo(3, 1, 290, "azul");
        MisVehiculos[1] = new Vehiculo(5, 2, 540, "morado");
        MisVehiculos[2] = new Vehiculo(4, 2, 350, "verde");

        Triciclo triciclo1 = new Triciclo(4, 3, 190, "celeste");
        triciclo1.setPedales("nO");
        MisVehiculos[3] = triciclo1;

        Triciclo triciclo2 = new Triciclo(6, 190);
        triciclo2.setPedales("SI");
        MisVehiculos[4] = triciclo2;

        MisVehiculos[5] = new Triciclo(5, 4, 250, "púrpura");
        Triciclo triciclo3 = (Triciclo) MisVehiculos[5]; //Refundimos un objeto
        triciclo3.setPedales("no");

        //Triciclo triciclo4 = (Triciclo) MisVehiculos[1]; //Error en la refundición de objetos
        for (Vehiculo i : MisVehiculos) {
            i.setAnnioLanzamiento(2015);
            System.out.println(i.getDatos());
            System.out.println("El precio del vehículo es: " + i.getPrecio());
        }
    }
}

class Vehiculo {

    private int largo;
    private int ancho;
    private int peso;
    private String color;
    private int AnnioLanzamiento;
    private int placa;
    private static int ContadorPlaca;

    public Vehiculo(int largo, int ancho, int peso, String color) {

        this.largo = largo;
        this.ancho = ancho;
        this.peso = peso;
        this.color = color;
        ContadorPlaca++;
        placa = ContadorPlaca;
    }

    public String getDatos() {
        return "El vehiculo tiene una largo de " + largo + " mts, un ancho de " + ancho + " mts, un peso de "
                + peso + " Kg, un color " + color + " y con placa #" + placa + ".";
    }

    public void setAnnioLanzamiento(int AnnioLanzamiento) {
        this.AnnioLanzamiento = AnnioLanzamiento;
    }

    public int getPrecio() {

        int precio;

        if (AnnioLanzamiento <= 2000) {
            precio = 1800;
        } else if (AnnioLanzamiento >= 2001 && AnnioLanzamiento <= 2010) {
            precio = 2500;
        } else {
            precio = 3000;
        }

        return precio;
    }
}

//Cuando una clase es final, ninguna clase podrá heredar de esta
/*final*/ class Triciclo extends Vehiculo {

    private boolean pedales;

    public Triciclo(int ancho, int peso) {

        super(150, ancho, peso, "gris");
    }

    public Triciclo(int largo, int ancho, int peso, String color) {

        super(largo, ancho, peso, color);
    }

    //Cuando un método es final no puede ser sobreescrito desde otra clase que herede de esta
    /*final*/ public void setPedales(String pedales) {

        if (pedales.equalsIgnoreCase("Si")) {
            this.pedales = true;
        } else if (pedales.equalsIgnoreCase("nO")) {
            this.pedales = false;
        }
    }

    public int getPrecio() {

        int precio;

        if (pedales) {
            precio = super.getPrecio() + 15;
        } else if (!pedales) {
            precio = super.getPrecio() + 0;
        } else {
            precio = super.getPrecio() + 0;
        }

        return precio;
    }
}
