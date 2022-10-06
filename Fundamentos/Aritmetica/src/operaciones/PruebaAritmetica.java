
package operaciones;

/**
 *
 * @author david
 */
public class PruebaAritmetica {
    public static void main(String[] args) {
        
        int a=10;
        int b= 2;
        
        Aritmetica aritmetica1 = new Aritmetica();
        System.out.println("aritmetica 1  a : " + aritmetica1.a);
        System.out.println("aritmetica1  b : " + aritmetica1.b );
       
        
        Aritmetica aritmetica2 = new Aritmetica(5, 12);
        System.out.println("aritmetica2 a : " + aritmetica2.a);
        System.out.println("aritmetica2 b : " + aritmetica2.b );
       
        
    }
}
