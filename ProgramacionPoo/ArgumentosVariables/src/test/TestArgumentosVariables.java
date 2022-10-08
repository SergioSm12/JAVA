package test;

/**
 *
 * @author david
 */
public class TestArgumentosVariables {
    
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirNumeros(1, 2);
        variosParametros("Juan", 8,12,6,4,8);
    }

    //el argumento que varia debe de ir de ultimas
    private static void variosParametros(String nombre, int... numeros) {
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }

    //metodo para resivir variaos numeros sin saber cuantos
    // la variable numero opera como un arreglo 
    private static void imprimirNumeros(int... numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento : " + numeros[i]);
        }
    }
}
