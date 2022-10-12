
package paquete1;

import paquete1.Clase1;
import paquete1.ClaseHija;

/**
 *
 * @author david
 */
public class TestModificadoreAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1("hola");
       // System.out.println("clase1 = " + clase1.atributoPublico);
        //clase1.metodoPublico();
        System.out.println(clase1.getAtributoPrivado());
        
    }
}
