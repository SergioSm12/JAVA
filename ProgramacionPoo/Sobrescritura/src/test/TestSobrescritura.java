package test;

import domain.*;

public class TestSobrescritura {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("David", 2500000);
       // System.out.println("empleado1 = " + empleado1.obtenerDetalles());
        imprimir(empleado1);
        Gerente gerente1 = new Gerente("Dahiana", 3000000, "Sistemas");
        //System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        imprimir(gerente1);
    }
    
    //Creacion del metodo que cambia su comportamiento (polimorfismo)
    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("empleado = " + detalles);    
    }
    
}
