package test;

import datos.Conexion;
import datos.IPersonaDAO;
import datos.PersonaDAO;
import domain.PersonaDTO;
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
            IPersonaDAO personaDao = new PersonaDAO(conexion);
            List<PersonaDTO> personas = new PersonaDAO().select();
            
            for(PersonaDTO persona : personas){
                System.out.println("persona = " + persona);
            }

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
