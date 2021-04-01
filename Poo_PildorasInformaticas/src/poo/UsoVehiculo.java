package poo;

public class UsoVehiculo {

    public static void main(String[] args) {

        Coche MiCoche1 = new Coche();

        MiCoche1.EstablecerColor("negro");
        System.out.println(MiCoche1.getDatos() + " Color " + MiCoche1.DevolverColor());
        MiCoche1.setAsientosCuero("si");
        System.out.println(MiCoche1.getAsientosCuero());
        MiCoche1.setClimatizador("si");
        System.out.println(MiCoche1.getClimatizador());
        System.out.println(MiCoche1.getPesoCarro());
        System.out.println("El precio final del coche es: " + MiCoche1.getPrecioCarro());

        System.out.println("-----------------------------------------------------------------");

        Furgoneta MiFurgoneta1 = new Furgoneta(120, 8);

        MiFurgoneta1.EstablecerColor("azul");
        System.out.println(MiFurgoneta1.getDatos() + " Color " + MiFurgoneta1.DevolverColor()
                + ". \n" + MiFurgoneta1.getDatosFurgoneta());

        //Comprobando la existencia de la herencia
        MiCoche1.getDatos();
        MiFurgoneta1.getDatos();
        MiFurgoneta1.getDatosFurgoneta();
    }
}

//        Coche MiCarro = new Coche();
//        //MiCarro.ruedas = 8; Variable de acceso privado
////        System.out.println("El coche tiene: " + MiCarro.ruedas + " ruedas.");
//
//        MiCarro.EstablecerColor("rojo");
//        System.out.println("El color del carro es " + MiCarro.DevolverColor());
//
//        //Nuca se debe de poder manipular directamente la propiedad de un objeto utilizando la instancia de la clase
//        //MiCarro.color = "Azul";
//
//        MiCarro.setAsientosCuero("NO");
//        System.out.println(MiCarro.getAsientosCuero());
//        
//        MiCarro.setClimatizador("No");
//        MiCarro.getClimatizador();
//        
//        System.out.println(MiCarro.getPesoCarro()); //Estético, pero no retorna una variable sóla
//        
//        System.out.println("El precio final del carro es: " + MiCarro.getPrecioCarro()); //Antiestético pero retorna una variable sóla
//        
//        //Intentar tener la menor cantidad de código posible en el controlador.
