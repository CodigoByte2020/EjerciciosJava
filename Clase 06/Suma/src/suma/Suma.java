package suma;

public class Suma {

    private int vUno, vDos;
    public int resultado;

    //Creamos un constructor para poder almacenar los datos que trae el objeto desde la otra clase, también creamos las variables para poder almacenar dichos datos.
    public Suma(int ValorUno, int ValorDos) {
        // El valor que acaba de llegar (ValorUno) se guarda dentro de la variable vUNo que pertenece a esta clase.
        this.vUno = ValorUno;
        this.vDos = ValorDos;
    }

    // Creamos un método de ámbito public para que pueda ser utilizado por otros métodos y clases, de tipo void para que retorne un valor.
    public void Operación() {
        // Utilizamos las variables donde ya se almaceno los valores que el usuario asigno desde la clase SumaMain
        resultado = vUno + vDos;
    }

    public void Imprimir() {
        // Mandamos a llamar al método donde se realiza la suma (Operación)
        Operación();
        System.out.println("El resultado de la suma es: " + resultado);
    }
}
