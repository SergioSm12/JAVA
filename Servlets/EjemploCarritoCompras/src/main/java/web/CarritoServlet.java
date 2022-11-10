package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html;charset=UTF-8");

        //Creamos o recuperamos el objeto http session
        HttpSession sesion = request.getSession();

        //recuperamos la lista de articulos agregados previamente si existen
        // se hace el casteo por que get attribute genera un object
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        //verificamos la lista de articulos
        if (articulos == null) {
            //inicializamos la lista de articulos
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }
        //procesamos el nuevo articulo que viene del input 
        String articuloNuevo = request.getParameter("articulo");

        //revisamos y agregamos el articulo nuevo
        if (articuloNuevo != null && !articuloNuevo.trim().equals("")) {
            articulos.add(articuloNuevo);
        }

        //Imprimimos la lista de articulos
        PrintWriter out = response.getWriter();
        out.print("<h1>Lista de articulos</h1>");
        out.print("<br>");
        for (String articulo : articulos) {
            out.print("<li>" + articulo + "</li>");
        }

        //Agregamos un link para regresar al inicio
        out.print("<br>");
        out.print("<a href='/EjemploCarritoCompras'>Regresar al inicio</a>");
        out.close();
    }
}
