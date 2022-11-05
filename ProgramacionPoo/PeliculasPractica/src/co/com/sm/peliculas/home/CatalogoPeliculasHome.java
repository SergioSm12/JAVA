/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.sm.peliculas.home;

import co.com.sm.peliculas.negocio.CatalogoPeliculasImpl;
import co.com.sm.peliculas.negocio.ICatalogoPeliculas;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class CatalogoPeliculasHome {

    public static void main(String[] args) {
        var opcion = -1;
        Scanner teclado = new Scanner(System.in);
        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();

        while (opcion != 0) {
            System.out.println("Elige una opcion: \n"
                    + "1. Iniciar catalogo peliculas\n"
                    + "2. Agregar Pelicula\n"
                    + "3. Listar Peliculas\n"
                    + "4. Buscar Peliculas\n"
                    + "0. Salir");

            opcion = Integer.parseInt(teclado.nextLine());

            switch (opcion) {
                case 1:
                    catalogo.inicarCatalogo();
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la pelicula: ");
                    var nombrePelicula = teclado.nextLine();
                    catalogo.agregarPelicula(nombrePelicula);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Ingrese la pelicula que va a buscar:  ");
                    var buscar = teclado.nextLine();
                    catalogo.buscarPelicula(buscar);
                    break;
                case 0:
                    System.out.println("Hasta Pronto ");
                    break;
                default:
                    System.out.println("Opcion no reconocida ");
                    break;

            }
        }
    }
}
