package test;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

public class TestManejoPersonas {

    public static void main(String[] args) {

        PersonaDAO personaDao = new PersonaDAO();
/*
        //Crear un nuevo objeto
        Persona personaCrear = new Persona("Sergio", "Mesa", "sm@gmail.com", "321458697");
        personaDao.insertar(personaCrear);*/

        //Update
        Persona personaUpdate = new Persona(2, "Juanito", "Ragnar","JRAGNAR@GMAIL.COM","3124583");
        personaDao.actualizar(personaUpdate);

        /*
        //delete
        Persona personaDelete = new Persona(1);
        personaDao.delete(personaDelete.getIdPersona());
        */
        //listar
        List<Persona> personas = personaDao.seleccionar();

        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }

    }

}
