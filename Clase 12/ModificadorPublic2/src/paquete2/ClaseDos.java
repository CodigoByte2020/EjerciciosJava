package paquete2;

import paquete1.AtributosMétodos;

public class ClaseDos {

    public static void main(String[] args) {
        int base = 0, altura = 0, area = 0;
        /*Variables y métodos que tengan el modificador de acceso public podrán ser accedidos desde cualquier clase, sin importar si está clase está en otro paquete. 
        Y siempre y cuando el constructor también esté en modo public.*/

        AtributosMétodos Objeto2 = new AtributosMétodos(base, altura);
        Objeto2.base = 10; // forma correcta de acceder a la variable base
        /* Con este modificador de acceso ya no son necesarios los métodos getter y setter
        Objeto2.setBase(10);
        System.out.println(Objeto2.getBase());*/
        Objeto2.Imprimir();
    }
}
