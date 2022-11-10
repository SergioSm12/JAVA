<%-- 
    Document   : Scriplets
    Created on : 6/11/2022, 3:24:25 p. m.
    Author     : david
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con scriplets</title>
    </head>
    <body>
        <h1>JSP con Scriplets</h1>
        <br>
        <%-- Scriplet para enviarle indormacion al navegador --%>
        <% 
               out.print("Saludos desde un scriplet");

        %>
        <%-- Scriplets para manipular los objetos implicitos --%>
        <%
        String nombreAplicacion =request.getContextPath();
        out.print("Nombre de la aplicacion : " + nombreAplicacion);
        %>
        <br>
        <%-- Scriplet con codigo condicionado --%>
        <%
            if(session != null && session.isNew()){
                
        %>
        La sesion SI es nueva
        
        <% 
            }else if(session != null){
        
        %>
        la sesion No es nueva
        <% }%>
        <br>
        <a href="index.html">Regresar al Inicio </a>
    </body>
</html>
