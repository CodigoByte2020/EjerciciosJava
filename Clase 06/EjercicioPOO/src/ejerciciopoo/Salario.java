package ejerciciopoo;

public class Salario {

    String Nombre;
    int HorasT;
    float ValorH, ValorHoraExtra, salario;

    public Salario(String nombre, int HorasTrabajadas, float ValorHora) {
        this.HorasT = HorasTrabajadas;
        this.ValorH = ValorHora;
        this.Nombre = nombre;
    }

    public void CalcularSalario() {
        if (HorasT <= 40) {
            salario = HorasT * ValorH;
        } else {
            ValorHoraExtra = (float) (ValorH * 1.5);
            salario = 40 * ValorH + (HorasT - 40) * ValorHoraExtra;
        }
    }

    public void Imprimir() {
        CalcularSalario();
        System.out.println("El salario  que le corresponde al trabajador " + Nombre + " es: " + salario);
    }
}
