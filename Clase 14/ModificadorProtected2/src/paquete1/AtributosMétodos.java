package paquete1;

public class AtributosMétodos {

    protected int base, altura, área;

    /*Variables que tengan el modificador de acceso protected no podrán ser accedidos desde clases que estén en otro paquete. Excepto si usamos los 
        métodos getter y setter en modo public y siempre y cuando el constructor también esté en modo public. También pueden ser accedidos desde cualquier
        clase que herede la clase en la que se encuentran*/
    public AtributosMétodos(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    protected void CalcularArea() {
        área = base * altura;
    }

    protected void Imprimir() {
        CalcularArea();
        System.out.println("El área es: " + área);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

}
