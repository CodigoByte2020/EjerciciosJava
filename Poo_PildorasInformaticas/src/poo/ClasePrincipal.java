package poo;

import javax.swing.JOptionPane;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        Bicicleta bicicleta = new Bicicleta();
        
        System.out.println(bicicleta.getInformación());
        
        bicicleta.setParante(JOptionPane.showInputDialog("¿ La bicicleta tiene parante ?"));
        System.out.println(bicicleta.getParante());
        
        System.out.println(bicicleta.getObjetoAdicional(JOptionPane.showInputDialog("¿ Que objeto adicional tendrá la bicicleta ?")));
    
        bicicleta.setPeso();
        System.out.println(bicicleta.getPeso());
    
        bicicleta.setPrecio();
        
        System.out.println("Precio de la bicicleta en soles: S/." + bicicleta.getPrecio());
        System.out.println("Precio de la bicicleta en dólares: $." + bicicleta.getPrecioDólares());    
    }
    
}
