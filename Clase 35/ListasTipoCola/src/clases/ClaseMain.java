package clases;

import javax.swing.*;

public class ClaseMain {

    public static void main(String[] args) {
        Cola objeto = new Cola();
        int opción = 0;

        do {
            try {
                opción = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción: \n"
                        + "1. Insertar un nodo \n"
                        + "2. Extraer un nodo \n"
                        + "3. Mostrar contenido de la cola \n"
                        + "4. ¿Cual es el tamaño de la cola? \n"
                        + "5. ¿La cola esta vacía? \n"
                        + "6. Vaciar cola \n"
                        + "7. Salir.\n\n"));
                switch (opción) {
                    case 1:
                        int decisión = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un valor: "));
                        objeto.Insertar(decisión);
                        break;
                    case 2:
                        objeto.Extraer();
                        break;
                    case 3:
                        objeto.MostrarContenido();
                        break;
                    case 4:
                        objeto.TamañoCola();
                        break;
                    case 5:
                        if (objeto.ColaVacía()) {
                            JOptionPane.showMessageDialog(null, "La cola SI esta vacía");
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola NO esta vacía");
                        }
                        break;
                    case 6:
                        objeto.VaciarCola();
                        break;
                    case 7:
                        JOptionPane.showMessageDialog(null, "El programa se cerrará ... HASTA LA VISTA BABY");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, ingrese nuevamente una opción");
                        break;
                }
            } catch (NumberFormatException XXX) {
                JOptionPane.showMessageDialog(null, "ERROR !!! " + XXX);
            } catch (NullPointerException YYY) {
                JOptionPane.showMessageDialog(null, "ERROR !!! " + YYY);
            }
        } while (opción != 7);
    }
}
