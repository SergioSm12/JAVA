
package domain;

/**
 *
 * @author david
 */
//Final se usa para evitar que esta clase se pueda here
public  class Persona {
    
    //definir una constante 
    public final static double MI_CONSTANTE=8.2;
    private  String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    //Se usa final para evitar que el metodo se implemente en las clases hijas.
    public final void imprimir(){
        System.out.println("Metodo imprimir");
    }
    
}
