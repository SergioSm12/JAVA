package co.com.sm.mundopc;

/**
 *
 * @author david
 */
public class Orden {

    private int idOrden;
    private Computadora computadoras[];
    private int contadorComputadoras;
    private static int contadorOrdenes;
    private static final int maxComputadoras = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.maxComputadoras) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado el limite maximo de computadoras : " + Orden.maxComputadoras);
        }

    }

    public void mostrarOrden() {
        System.out.println("Orden # " + this.idOrden);
        System.out.println("Computadores de la orden : ");
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }

}
