package clases;

import clases.CategoríaJunior;
import clases.CategoríaNovel;
import clases.CategoríaElite;

public class ClaseMain {
    
    /*Con este método averiguamos a que categoría perteneze el usuario y según eso creamos un objeto de la clase de la categoría 
    y mandamos a llamar a los métodos correspondientes */
    public static void main(String[] args) {

        //Creamos una instancia u objeto de una clase al azar para poder llamar a los métodos IngresarDatos() y EstablecerCategoría()
        CategoríaJunior MensajeroJ2 = new CategoríaJunior();
        MensajeroJ2.IngresarDatos();
        MensajeroJ2.EstablecerCategoría();

        if (MensajeroJ2.getFinPrograma() == false) {            
            for (int i = 1; i <= 10 && MensajeroJ2.getFinPrograma() == false; i += 1) {
                switch (MensajeroJ2.categoría) {
                    case "Junior":
                        CategoríaJunior MensajeroJ = new CategoríaJunior(); //Según la categoría del usuario creamos un objeto de la clase de la categoría
                        MensajeroJ.IngresarPuesto();
                        if (MensajeroJ.getFinPrograma() == false) { //Averiguamos el valor de la variable FinPrograma para saber si llamamos al siguiente método
                            MensajeroJ.EstablecerPuntaje();
                        }
                        /*Gracias al objeto creado al azar y el método setter establecemos el valor de la variable FinPrograma, dicho valor lo obtenemos gracias al 
                        objeto de la clase de la categoría*/
                        MensajeroJ2.setFinPrograma(MensajeroJ.getFinPrograma());
                        break;
                    case "Novel":
                        CategoríaNovel MensajeroN = new CategoríaNovel();
                        MensajeroN.IngresarPuesto();
                        if (MensajeroN.getFinPrograma() == false) {
                            MensajeroN.EstablecerPuntaje();
                        }
                        MensajeroJ2.setFinPrograma(MensajeroN.getFinPrograma());
                        break;
                    case "Elite":
                        CategoríaElite MensajeroE = new CategoríaElite();
                        MensajeroE.IngresarPuesto();
                        if (MensajeroE.getFinPrograma() == false) {
                            MensajeroE.EstablecerPuntaje();
                        }
                        MensajeroJ2.setFinPrograma(MensajeroE.getFinPrograma());
                        break;
                }
            }
            if (MensajeroJ2.getFinPrograma() == false) {
                MensajeroJ2.ResumenFinal();
            }
        }        
    }
}
