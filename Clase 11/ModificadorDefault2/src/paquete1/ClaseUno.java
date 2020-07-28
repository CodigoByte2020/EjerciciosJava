package paquete1;

public class ClaseUno {

    public static void main(String[] args) {
        int base = 5;
        int altura = 10;
        AtributosMétodos Objeto = new AtributosMétodos(base, altura);
        Objeto.Imprimir();
        Objeto.base = 10;
        Objeto.altura = 20;
        Objeto.setBase(15);
        Objeto.getBase();
        //Objeto.CalcularArea();
        //System.out.println((Objeto.CalcularArea()));
        Objeto.Imprimir();
    }
}
