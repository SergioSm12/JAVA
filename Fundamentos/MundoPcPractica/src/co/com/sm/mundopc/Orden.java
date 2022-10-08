package co.com.sm.mundopc;

/**
 *
 * @author david
 */
public class Orden {

    private int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = Orden.contadorOrdenes;
        this.computadoras = new Computadora[Orden.MAX_COMPUTADORAS];
    }

    public void agrgarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.MAX_COMPUTADORAS) {
            this.computadoras[contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha supeerado el maximo " + Orden.MAX_COMPUTADORAS);
        }

    }
    public void mostrarOrden(){
    
        System.out.println("orden # " + this.idOrden);
        System.out.println("Computadora de la orden : ");
        for (int i = 0; i < contadorComputadoras; i++) {
            System.out.println(computadoras[i]);           
        }
    
    }

}
