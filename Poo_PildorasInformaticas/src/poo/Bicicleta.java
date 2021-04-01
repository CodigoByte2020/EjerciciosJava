package poo;

public class Bicicleta {

    private int llantas; 
    private String marco;
    private String horquilla;
    private int precio;
    private int peso;
    private boolean parante;
    private String ObjetoAdicional;

    public Bicicleta() {
        llantas = 2;
        marco = "Scott";
        horquilla = "RockShock";
    }

    //GETTER
    public String getInformación() {
        String información = "Bicicleta con " + llantas + " llantas, con un marco " + marco + " y una horquilla " + horquilla;
        return información;
    }

    //SETTER
    public void setParante(String parante) {
        if (parante.equalsIgnoreCase("si")) {
            this.parante = true;
        } else {
            this.parante = false;
        }
    }

    //GETTER
    public String getParante() {
        if (parante == true) {
            return "La bicicleta SI tiene parante";
        } else {
            return "La bicicleta NO tiene parante";
        }
    }

    //SETTER AND GETTER -- Es recomendable separar cada método en su respectivo setter and getter
    public String getObjetoAdicional(String ObjetoAdicional) {
        this.ObjetoAdicional = ObjetoAdicional;
        if (this.ObjetoAdicional.equals("")) {
            return "La bicicleta NO tiene objeto adicional";
        } else {
            return "La bicicleta SI tiene objeto adicional";
        }        
    }
    
    //SETTER
    public void setPeso() {
        
        peso = 15; 
        
        if (parante == true) {
            peso += 3;
        }   
        
        if (ObjetoAdicional.equalsIgnoreCase("tomatodo")) {
            peso += 2;
        } else if (ObjetoAdicional.equalsIgnoreCase("cartuchera")) {
            peso += 1;
        }
    }
    
    //GETTER
    public String getPeso() {
        return "El peso de la bicicleta es: " + peso;
    }
    
    //SETTER
    public void setPrecio() {
        
        precio = 500;
        
        if (parante == true) {
            precio += 20;
        }
        
        if (ObjetoAdicional.equalsIgnoreCase("TOMAtodo")) {
            precio += 5;
        } else if (ObjetoAdicional.equalsIgnoreCase("CARTUCHERA")) {
            precio += 3;
        }        
    }
    
    //GETTER
    public int getPrecio() {
        return precio;
    }
    
    //GETTER
    public float getPrecioDólares() {
        float PrecioDólares = (float) (precio * 3.4);
        return PrecioDólares;
    }
}
