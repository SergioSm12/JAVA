package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        // Objeto lista guarda dinamicamente cualquier objeto que se le pase
        //List guarda el orden en que se le envia 
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("MIercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        imprimir(miLista);

        /*
        //Se usa variable de tipo object ya que list usa este tipo de dato
        for(Object elemento : miLista){
        System.out.println("elemento = " + elemento);
        }

        //uso de for con lambda o flecha
        miLista.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });*/
        System.out.println("Uso de coleccion set (no respeta el orden)");
        //Coleccion set "operaciones mas rapidas que el list"
        //la coleccion set  no respeta el orden
        //En el set no se puede duplicar los elementos
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        imprimir(miSet);

        //Colleccion de tipo map 
        System.out.println("Coleccion Map (Diccionario llave valor)");

        Map miMapa = new HashMap();
        miMapa.put("Valor1", "Sergio");
        miMapa.put("Valor2", "David");
        miMapa.put("valor3", "Marcela");

        String elemento = (String) miMapa.get("Valor1");
        System.out.println("elemento = " + elemento);
        //impresion del map 
        //para traer la llave se transforma a un set
        imprimir(miMapa.keySet());
        //para traer los valores se usa values que tambien es un tipo set
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection colection) {
        // foreach para tipos colection de modo lambda
        colection.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

    }

}
