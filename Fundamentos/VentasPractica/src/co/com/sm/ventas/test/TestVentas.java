package co.com.sm.ventas.test;

import co.com.sm.ventas.Orden;
import co.com.sm.ventas.Producto;

/**
 *
 * @author david
 */
public class TestVentas {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Pantalon", 1200000);
        Producto producto2 = new Producto("Chaqueta", 500000);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        
       orden1.mostrarTotal();
    }

}
