package domain;

import java.io.Serializable;

//Para hacer una clase java beans se debe de implementar la interfaz seializable
public class Persona implements Serializable {

    //para que sea beans las variables deben ser privadas
    //tambien si o si debe de tener un constructor publico y vacio 
    private String nombre;
    private String apellido;

    public Persona() {

    }

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    //tambien debe tener metodo get y set (javabeans)

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }

}
