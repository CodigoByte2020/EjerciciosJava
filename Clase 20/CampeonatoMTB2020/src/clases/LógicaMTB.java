package clases;

import java.util.Scanner;

public abstract class LógicaMTB {

    Scanner entrada = new Scanner(System.in);
    protected String nombre;
    protected int edad, puesto, PuntajeFecha;
    public String categoría = "";
    static protected int PuntajeFinal, contador = 1;
    private boolean bandera = false, FinPrograma = false;

    //Este método es para el ingreso de datos del usuario
    public void IngresarDatos() {

        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
    }

    //Método getter para poder obtener el valor de la variable FinPrograma desde otra clase
    public boolean getFinPrograma() {
        return FinPrograma;
    }

    //Método setter para poder asignarle un valor a la variable FinPrograma desde otra clase
    public void setFinPrograma(boolean FinPrograma) {
        this.FinPrograma = FinPrograma;
    }

    //Según la edad ingresada por el usuario se le asignará una categoría
    public void EstablecerCategoría() {

        for (int i = 2; i >= 0 && bandera == false; i -= 1) {
            if (edad >= 15 && edad <= 17) {
                categoría = "Junior";
                System.out.println("Usted permanece a la categoría " + categoría);
                bandera = true;
            } else if (edad >= 18 && edad <= 22) {
                categoría = "Novel";
                System.out.println("Usted permanece a la categoría " + categoría);
                bandera = true;
            } else if (edad >= 23) {
                categoría = "Elite";
                System.out.println("Usted permanece a la categoría " + categoría);
                bandera = true;
            } else {
                if (edad >= 0) {
                    System.out.println("No tiene la edad adecuada para participar en este campeonato.");
                } else {
                    System.out.println("Esta edad no existe");
                }
                //Con esta sección de código determinamos cuantos intentos fallidos y válidos tiene el usuario para poder ingresar su edad
                if (i == 2 || i == 1) {
                    System.out.println("Le quedan " + i + " intento(s)");
                    System.out.print("Ingrese su edad: ");
                    edad = entrada.nextInt();
                } else {
                    System.out.println("Ya no le quedan intentos, el programa se cerrará automáticamente en 3 ... 2 ... 1 ... 0");
                    setFinPrograma(true); //Con esta variable determinamos si el programa sigue ejecutando los demás métodos o finaliza
                }
            }
        }
    }

    //Gracias a este método determinaremos si el usuario ingreso de manera correcta o incorrecta el puesto ocupado en la fecha
    public void IngresarPuesto() {

        for (int i = 2; i >= 0 && bandera == false; i -= 1) {
            System.out.print("¿Que puesto quedo en la fecha " + contador + "? ");
            puesto = entrada.nextInt();
            if (puesto == 1 || puesto == 2 || puesto == 3 || puesto == 4 || puesto == 5) {
                bandera = true;
                contador++;
            } else {
                if (i == 2 || i == 1) {
                    System.out.println("Puesto incorrecto, por favor vuelva a ingresar el puesto");
                    System.out.println("Le quedan " + i + " intento(s)");
                } else {
                    System.out.println("Puesto incorrecto");
                    System.out.println("Ya no le quedan intentos, el programa se cerrará automáticamente en 3 ... 2 ... 1 ... 0");
                    setFinPrograma(true);
                }
            }
        }
    }

    //Este método es abstracto (Polimorfismo), y tendrá un comportamiento diferente, dependiendo con que clase se esté comunicando
    public abstract void EstablecerPuntaje();

    //Con este método le consultamos al usuario si desea visualizar su puntaje acumulado
    public void ResumenFinal() {

        String decisión = "";
        String sí = "S";
        String no = "N";
        bandera = false;

        for (int i = 2; i >= 0 && bandera == false; i -= 1) {
            System.out.print("¿Desea ver su puntaje acumulado? (S/N)");
            decisión = entrada.next();
            if (decisión.equalsIgnoreCase(sí)) {
                System.out.println("Tu puntaje acumulado es: " + PuntajeFinal);
                bandera = true;
            } else if (decisión.equalsIgnoreCase(no)) {
                System.out.println("No se te mostrará ninguna información");
                bandera = true;
            } else {
                System.out.println("La opción elegida no es válida");
            }
            if (bandera == true) {
                setFinPrograma(true);
            } else {
                if (i == 2 || i == 1) {
                    System.out.println("Le quedan " + i + " intento(s)");
                } else {
                    System.out.println("Ya no le quedan intentos, el programa se cerrará automáticamente en 3 ... 2 ... 1 ... 0");
                    setFinPrograma(true);
                }
            }
        }
    }
}
