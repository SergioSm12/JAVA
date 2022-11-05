/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import datos.*;
import domain.*;
import java.util.*;

/**
 *
 * @author david
 */
public class TestManejoUsuarios {

    public static void main(String[] args) {
        UsuarioDAO usuarioDao = new UsuarioDAO();

        //crear
        /*
        Usuario newUsuario = new Usuario("Juan", "6588974");
        usuarioDao.crear(newUsuario);*/
        
        /*
        //update 
        Usuario usuarioUpdate = new Usuario(1, "dmesa", "8452");
        usuarioDao.actualizar(usuarioUpdate);*/
        
        //delete 
        
        Usuario usarioDelete = new Usuario(2);
        usuarioDao.delete(usarioDelete);
        //listar
        List<Usuario> usuarios = usuarioDao.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("usuario = " + usuario);
        }
    }

}
