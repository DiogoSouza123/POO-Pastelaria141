<%-- 
    Document   : sucesso
    Created on : 7 de jun de 2020, 14:53:00
    Author     : DiogoSouza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sucesso</title>
    </head>
    <body>
        <h1>Sucesso!</h1>
        <c:if test="${cadastroOK}">
            <p>Sucesso!</p>
        </c:if>
        <a href="index.html">Início</a>
    </body>
</html>

