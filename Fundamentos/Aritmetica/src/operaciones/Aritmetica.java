
package operaciones;

/**
 *
 * @author david
 */
public class Aritmetica {
    
    int a;
    int b;
    
    public Aritmetica(){
        System.out.println("Ejecutando constructor");
  
    }
    
    public Aritmetica(int a , int b){
        this.a=a;
        this.b=b;
        System.out.println("Ejecutando constructor con argumentos");
    }
    
    public void sumar(){
        int resultado = a+b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarReturn(){
        int resultado= a+b;
        return resultado; 
    }
    
    public int SumarConArgumentos(int a, int b){
        this.a= a;
        this.b= b;
        return this.sumarReturn(); 
    }
    
}
