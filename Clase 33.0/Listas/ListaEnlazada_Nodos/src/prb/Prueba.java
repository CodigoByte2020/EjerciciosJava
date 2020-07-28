package prb;

//import clases.Nod;
public class Prueba {

    public static void main(String[] args) {

        //Cada vez que se crea una instancia, el constructor se ejecuta una vez.
        Lógica mensajero1 = new Lógica(10);
        Lógica mensajero2 = new Lógica(20);
        Lógica mensajero3 = new Lógica(30);

        System.out.println(mensajero1.valor);
        System.out.println(mensajero2.valor);
        System.out.println(mensajero3.valor);

        System.out.println("");

        mensajero1.Datos();
        mensajero2.Datos();
        mensajero3.Datos();

        //La gran diferencia entre los métodos void y con retorno es la forma en que se mandan a llamar
        System.out.println(mensajero1.Información());
        //mensajero1.Información();
        //System.out.println(mensajero1.Resumen());
        mensajero1.Resumen();
        
    }
    
    
}
