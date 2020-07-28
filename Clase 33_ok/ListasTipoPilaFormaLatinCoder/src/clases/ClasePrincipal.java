package clases;

import javax.swing.JOptionPane;

public class ClasePrincipal {

    public static void main(String[] args) {

        Lista_Pila pila = new Lista_Pila();
        int opción = 0;
        Object ValorNodo;
        int posición = 0;

        do {

            try {

                opción = Integer.parseInt(JOptionPane.showInputDialog(null, "MENU DE OPCIONES\n\n"
                        + "1. Insertar un nodo \n"
                        + "2. Eliminar un nodo \n"
                        + "3. ¿La pila esta vacía? \n"
                        + "4. ¿Cuál es el último valor ingresado en la pila? \n"
                        + "5. ¿Cuántos nodos tiene la pila? \n"
                        + "6. Vaciar pila \n"
                        + "7. Mostrar contenido de la pila \n"
                        + "8. ¿Cuál es el primer valor ingresado en la pila ? \n"
                        + "9. Mostrar valor de una determinada posición \n"
                        + "10. Salir. \n\n"));

                switch (opción) {
                    case 1:
                        ValorNodo = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor del nuevo nodo"));
                        pila.InsertarNodo(ValorNodo);
                        break;

                    case 2:
                        if (!pila.PilaVacía()) {
                            JOptionPane.showMessageDialog(null, pila.EliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacía");
                        }
                        break;

                    case 3:
                        if (pila.PilaVacía()) {
                            JOptionPane.showMessageDialog(null, "La pila SI esta vacía");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila NO esta vacía");
                        }
                        break;

                    case 4:
                        if (!pila.PilaVacía()) {
                            JOptionPane.showMessageDialog(null, pila.MostrarUltimoValorIngresado());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacía");
                        }
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene " + pila.TamañoPila() + " nodo(s)");
                        break;

                    case 6:
                        pila.VaciarPila();
                        break;

                    case 7:
                        pila.MostrarContenido();
                        break;

                    case 8:
                        if (!pila.PilaVacía()) {
                            JOptionPane.showMessageDialog(null, pila.MostrarPrimerValorIngresado());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacía");
                        }
                        break;

                    case 9:
                        if (!pila.PilaVacía()) {
                            posición = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la posición que desea mostrar su valor"));
                            pila.MostrarValor(posición);
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacía");
                        }
                        break;

                    case 10:
                        opción = 10;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve a ingresar una opción");
                        break;
                }

            } catch (NumberFormatException XXX) {
                JOptionPane.showMessageDialog(null, "Excepción encontrada: " + XXX);
            }

        } while (opción != 10);
    }
}
