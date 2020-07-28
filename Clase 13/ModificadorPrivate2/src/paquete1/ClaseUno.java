package paquete1;

public class ClaseUno {

    public static void main(String[] args) {
        int base = 5;
        int altura = 10;
        AtributosMétodos Objeto = new AtributosMétodos(base, altura);
        Objeto.setBase(15); 
        System.out.println(Objeto.getBase());
    }
}
