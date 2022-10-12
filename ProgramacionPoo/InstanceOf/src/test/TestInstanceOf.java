package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("David", 2500000);
        //Evalua si empleado pertenece a gerente 
        determinarTipo(empleado1);
        empleado1 = new Gerente("Dahiana", 3000000, "Sistemas");
        // evalua si pertenece a gerente 
        determinarTipo(empleado1);
    }

    //metodo para saber a que clase pertenece 
    public static void determinarTipo(Empleado empleado) {
        //siempre se empieza desde la clase hija
        //siempre se debe usar else if  si no repite las variables padre
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
            //COnversion de tipo padre a hijo
            Gerente gerente = (Gerente)empleado;
            System.out.println("gerente = " + gerente.getDepartamento()); 
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo empleado");
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo object");
        }
    }
}
