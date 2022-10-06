package test;

import dominio.Persona;

/**
 *
 * @author david
 */
public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Sergio", 4000000.00, false);
        System.out.println("Persona " + persona1.getNombre());
        System.out.println("Persona 1 " + persona1.toString());
        persona1.setNombre("Sergio David");
//        System.out.println("persona1 nombre con cambio : " + persona1.getNombre());
//        System.out.println("persona1 sueldo : " + persona1.getSueldo());
//        System.out.println("persona1 eliminado : " + persona1.isEliminado());
         System.out.println("Persona 1 " + persona1);
    }
}
