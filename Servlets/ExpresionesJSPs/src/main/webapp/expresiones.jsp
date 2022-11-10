<%-- 
    Document   : expresiones
    Created on : 6/11/2022, 1:55:59 p. m.
    Author     : david
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con expresiones</title>
    </head>
    <body>
        <h1>JSP con expresiones</h1>
        Concatenacion : <%="Saludos"+" "+"JSP" %>
        <br>
        Operacion Matematica <%= 2*3 /2 %>
        <br>
        Sesion id : <%= session.getId() %>
        <br>
        <br>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
