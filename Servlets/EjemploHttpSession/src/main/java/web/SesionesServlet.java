/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/SesionesServlet")
public class SesionesServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession sesion = request.getSession();
        String titulo = null; 
        
        //pedir atributo de contador de visitas 
        // se hace casteo de object a integer
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        
        //si es la primera ves que accesedemos a la aplicacion 
        if(contadorVisitas== null){
           contadorVisitas=1;
           titulo= "Bienvenido por primera vez";
           
        }else{
           contadorVisitas++;
           titulo="Bienevenido Nuevamente";
        }
        
        //Agregamos el nuevo valor a la sesion
        //se asigna como un mapa
        sesion.setAttribute("contadorVisitas",contadorVisitas);
        
        // mandamos la respuesta al cliente
        PrintWriter out = response.getWriter();
        out.print(titulo);
        out.print("<br>");
        out.print("# de accesos al recurso : "+ contadorVisitas);
        out.print("<br>");
        out.print("Id de la sesion: " + sesion.getId());
        out.close();
    
    }
    
}
