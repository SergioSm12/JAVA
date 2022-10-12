package co.com.sm.peliculas.presentacion;

import co.com.sm.peliculas.negocio.CatalogoPeliculasImpl;
import co.com.sm.peliculas.negocio.ICatalogoPeliculas;
import java.util.Scanner;

public class CatalogoPeliculasPresentacion {

    public static void main(String[] args) {
        var opcion = -1;
        var scanner = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println("Elige una opcion: \n"
                    + "1. Iniciar catalogo peliculas\n"
                    + "2. Agregar Pelicula\n"
                    + "3. Listar Peliculas\n"
                    + "4. Buscar Peliculas\n"
                    + "0. Salir");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.iniciarArchivo();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la pelicula: ");
                    var nombrePelicula = scanner.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Ingrese la pelicula que va ah buscar : ");
                    var buscar = scanner.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Hasta pronto : ");
                    break;
                default:
                    System.out.println("Opcion no reconocida");
                    break;

            }
        }

    }
}
