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
            IUsuarioDAO usuarioDao = new UsuarioDAO(conexion);
            List<UsuarioDTO> usuarios = usuarioDao.list();

            for (UsuarioDTO usuario : usuarios) {
                System.out.println("usuario = " + usuario);
            }

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
