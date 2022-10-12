package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        //Se puede especificar dentro de diamantes que tipo va recivir(generics)
        //ejemplo recibe tipo string se puede poner tambien del tipo que nosotros hayamos creado ejemplo persona
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("MIercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        imprimir(miLista);
        //cuando se usa el generics en diamantes ya se puede imprimir por el tipo sin 
        //necesidad de hacer conversion
        String elementoGeneric = miLista.get(0);
        System.out.println("elementoGeneric = " + elementoGeneric);

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
        //set generic entre siamentes ponemos cualquier tipo incluso los creados por nosostros como por ejemplo persona
        
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        imprimir(miSet);
        //impresion de generics en diamante ya se puede por tipo
        

        //Colleccion de tipo map 
        System.out.println("Coleccion Map (Diccionario llave valor)");

        Map<String, String> miMapa = new HashMap<>();
        miMapa.put("Valor1", "Sergio");
        miMapa.put("Valor2", "David");
        miMapa.put("valor3", "Marcela");

        //String elemento = (String) miMapa.get("Valor1");
        // ya no es necesario hacer la conversion
        String elemento= miMapa.get("Valor1");
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
