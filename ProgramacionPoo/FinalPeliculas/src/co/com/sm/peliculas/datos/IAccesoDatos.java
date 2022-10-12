package co.com.sm.peliculas.datos;

import co.com.sm.peliculas.domain.Pelicula;
import co.com.sm.peliculas.excepciones.AccesoDatosEx;
import co.com.sm.peliculas.excepciones.EscrituraDatosEx;
import co.com.sm.peliculas.excepciones.LecturaDatosEx;
import java.util.List;

public interface IAccesoDatos {

    boolean exite(String nombreArchivo) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreArchivo) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;

    void crear(String nombreArchivo) throws AccesoDatosEx;

    void borrar(String nombreArchivo) throws AccesoDatosEx;
}
