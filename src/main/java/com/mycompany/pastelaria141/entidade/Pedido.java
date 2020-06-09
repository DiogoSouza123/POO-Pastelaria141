/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pastelaria141.entidade;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DiogoSouza
 */
public class Pedido {

    private String id;
    private String codCliente;
    private String codFuncionario;
    private String data;
    private String formaPagamento;
    private String codProd;
    private String quantidade;
    //private List<ItemPedido> listaItens;
    
    
    //construtor sem id pois o banco gera ele
    public Pedido(String codCliente, String codFuncionario, String data, String formaPagamento, String codProd, String quantidade) {
        this.codCliente = codCliente;
        this.codFuncionario = codFuncionario;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.codProd = codProd;
        this.quantidade = quantidade;
    }
    // com id
    public Pedido(String id, String codCliente, String codFuncionario, String data, String formaPagamento, String codProd, String quantidade) {
        this.id = id;
        this.codCliente = codCliente;
        this.codFuncionario = codFuncionario;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.codProd = codProd;
        this.quantidade = quantidade;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(String codFuncionario) {
        this.codFuncionario = codFuncionario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getCodProd() {
        return codProd;
    }

    public void setCodProd(String codProd) {
        this.codProd = codProd;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
    

}
