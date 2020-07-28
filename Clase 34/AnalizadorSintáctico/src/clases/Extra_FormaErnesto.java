package clases;

public class Extra_FormaErnesto {

    //Método para validar la expresión --------------- Forma de Ernesto
    public boolean ValidarExpresión() {
        ListaTipoPila pila = new ListaTipoPila();
        String cadena = txtExpresión.getText();

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(' || cadena.charAt(i) == '[' || cadena.charAt(i) == '{') {
                pila.Insertar(cadena.charAt(i));

            } else {
                if (cadena.charAt(i) == ')') {
                    if (pila.Eliminar() != '(') {
                        return false;
                    }
                } else if (cadena.charAt(i) == ']') {
                    if (pila.Eliminar() != '[') {
                        return false;
                    }
                } else if (cadena.charAt(i) == '}') {
                    if (pila.Eliminar() != '{') {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
