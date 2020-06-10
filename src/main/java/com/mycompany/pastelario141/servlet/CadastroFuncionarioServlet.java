/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pastelario141.servlet;

import com.mycompany.pastelaria141.dao.FuncionarioDAO;
import com.mycompany.pastelaria141.entidade.Funcionario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DiogoSouza
 */

public class CadastroFuncionarioServlet extends HttpServlet {
//Basicamente você utiliza o método doGet sempre que a requisição que você faz 
    //não altere o estado do servidor, como uma consulta, uma busca e etc.

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Empty
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String endereco = request.getParameter("endereco");
        String cargo = request.getParameter("cargo");
        String salario = request.getParameter("salario");

        Funcionario funcionario = new Funcionario(nome, cpf, endereco, cargo, salario);
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        boolean ok = funcionarioDAO.cadastrar(funcionario);
        PrintWriter out = response.getWriter();

        String url = "";
        if (ok) {
            request.setAttribute("cadastroOK", true);
            url = "/sucesso.jsp";
        } else {
            url = "/erro.jsp";
        }

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);

        dispatcher.forward(request, response);

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>


}
