package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        //[Filas] [columnas] 

        //ejemplo matriz
        int edades[][] = new int[3][2];

        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 9;
        edades[2][0] = 10;
        edades[2][1] = 12;
        System.out.println("edades = " + edades[1][0]);

        for (int filas = 0; filas < edades.length; filas++) {
            for (int columna = 0; columna < edades[filas].length; columna++) {
                System.out.println("edades " + filas + "-" + columna + ": " + edades[filas][columna]);
            }

        }
        //Añadir matriz de manera directa;
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora"}};
        for (int i = 0; i < frutas.length; i++) {
            for (int j = 0; j < frutas[i].length; j++) {
                System.out.println("futas " + i + "-" + j + " : " + frutas[i][j]);
            }
        }

        Persona personas[][] = new Persona[2][3];

        personas[0][0] = new Persona("juan");
        personas[0][1] = new Persona("David");
        personas[0][2] = new Persona("Dario");
        personas[1][0] = new Persona("Maria");
        personas[1][1] = new Persona("Alfredo");
        //Metodo de imprimir 
        imprimirMatriz(personas);
    }

    public static void imprimirMatriz(Object matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Matriz " + i + "-" + j + " : " + matriz[i][j]);
            }

        }
    }
}
