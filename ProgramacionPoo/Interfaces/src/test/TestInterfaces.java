package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMySql;
import accesodatos.ImplementacionOracle;

public class TestInterfaces {

    public static void main(String[] args) {
        //para ser generico usamos polimoofismo
        //creamos variable tipo padre(IAccesoDatos) y la instancioamos con objeto hijo (ImplementacionMySql)
        IAccesoDatos datos = new ImplementacionMySql();
        //datos.listar();
        imprimirListar(datos);
        
        //Usamos la misma variable y la asignamos a la instancia de oracle
        //(polimorfismo)
        datos= new ImplementacionOracle();
        //datos.listar();
        imprimirListar(datos);
    }
    
    //metodo de una interface
    
    public static void imprimirListar(IAccesoDatos datos){
       datos.listar();
    }

}
