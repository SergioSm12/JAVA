/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import aritmetica.Aritmetica;
import excepciones.OperacionExcepcion;

/**
 *
 * @author david
 */
public class TestExcepciones {

    public static void main(String[] args) {
        // Manejo de try catch
        int resultado = 0;
        try {
            resultado = Aritmetica.division(10, 0);
        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrio un error de tipo OperecionException");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocurrio un error de tipo Exception:");
            //para que imprima el error
            e.printStackTrace(System.out);
        } finally {
            System.out.println("Se reviso la division entre cero");
        }
        System.out.println("resultado = " + resultado);
    }
}
