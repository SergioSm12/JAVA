package com.sm.ventas;

/**
 *
 * @author david
 */
public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrden;
    private int contadorProductos;
    private static final int MAX_PRODUCTS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrden;
        this.productos = new Producto[Orden.MAX_PRODUCTS];
    }

    public void agrgarProducto(Producto producto) {
        if (this.contadorProductos < Orden.MAX_PRODUCTS) {
            this.productos[this.contadorProductos++] = producto;
        } else {
            System.out.println("Se ha superado el maximo de productos" + Orden.MAX_PRODUCTS);
        }

    }

    public double calcularTotal() {
        //se itera hasta contador productos 
        // para de esta manera solo iterar los elementos agregados 
        double resultado = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            Producto producto = this.productos[i];
            resultado +=producto.getPrecio();
        }
        return resultado;
    }

    public void mostrarOrden() {
        System.out.println("id Orden : " + this.idOrden);
        System.out.println("Total de la Orden " + this.calcularTotal());
        System.out.println("Productos de la orden : ");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(productos[i]);
        }
        

    }

}
