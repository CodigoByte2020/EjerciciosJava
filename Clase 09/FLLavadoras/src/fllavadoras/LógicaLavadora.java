package fllavadoras;

public class LógicaLavadora {

    private int kilos, tipoRopa, llenado, lavado, secado;

    public LógicaLavadora(int kilos, int TipoRopa) {
        this.kilos = kilos;
        this.tipoRopa = TipoRopa;
    }

    private void llenado() {
        if (kilos <= 12) {
            System.out.println("Llenado de ropa correcta.");
            System.out.println("Se procederá a lavar.");
            llenado = 1;
        } else {
            System.out.println("Por favor disminuye el peso de la ropa para poder iniciar con el lavado.");
        }
    }

    private void lavado() {
        llenado();
        if (llenado == 1) {
            if (tipoRopa == 1) {
                System.out.println("La ropa que ingreso es de color blanco.");
                System.out.println("Se procedera a realizar un lavado suave");
                lavado = 1;
            } else if (tipoRopa == 2) {
                System.out.println("La ropa que ingreso es de color.");
                System.out.println("Se procederá a realizar un lavado intenso");
                lavado = 1;
            } else {
                System.out.println("Ingreso un tipo de ropa incorrecto.");
                System.out.println("Se procederá a realizar un lavado intenso");
                lavado = 1;
            }
        }
    }

    private void secado() {
        lavado();
        if (lavado == 1) {
            System.out.println("Secando su ropa.");
            secado = 1;
        }
    }

    public void CicloFinalizado() {
        secado();
        if (secado == 1) {
            System.out.println("Su ropa esta lista.");
        }
    }
}
