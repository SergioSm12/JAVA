package co.com.sm.ventas;

/**
 *
 * @author david
 */
public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private final static int MAX_PRODUCTS = 10;
    private int contadorProductos;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTS];

    }
    
    public void agregarProducto(Producto producto){
        if(this.contadorProductos<Orden.MAX_PRODUCTS){
           this.productos[this.contadorProductos++]=producto; 
        }else{
        
            System.out.println("Se ha superado el maximo de productos "+ Orden.MAX_PRODUCTS);
        }
    }
    
    public double calcularProducto(){
      
        double total=0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += this.productos[i].getPrecio();
            
        }
        return total; 
    }
    
    public void mostrarTotal(){
        System.out.println("Orden # " + this.idOrden );
        System.out.println("Precio de la factura : " + this.calcularProducto());
        System.out.println("Productos");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println(this.productos[i]);
        }
    }

}
