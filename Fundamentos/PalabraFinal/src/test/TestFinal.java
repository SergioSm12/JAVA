package test;

import domain.Persona;

public class TestFinal {

    public static void main(String[] args) {
        //Se usa final para hacer una constante  
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);

        final Persona persona1 = new Persona();
        //No se puede modificar la variable debido al final
        //persona1 = new Persona();
        
        persona1.setNombre("Sergio");
        System.out.println("persona1 = " + persona1.getNombre());
    }
}
