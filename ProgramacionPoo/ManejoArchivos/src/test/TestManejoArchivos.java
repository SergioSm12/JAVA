/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import manejoarchivos.ManejoArchivos;

/**
 *
 * @author david
 */
public class TestManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "prueba.txt";
        // ManejoArchivos.crearArchivo(nombreArchivo);
        // ManejoArchivos.anexarArchivo(nombreArchivo, "Hola desde java");
        // ManejoArchivos.anexarArchivo(nombreArchivo, "Adios");
        ManejoArchivos.leerArchivo(nombreArchivo);
    }
}
