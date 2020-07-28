package paquete2;

import paquete1.AtributosMétodos;

public class ClaseDos {

    public static void main(String[] args) {
        int base = 0, altura = 0;
        /*Variables que tengan el modificador de acceso protected no podrán ser accedidos desde clases que estén en otro paquete. Excepto si usamos los 
        métodos getter y setter en modo public y siempre y cuando el constructor también esté en modo public. También pueden ser accedidos desde cualquier
        clase que herede la clase en la que se encuentran*/

        AtributosMétodos Objeto2 = new AtributosMétodos(base, altura);
        //Objeto2.base = 10; //forma incorrecta de acceder a la variable base
        Objeto2.setBase(10); //forma correcta de acceder a la variable base
        System.out.println(Objeto2.getBase());
    }
}
