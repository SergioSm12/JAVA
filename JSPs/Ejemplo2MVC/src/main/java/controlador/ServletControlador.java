package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import modelo.Rectangulo;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //1. Procesamos parametros
        String accion = request.getParameter("accion");

        //2. Creamos los javaBenas
        Rectangulo recRequest = new Rectangulo(1, 2);
        Rectangulo recSesion = new Rectangulo(3, 4);
        Rectangulo recAplicacion = new Rectangulo(5, 6);

        //3. Agragamos el javabean a algun alcance
        //revisamos la accion
        if("agregarVariables".equals(accion)){
            //alcance request
            request.setAttribute("rectanguloRequest",recRequest);
            //Alcance session.
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSesion", recSesion);
        
            //Alcance de aplication
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloAplicacion", recAplicacion);
            
            //Agragamos un mensaje
            request.setAttribute("mensaje", "las variables fueron agregadas");
            
            // redireccionamos al jsp de index 
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        }else if("listarVariables".equals(accion)){
            //4. Redireccionamos al jsp que despliega las variables
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        }else{
          //4. redireccion a la pagina de inicio 
          request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
          request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        
    }
}
