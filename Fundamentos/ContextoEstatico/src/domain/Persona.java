/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author david
 */
public class Persona {

    // cuando no son static estas solo se asocian al objeto
    private int idPersona;
    private String nombre;
    // las variables static se asocian a la clase 
    private static int contadorPersonas;

    public Persona(String nombre) {
        this.nombre = nombre;
        //incrementar el contador
        Persona.contadorPersonas++;
        //Asignar el nuevo valor a la variable persona
        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
}
