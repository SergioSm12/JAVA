package test;

import domain.*;

public class TestClasesAbstractas {

    public static void main(String[] args) {
        // No se puede crear un objeto de una clase abstracta 
        //Usamos polimorfismo(creamos una variable de tipo padre y la asignamos una instancia de tipo hijo) 
        FiguraGeometrica figura= new Rectangulo("Rectangulo");
        figura.dibujar();
    }   
    
}
