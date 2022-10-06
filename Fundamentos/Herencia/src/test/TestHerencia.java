
package test;

import domain.Cliente;
import domain.Empleado;
import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author david
 */
public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Sergio", 3000000);
        System.out.println("empleado1 = " + empleado1);
        
        var fecha = new Date();
        Cliente cliente1 = new Cliente(fecha, true, "David",  'M', 22, "Samaca");
        System.out.println("cliente1 = " + cliente1);
    }
}
