<%-- 
    Document   : cadastroCliente
    Created on : 5 de jun de 2020, 22:54:12
    Author     : DiogoSouza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Cliente</title>
    </head>
    <body>
        <h1>Formulário de Cadastro</h1>
        <form action="CadastrarClienteServlet" method="POST">
            Nome:<input type="text" name="nome"/><br>
            Cpf: <input type="text" name="cpf"/><br>
            Endereco <input type="text" name="endereco" required size="14"/><br>
            Email: <input type="text" name="email" required size="100"/><br>
            <button type="submit" >Enviar</button>
        </form>
    </body>
</html>
