/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.sm.ventas.test;

import com.sm.ventas.Orden;
import com.sm.ventas.Producto;

/**
 *
 * @author david
 */
public class TestVentas {
    public static void main(String[] args) {
        Producto producto1= new Producto("Gaseosa", 4500);
        Producto producto2 = new Producto("cervesa",3000);
        
        
        Orden orden1 = new Orden();
        
        
        orden1.agrgarProducto(producto1);
        orden1.agrgarProducto(producto2);
        
        
        orden1.mostrarOrden();
        
    }
}
