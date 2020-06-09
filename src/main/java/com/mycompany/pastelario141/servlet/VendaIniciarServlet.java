/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pastelario141.servlet;

import com.mycompany.pastelaria141.dao.PedidoDAO;
import com.mycompany.pastelaria141.entidade.Pedido;
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
public class VendaIniciarServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Empty
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String idCli = request.getParameter("idCli");
        String idFunc = request.getParameter("idFunc");
        String data = request.getParameter("data");
        String pagamento = request.getParameter("pagamento");
        String idProd = request.getParameter("idProd");
        String quantidade = request.getParameter("quantiade");
        


        Pedido pedido = new Pedido(idCli, idFunc, data, pagamento, idProd, quantidade);
        boolean ok = PedidoDAO.cadastrarPedido(pedido);
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

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
