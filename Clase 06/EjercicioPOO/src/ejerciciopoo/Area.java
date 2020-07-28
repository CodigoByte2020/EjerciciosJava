package ejerciciopoo;

public class Area {

    float vBase, vAltura, resultado;

    public Area(float base, float altura) {
        this.vBase = base;
        this.vAltura = altura;
    }

    public void CalcularArea() {
        resultado = vBase * vAltura;
    }

    public void Imprimir() {
        CalcularArea();
        System.out.println("El valor del area del triángulo es: " + resultado);
    }
}
