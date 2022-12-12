<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Lee los valores del JAVA BEAN</title>
    </head>
    <body>
        <h1>JSP Lee los valores del java bean</h1>
        <jsp:useBean id="rectangulo" class="beans.Rectangulo" scope="session"/>
        <br/>
        Valor de la base: <jsp:getProperty name="rectangulo" property="base"/>
        <br/>
        Valor de la altura: <jsp:getProperty name="rectangulo" property="altura"/>
        <br/>
        valor de la area: <jsp:getProperty name="rectangulo" property="area"/>
        <br>
        <br>
        <a href="index.jsp">Inicio</a>
        
    </body>
</html>
