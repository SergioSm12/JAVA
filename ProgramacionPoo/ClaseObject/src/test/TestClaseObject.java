package test;

import domain.Empleado;

public class TestClaseObject {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 5000000);
        Empleado empleado2 = new Empleado("Juan", 5000000);

        //Prguntar si un objeto tiene la misma referencia de memoria
        if (empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia de memoria");
        } else {
            System.out.println("No tienen la misma referencia en memoria ");
        }
// Uso de equals para evaluar el contenido de dos objetos
        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos tienen el mismo contenido");
        } else {
            System.out.println("Los objetos no son iguales en contenido");
        }
        //Uso de hashcode para evaluar el contenido de dos objetos
        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("Tienen el mismo contenido usando hashcode");
        } else {
            System.out.println("El contenido es diferente usando hashcode");
        }
    }

}
