package arearectangulo;

public class Rectangulo {

    double base, altura, area;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void CalcularArea() {
        area = base * altura;
    }

    public void Imprimir() {
        CalcularArea();
        System.out.println("Al area del rectángulo es: " + area);
    }
}
