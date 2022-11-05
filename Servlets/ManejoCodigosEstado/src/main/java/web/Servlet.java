package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //simulado de los valores correctos
        String usuarioOk = "juan";
        String passwordok = "123";
        
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        
        if (usuarioOk.equals(usuario) && passwordok.equals(password)) {
            out.print("<h1>");
            out.print("Datos correctos ");
            out.print("<br> usuario : " + usuario);
            out.print("<br> password: " + password);
            out.print("</h1>");
        } else {
            response.sendError(response.SC_UNAUTHORIZED, "Las credenciales son incorrectas");
        }
        out.close();
    }
}
