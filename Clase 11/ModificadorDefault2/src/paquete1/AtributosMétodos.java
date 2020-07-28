package paquete1;

public class AtributosMétodos {

    int base, altura, área;

    /*Variables que tengan el modificador de acceso por defecto solo podrán ser accedidos desde clases que estén en el mismo paquete. Excepto si usamos los 
    métodos getter y setter en modo public y siempre y cuando el constructor también esté en modo public.*/
    
    public AtributosMétodos(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    void CalcularArea() {
        área = base * altura;
    }

    void Imprimir() {
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
