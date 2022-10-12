
package domain;


public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    //bloque de inicializacion
    //se carga antes del constructor
    //y antes de los bloques de inicializacion no static
    static{
        System.out.println("Ejecucion del bloque estatico");
        ++Persona.contadorPersona;
    }
    //Bloque de inicializacion no estatico
    {
        System.out.println("Ejecucion del bloque no estatico");
        this.idPersona= Persona.contadorPersona++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
    
}
