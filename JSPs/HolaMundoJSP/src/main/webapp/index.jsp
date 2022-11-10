<%-- 
    Document   : index
    Created on : 5/11/2022, 8:41:10 p. m.
    Author     : david
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>HolaMundo JSPs</title>
    </head>
    <body>
        <h1>HolaMundo JSPs</h1>
        <ul>
            <li> <%out.print("Hola Mundo con Scriplets");%></li> 
            <li>${"HolaMundo con Expresion Languge (EL)"}</li>
            <li><%="Hola Mundo con Expresiones" %></li>
            <li><c:out value="Hola Mundo con JSTL" /></li>
        </ul>

    </body>
</html>
