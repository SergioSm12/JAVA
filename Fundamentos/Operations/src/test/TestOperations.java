/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import Operations.Operations;

/**
 *
 * @author david
 */
public class TestOperations {
    
    public static void main(String[] args) {
        var result = Operations.sumar(3, 4);
        System.out.println("result = " + result);
        
        var result2 = Operations.sumar(2.0, 4);
        System.out.println("result2 = " + result2);
        
        //la inferencia hace que use el double debido a que este si es 
        //compatible con lon y int no
        var result3 = Operations.sumar(5, 3L);
    }
}
