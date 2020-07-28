package paquete1;

public class AtributosMétodos {

    //Atributos y métodos con el modificador de acceso private
    private int número1, número2;
    private String cadena;

    private void Método2() {

    }

    //Método getter, para poder consultar el valor de un atributo privado
    public int getNúmero1() {
        return número1;
    }
    
    //Método setter, para poder modificar el valor de un atributo privado
    public void setNúmero1(int número1) {
        this.número1 = número1;
    }
}
