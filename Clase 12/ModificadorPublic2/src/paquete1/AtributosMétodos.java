package paquete1;

public class AtributosMétodos {

    public int base, altura, área;

    /*Variables y métodos que tengan el modificador de acceso public podrán ser accedidos desde cualquier clase, sin importar si está clase está en otro paquete. 
    Y siempre y cuando el constructor también esté en modo public.*/
    public AtributosMétodos(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void CalcularArea() {
        área = base * altura;
    }

    public void Imprimir() {
        CalcularArea();
        System.out.println("El área es: " + área);
    }

    /* Con este modificador de acceso ya no son necesarios los métodos getter y setter
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }*/
}
