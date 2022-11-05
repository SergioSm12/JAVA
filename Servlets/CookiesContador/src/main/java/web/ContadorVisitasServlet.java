package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/CookiesServlet")
public class ContadorVisitasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //Declaramos la variable contador
        int contador = 0;

        //Revisamos si existe la cookie contador Visitas
        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("contadorVisitas")) {
                    contador = Integer.parseInt(c.getValue());
                }
            }
        }
        //Incremenatmos el contador 
        contador++;

        //Agragamos la cookie al navegador
        Cookie c = new Cookie("contadorVisitas", Integer.toString(contador));
        //la cookies se almacenara por una hora(3600s)
        c.setMaxAge(3600);
        response.addCookie(c);

        //Mandamos el mensaje al navegador 
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.print("Contador de visitas de cada cliente : " + contador);
    }
}
