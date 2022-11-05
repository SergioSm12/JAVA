package test;

import datos.Conexion;
import datos.PersonaDAO;
import domain.Persona;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestManejoPersonas {

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PersonaDAO personaDao = new PersonaDAO(conexion);
            Persona cambioPersona = new Persona(4, "david2", "Mesa", "dmesa@sdas.com", "3202697412");
            personaDao.actualizar(cambioPersona);

            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Juan");
            nuevaPersona.setApellido("Perez1111111111111111111111111111111111111111111111111111111");
            nuevaPersona.setApellido("Perez");
            nuevaPersona.setEmail("jperez");
            nuevaPersona.setTelefono("3698745216");
            personaDao.insertar(nuevaPersona);

            //se debe de especificar cuando guardar los cambios 
            conexion.commit();
            System.out.println("Se ha echo comit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }

}
