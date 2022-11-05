/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import datos.*;
import domain.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class TestManejoUsuarios {
    
    public static void main(String[] args) {
        Connection conexion = null;
        
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            UsuarioDAO usuarioDao = new UsuarioDAO(conexion);
            Usuario usuarioUpdate = new Usuario(1, "dmesa2", "123");
            usuarioDao.actualizar(usuarioUpdate);
            
            Usuario nuevoUsuario = new Usuario();
            //nuevoUsuario.setUsuario("smesa1111111111111111111111111111111111111111111111");
            nuevoUsuario.setUsuario("smesa");
            nuevoUsuario.setPassword("654321");
            usuarioDao.crear(nuevoUsuario);
            
            conexion.commit();
            System.out.println("Se ha echo comit de la transaccion");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Comenzamos el rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
            
        }
    }
    
}
