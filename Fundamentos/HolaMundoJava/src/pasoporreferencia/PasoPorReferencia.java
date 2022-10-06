
package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre="Juan";
        System.out.println("persona1 nombre : " +persona1.nombre);
        persona1=cambiaValor(persona1);
        System.out.println("nombre cambiado : " + persona1.nombre);
    }
    
    public static Persona cambiaValor(Persona persona){
        persona.nombre="sergio";
        return persona;
    }
 
}
