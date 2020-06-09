<%-- 
    Document   : listarFuncionarios
    Created on : 20 de mai de 2020, 11:58:46
    Author     : DiogoSouza
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Funcionarios</title>
    </head>
    <body>
        <table border="15">
            <th>ID</th>
            <th>Nome</th>
            <th>CPF</th>
            <th>Endereco</th>
            <th>Cargo</th>
            <th>Salario</th>
            <th>Alterar</th>

            <c:forEach var="c" items="${funcionarios}">
                <tr>
                    <td>${c.id}</td>
                    <td>${c.nome}</td>
                    <td>${c.cpf}</td>
                    <td>${c.endereco}</td>
                    <td>${c.cargo}</td>
                    <td>${c.salario}</td>


                </tr>
            </c:forEach>

            <tr></tr>
        </table>
        <a href="index.html">Início</a>
    </body>
</html>
