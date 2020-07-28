package ejerciciothis;

public class Rectángulo {

    int base, altura;
    float area;

    public Rectángulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void CalcularArea() {
        area = base * altura;
    }

    public void Imprimir() {
        CalcularArea();
        System.out.println("El área del rectángulo es: " + area);
    }
}
