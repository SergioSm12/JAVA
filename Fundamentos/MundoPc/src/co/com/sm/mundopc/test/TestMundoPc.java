package co.com.sm.mundopc.test;

import co.com.sm.mundopc.Computadora;
import co.com.sm.mundopc.Monitor;
import co.com.sm.mundopc.Orden;
import co.com.sm.mundopc.Raton;
import co.com.sm.mundopc.Teclado;

/**
 *
 * @author david
 */
public class TestMundoPc {

    public static void main(String[] args) {
       
        Teclado teclado1 = new Teclado("Inalambrica", "JQANG");
        Raton raton1 = new Raton("USB", "MEGA");
        Monitor monitor1 = new Monitor("samsung", 18.6);
        Computadora pc1 = new Computadora("Ensamblada", monitor1, teclado1, raton1);
        Computadora pc2 = new Computadora("Ensamblada", monitor1, teclado1, raton1);
       
       Orden orden1 = new Orden();
       orden1.agregarComputadora(pc1);
       orden1.agregarComputadora(pc2);
       
       orden1.mostrarOrden();
    }

}
