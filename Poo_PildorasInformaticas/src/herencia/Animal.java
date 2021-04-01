//23:36
package herencia;

public abstract class Animal {

    private String nombre;
    private float peso;
    private float tamaño;
    private String sexo;

    public abstract String getInformación(); 
    
    public String getNombre() {
        return nombre;
    }
    
    public float getPeso() {
        return peso;
    }
    
    public float getTamaño() {
        return tamaño;
    }
    
    public String getSexo() {
        return sexo;
    }
}
