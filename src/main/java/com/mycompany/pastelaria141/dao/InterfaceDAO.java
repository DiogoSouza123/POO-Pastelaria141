/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pastelaria141.dao;

import com.mycompany.pastelaria141.entidade.Cliente;
import com.mycompany.pastelaria141.entidade.Funcionario;
import java.util.List;

/**
 *
 * @author DiogoSouza
 */
public interface InterfaceDAO {
    public boolean cadastrar(Cliente cliente);
    public List<Cliente> listarCliente();
    public boolean excluirCliente(int id);
    public Cliente localizarClienteID(String id);
    public boolean cadastrar(Funcionario funcionario);
    public List<Funcionario> listarFuncionarios();
    public boolean excluirFuncionario(int id);
    
}
