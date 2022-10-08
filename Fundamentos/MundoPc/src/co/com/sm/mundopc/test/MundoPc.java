
package co.com.sm.mundopc.test;

import co.com.sm.mundopc.Computadora;
import co.com.sm.mundopc.Monitor;
import co.com.sm.mundopc.Raton;
import co.com.sm.mundopc.Teclado;

/**
 *
 * @author david
 */
public class MundoPc {
     public static void main(String[] args) {
         Raton raton1 = new Raton("USB", "Asus");
         Teclado teclado1 = new Teclado("USB", "Asus");
         Monitor monitor1= new Monitor("Samsung", 18.6);
         Computadora computadora1 = new Computadora("Asus gw552", monitor1, teclado1, raton1);
         
         
    }
    
}
