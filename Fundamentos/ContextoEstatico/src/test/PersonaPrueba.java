package test;

import domain.Persona;

/**
 *
 * @author david
 */
public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        imprimir(persona1);
        Persona persona2 = new Persona("Karla");
        imprimir(persona2);
    }

    //dentro de un metodo static solo se puede usar otro metodo static
    public static void imprimir(Persona persona) {
        
        System.out.println("persona = " + persona);
    }
}
