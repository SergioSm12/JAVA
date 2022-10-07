/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import domain.Persona;

/**
 *
 * @author david
 */
public class TestArreglosObject {
    public static void main(String[] args) {
        //Arreglo de tipo personas 
        Persona personas[] = new Persona[2];
        
        personas[0]= new Persona("Juan");
        personas[1]= new Persona("David");
        
        for(int i=0; i<personas.length;i++){
            System.out.println("Persona " + i +" : " + personas[i] );
        }
    }
}
