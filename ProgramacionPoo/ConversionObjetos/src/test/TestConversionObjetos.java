/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.*;

/**
 *
 * @author david
 */
public class TestConversionObjetos {

    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 2500000, TipoEscritura.CLASICO);
        // se utiliza polimorfismo para llamar la variable obtener detalles,
        // a pesar de que la variable empleado es de tipo padre 
        System.out.println("empleado = " + empleado.obtenerDetalles());
       
        //Si trato de traer un metodo proprio de la clase hija me marca error
        // no usa polimorfismo debido a que la clase padre no cuenta con este metodo
        //empleado.getTipoEscritura
        //para poder lograr esto con esta misma variable se debe hacer una conv
        //ersion de objetos.
        //Downcasting
        //((Escritor)empleado).getTipoEscritura();
        //otra sintaxis
        Escritor escritor = (Escritor)empleado;
        //Despues de la conversion si podemos usar el metodo propio de la clase hija
        escritor.getTipoEscritura();
        
        //Asignar una variable de tipo hija a un padre (no hay necesidad de hacer conversion)
        //Upcasting
        Empleado empleado2 = escritor;
        //puedo acceder a cualquier metodo de la clase padre o hija 
        empleado2.obtenerDetalles();
    }

}
