package herencia;

public class Terrestre extends Animal{
  
    private int patas;
    private boolean cola;
    private String dieta;
    
    public final String getComer() {
        return "Se alimenta de " + dieta;
    }
    
    public final String getCaminar() {
        return "Camina sobre la tierra";
    } 
    
    public String getInformación() {
        
        String Cola = null;
        
        if (cola) {
            Cola = "Posee cola";
        } else if (!cola) {
            Cola = "No posee cola";
        }
        
        return "Información del animal: \n"
                + "Nombre: " + getNombre() + "\n"
                + "Peso: " + getPeso() + "\n"
                + "Tamaño: " + getTamaño() + "\n"
                + "Sexo: " + getSexo() + "\n"
                + "Patas: " + patas + "\n"
                + Cola + "\n"
                + "Come: " + dieta + "\n";
    }
}
