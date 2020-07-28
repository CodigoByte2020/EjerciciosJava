package listastipopila;

import javax.swing.*;

public class ClasePrincipal {

    public static void main(String[] args) {
        int opción = 0, valor;
        Pila pila = new Pila();

        do {
            try {
                opción = Integer.parseInt(JOptionPane.showInputDialog(null, "Menú de Opciones \n\n"
                        + "1. Insertar un nodo \n"
                        + "2. Eliminar un nodo \n"
                        + "3. ¿La pila está vacía? \n"
                        + "4. ¿Cuál es el último valor ingresado en la pila? \n"
                        + "5. ¿Cuántos nodos tiene la pila? \n"
                        + "6. Vaciar pila \n"
                        + "7. Mostrar contenido de la pila \n"
                        + "8. Salir \n\n"));
                switch (opción) {
                    case 1:
                        valor = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Ingrese el valor del nuevo nodo: "));
                        pila.InsertarNodo(valor);
                        break;

                    case 2:
                        if (pila.UltimoValorIngresado != null) {
                            JOptionPane.showMessageDialog(null, pila.EliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila está vacía");
                        }
                        break;

                    case 3:
                        if (pila.PilaVacía() == false) {
                            JOptionPane.showMessageDialog(null, "La pila NO está vacía");
                        } else if (pila.PilaVacía() == true) {
                            JOptionPane.showMessageDialog(null, "La pila SI está vacía");
                        }
                        break;

                    case 4:
                        if (pila.UltimoValorIngresado != null) {
                            JOptionPane.showMessageDialog(null, pila.UltimoValorIngresado());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila está vacía");
                        }
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene " + pila.TamañoPila() + " nodo(s).");
                        break;

                    case 6:
                        if (pila.UltimoValorIngresado != null) {
                            while (pila.UltimoValorIngresado != null) {
                                pila.VaciarPila();
                            }
                            JOptionPane.showMessageDialog(null, "Se ha vaciado correctamente la pila");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacía");
                        }
                        break;

                    case 7:
                        JOptionPane.showMessageDialog(null, pila.MostrarContenido());
                        pila.lista = "";
                        break;

                    case 8:
                        opción = 8;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve a ingresar.");
                        break;
                }
            } catch (NumberFormatException XXX) {
                JOptionPane.showMessageDialog(null, "Excepción encontrada: " + XXX);
            }

        } while (opción != 8);
    }
}
