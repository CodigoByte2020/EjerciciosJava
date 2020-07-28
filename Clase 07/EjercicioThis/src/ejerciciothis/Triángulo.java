package ejerciciothis;

public class Triángulo {

    // Las variables pueden tener el mismo nombre siempre y cuando pertenezcan a diferentes clases.
    int base, altura;
    float area;

    public Triángulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // Los métodos también pueden tener el mismo nombre siempre y cuando pertenezcan a diferentes clases.
    public void CalcularArea() {
        area = (base * altura) / 2;
    }

    public void Imprimir() {
        CalcularArea();
        System.out.println("El área del triángulo es: " + area);
    }
}
