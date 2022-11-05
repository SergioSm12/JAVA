package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HoraServlet")
public class HoraServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //indicar al navegado que vamos a enviar informacion
        response.setContentType("text/html;charset-UTF-8");
        //indicar al navegador que se va enviar informacion cada segundo 
        response.setHeader("refresh", "1");
        Date fecha = new Date();
        
        SimpleDateFormat formateador = new SimpleDateFormat("'Hora actualizada' HH::mm:ss");
        String horaConFormato = formateador.format(fecha);
        
        PrintWriter out = response.getWriter();
        out.print("Hora actualizada: "+ horaConFormato);
        out.close();
    }
}
