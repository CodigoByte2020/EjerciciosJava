package clases;

public class ClaseHija extends ClasePadre {

    /*Cuando tenemos un método de la clase hija con el mismo nombre que un método de la clase padre, utilizamos la palabra reservada super para referirnos al método
    de la clase padre.
    Más: Si un método esta con una lógica en la clase padre, a este método le podemos cambiar la lógica de su funcionamiento en la clase hija*/
    public void Saludar() {
        super.Saludar();
    }
}
