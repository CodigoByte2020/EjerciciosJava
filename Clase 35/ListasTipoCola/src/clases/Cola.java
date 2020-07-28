package clases;

import javax.swing.JOptionPane;

public class Cola {

    private Nodo InicioCola;
    private Nodo FinalCola;
    private int tamaño;

    public Cola() {
        InicioCola = null;
        FinalCola = null;
    }

    public void Insertar(int dato) {
        Nodo NuevoNodo = new Nodo(dato);
        if (InicioCola == null) {
            InicioCola = NuevoNodo;
            FinalCola = NuevoNodo;
        } else {
            FinalCola.siguiente = NuevoNodo;
            FinalCola = NuevoNodo;

        }
        tamaño += 1;
    }

    public void Extraer() {
        int DatoExtraído = 0;
        if (InicioCola == null) {
            JOptionPane.showMessageDialog(null, "La cola está vacía");
        } else {
            DatoExtraído = InicioCola.dato;
            InicioCola = InicioCola.siguiente;
            JOptionPane.showMessageDialog(null, "Valor eliminado: " + DatoExtraído);
            tamaño -= 1; 
        }             
    }

    public void MostrarContenido() {
        Nodo recorrido = InicioCola;
        int array[];
        String cadena = "";

        if (InicioCola == null) {
            JOptionPane.showMessageDialog(null, "La cola está vacía");
        } else {
            array = new int[tamaño];
            for (int i = 0; i < tamaño; i++) {
                array[i] = recorrido.dato;
                recorrido = recorrido.siguiente;
            }
            for (int i = tamaño - 1; i >= 0; i--) {
                cadena += array[i] + " ";
            }
            JOptionPane.showMessageDialog(null, cadena);
        }
    }

    public void TamañoCola() {
        JOptionPane.showMessageDialog(null, "La cola tiene " + tamaño + " elementos");
    }

    public boolean ColaVacía() {
        return InicioCola == null;
    }

    public void VaciarCola() {
        if (!ColaVacía()) {
            while (!ColaVacía()) {
                Extraer();
            }
            JOptionPane.showMessageDialog(null, "Cola vaciada correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "La cola esta vacía");
        }
    }
}
