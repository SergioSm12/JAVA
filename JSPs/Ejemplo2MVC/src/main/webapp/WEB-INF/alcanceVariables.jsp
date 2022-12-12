<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alcance variables</title>
    </head>
    <body>
        <h1>Alcance de Variables</h1>
        <br>
        variable request:
        Base: ${rectanguloRequest.base}
        Altura: ${rectanguloRequest.altura}
        Area: ${rectanguloRequest.area}
        <br><br>
        variable sesion:
        Base: ${rectanguloSesion.base}
        Altura: ${rectanguloSesion.altura}
        Area: ${rectanguloSesion.area}
        <br><br>
        variable Aplicacion:
        Base: ${rectanguloAplicacion.base}
        Altura: ${rectanguloAplicacion.altura}
        Area: ${rectanguloAplicacion.area}
        <br><br>
        <a href="${pageContext.request.contextPath}/index.jsp">Inicio</a>
    </body>
</html>
