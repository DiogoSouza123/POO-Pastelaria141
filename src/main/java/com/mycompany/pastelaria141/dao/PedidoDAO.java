/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pastelaria141.dao;

import com.mycompany.pastelaria141.db.Conexao;
import com.mycompany.pastelaria141.entidade.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DiogoSouza
 */
public class PedidoDAO {
        public static boolean cadastrarPedido(Pedido pedido) {
        boolean ok = false;
        Connection con;
        try {
            con = Conexao.getConexao();
            String sql = "insert into pedido values (default,?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, pedido.getCodCliente());
            ps.setString(2, pedido.getCodFuncionario());
            ps.setString(3, pedido.getData());
            ps.setString(4, pedido.getFormaPagamento());
            ps.setString(5, pedido.getCodProd());
            ps.setString(6, pedido.getQuantidade());
            ps.execute();

            
            ok = true;
        } catch (SQLException ex) {
            Logger.getLogger(PedidoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ok;
    }
}
