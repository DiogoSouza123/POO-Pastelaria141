/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pastelario141.servlet;

import com.mycompany.pastelaria141.dao.FuncionarioDAO;
import com.sun.net.httpserver.HttpServer;
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
public class DeletarFuncionarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Empty
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        
        FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
        boolean ok = funcionarioDAO.excluirFuncionario(Integer.parseInt(id));
        PrintWriter out = response.getWriter();

        String url = "";
        if (ok) {
            request.setAttribute("cadastroOK", true);
            url = "/sucesso.jsp";
        } else {
            url = "/erro.jsp";
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
            dispatcher.forward(request,response);
       

    }
}
