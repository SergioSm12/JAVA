<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL CORE</title>
    </head>
    <body>
        <h1>JSTL CORE</h1>
        <!-- Manipulacion de Variables -->
        <!-- Definicion de variable -->
        <c:set var="nombre" value="Sergio"/>
        <!-- Desplegamos el valor de la Variable-->
        Variable nombre: <c:out value="${nombre}"/>
        <br/>
        <br/>
        Variable con codigo HTMl:
        <c:out value="<h4>Hola</h4>" escapeXml="false"/>
        <br>
        <br>
        <!<!-- Codigo condicionado, uso de if  -->
        <c:set var="bandera" value="true"/>

        <c:if test="${bandera}">
            La bandera es verdadera 
        </c:if>
        <br>
        <!-- Codigo condicionado, uso de switch  -->
        <c:if test="${param.opcion != null}">
            <c:choose>
                <c:when test="${param.opcion == 1}">
                    <br>
                    Opcion 1 seleccionada 
                </c:when>
                <c:when test="${param.opcion == 2}">
                    <br>
                    Opcion 2 seleccionada 
                </c:when>
                <c:otherwise>
                    <br>
                    Opcion proporcionada desconocida: ${param.opcion}
                </c:otherwise>    
            </c:choose>
        </c:if>
        <!-- Iteracion de un arreglo -->
        <% 
           String nombres[] = {"Claudia", "pedro","Juan"};
           request.setAttribute("nombres", nombres);
        %>
        <br>
        Lista de Nombres:
        <br>
        <ul>
            <c:forEach var="nombre" items="${nombres}">
                <li>Nombre: ${nombre}</li>
            </c:forEach>
        </ul>
        <br>
        <a href="index.jsp">Inicio</a>
    </body>
</html>
