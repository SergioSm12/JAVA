
package clases;

/**
 *
 * @author david
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        persona1.nombre="Sergio ";
        persona1.apellido="Mesa";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        
        persona2.desplegarInformacion();
    }
}
