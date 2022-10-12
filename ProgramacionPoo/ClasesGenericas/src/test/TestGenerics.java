package test;

import genericos.ClaseGenerica;

public class TestGenerics {

    public static void main(String[] args) {
        //creacion de objeto generico
        // no se puede usar tipos primitivos solo clases en volventes
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(15);
        objetoInt.obtenerTipo();

        ClaseGenerica<String> objetoString = new ClaseGenerica("Juan");
        objetoString.obtenerTipo();
    }
}
