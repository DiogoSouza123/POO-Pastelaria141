/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pastelaria141.dao;

import com.mycompany.pastelaria141.db.Conexao;
import com.mycompany.pastelaria141.entidade.Cliente;
import com.mycompany.pastelaria141.entidade.Funcionario;
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
public class FuncionarioDAO implements InterfaceDAO{

    @Override
    public boolean cadastrar(Funcionario funcionario) {
        boolean ok = false;
        Connection con;
        try {
            con = Conexao.getConexao();
            String sql = "insert into funcionario values (default,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, funcionario.getNome());
            ps.setString(2, funcionario.getCpf());
            ps.setString(3, funcionario.getEndereco());
            ps.setString(4, funcionario.getCargo());
            ps.setString(5, funcionario.getSalario());

            ps.execute();
            ok = true;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ok;
    }
    
    @Override
    public List<Funcionario> listarFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();
        boolean ok = false;
        Connection con;
        try {
            con = Conexao.getConexao();
            String sql = "select * from funcionario";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String nome = rs.getString("nome");
                String cpf = rs.getString("cpf");
                String endereco = rs.getString("endereco");
                String cargo = rs.getString("cargo");
                String salario = rs.getString("salario");
                String id = rs.getString("id");

                funcionarios.add(new Funcionario(nome, cpf, endereco, cargo, salario, id));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
        return funcionarios;
    }

    @Override
    public boolean excluirFuncionario(int id) {
        boolean ok = false;
        Connection con;
        try {
            con = Conexao.getConexao();
            String sql = ("delete from funcionario where id = ?");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ok = true;
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ok;
    }

    @Override
    public boolean cadastrar(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> listarCliente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente localizarClienteID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluirCliente(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
