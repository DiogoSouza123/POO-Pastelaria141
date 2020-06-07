/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pastelaria141.dao;

import com.mycompany.pastelaria141.db.Conexao;
import com.mycompany.pastelaria141.entidade.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DiogoSouza
 */
public class ClienteDAO {

    public static boolean cadastrarCliente(Cliente cliente) {
        boolean ok = false;
        Connection con;
        try {
            con = Conexao.getConexao();
            String sql = "insert into cliente values (default,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNome());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getEndereco());
            ps.setString(4, cliente.getEmail());
            ps.execute();
            ok = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ok;
    }

    public static List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        boolean ok = false;
        Connection con;
        try {
            con = Conexao.getConexao();
            String sql = "select * from cliente";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String endereco = rs.getString("endereco");
                String email = rs.getString("email");
                String id = rs.getString("id");

                clientes.add(new Cliente(nome, cpf, endereco, email, id));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }

    public static boolean excluirCliente(int id) {
        boolean ok = false;
        Connection con;
        try {
            con = Conexao.getConexao();
            String sql = ("delete from cliente where id = ?");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ok = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ok;
    }

    public static Cliente localizarClienteID(String id) {
        boolean ok = false;
        Connection con;
        Cliente cliente = new Cliente();
        try {
            con = Conexao.getConexao();
            String sql = ("select * from cliente where id = ?");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String endereco = rs.getString("endereco");
                String email = rs.getString("email");
                String ide = rs.getString("id");

                cliente = new Cliente(nome, cpf, endereco, email, ide);
            }

            ok = true;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }
}
