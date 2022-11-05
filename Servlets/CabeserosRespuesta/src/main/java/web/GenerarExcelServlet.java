package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("GeneracionExcelServlet")
public class GenerarExcelServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        //indicamos el tipo de respuesta al navegador
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("content-Disposition", "attachment;filename=excelEjemplo.xls");
        //para un uso mas profesional de excel poi.apache.org

        //indicamos que el navegador no guarde cache
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-Control", "no-store");
        response.setDateHeader("Expires", -1);
        
        //desplegamos la informacion al cliente
        PrintWriter out = response.getWriter();
        out.print("\tValores");
        out.print("\t1");
        out.print("\t2");
        out.print("Total\t=SUMA(b2:b3)");
        out.close();
    }
}
