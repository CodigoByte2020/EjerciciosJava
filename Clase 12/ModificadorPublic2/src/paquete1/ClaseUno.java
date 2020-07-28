package paquete1;

public class ClaseUno {

    public static void main(String[] args) {
        int base = 5;
        int altura = 10;
        int area = 0;
        AtributosMétodos Objeto = new AtributosMétodos(base, altura);
        Objeto.Imprimir();
        Objeto.base = 10;
        Objeto.altura = 20;
        /* 
        Con este modificador de acceso ya no son necesarios los métodos getter y setter
        Objeto.setBase(15);
        Objeto.getBase();
         */
         /*
        Error al usar los métodos        
        System.out.println((Objeto.CalcularArea()));
         */
        Objeto.Imprimir();
    }
}
