
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo Inclusion Dinamica</title>
    </head>
    <body>
        <h1>Ejemplo Inclusion Dinamica</h1>
        <br/>
        <jsp:include page="paginas/RecursoPublico.jsp"/>
        <br>
        <jsp:include page="WEB-INF/RecursoPrivado.jsp"> 
            <jsp:param name="colorFondo" value="yellow"/>
        </jsp:include>
    </body>
</html>
