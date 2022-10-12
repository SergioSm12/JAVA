/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aritmetica;

import excepciones.OperacionExcepcion;

/**
 *
 * @author david
 */
public class Aritmetica {

    //se debe indicarle al metodo que puede arrojar una excepcion(throws)
    // cuando se usa runtime exception no es necesario usar  throws
    public static int division(int numerador, int denominador) //throws OperacionExcepcion 
    {
        if (denominador == 0) {
            // se debe agreagar throw antes de llamar la clase de excepcion  
            throw new OperacionExcepcion("Divicion entre cero");
        }
        return numerador / denominador;
    }
}
