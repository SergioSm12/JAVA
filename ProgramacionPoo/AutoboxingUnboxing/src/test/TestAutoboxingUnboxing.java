package test;

public class TestAutoboxingUnboxing {

    public static void main(String[] args) {
        //Clases Envolventes de tipos primitivos
        //Las de la derecha funcionan como un object
        /*
     int- Integer
     long- Long
     float - Float
     double- Double 
     boolean- Boolean
     byte- Byte
     char- Character
     short -Short   
         */

        Integer entero = 10;//autoboxing envuelve el tipo primitivo en un tipo object
        System.out.println("entero = " + entero);
        //Debido a que es tipo integer se puede acceder a metodos
        // ejemplo se puede pasar a string
        System.out.println("entero string = " + entero.toString());

        int entero2 = entero;//Unboxing de object a tipo primitivo 
        System.out.println("entero2 = " + entero2);

    }

}
