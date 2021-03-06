<%-- 
    Document   : listarCliente
    Created on : 17 de mai de 2020, 22:43:43
    Author     : DiogoSouza
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Clientes</title>
    </head>
    <body>

        <table border="15">
            <th>Nome</th>
            <th>CPF</th>
            <th>Endereco</th>
            <th>Email</th>
            <th>Id</th>
            <th>Alterar</th>
                <c:forEach var="c" items="${clientes}">
                <tr>
                    <td>${c.nome}</td>
                    <td>${c.cpf}</td>
                    <td>${c.endereco}</td>
                    <td>${c.email}</td>
                    <td>${c.id}</td>
                    <td><a href="AlterarClientes?action=edit&id=<c:out value="${c.id}"/>">Entrar</a></td>
                </tr>
            </c:forEach>

            <tr></tr>
        </table>
        <a href="index.html">Início</a>
    </body>
</html>