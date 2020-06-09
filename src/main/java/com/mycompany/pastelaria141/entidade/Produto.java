/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pastelaria141.entidade;

/**
 *
 * @author DiogoSouza
 */
public class Produto {
    private String id;
    private String nome;
    private String quantidade;
    private String preco;
    private String tipo;
    private String descricao;

    public Produto(String nome, String quantidade, String preco, String tipo, String descricao) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public Produto(String id, String nome, String quantidade, String preco, String tipo, String descricao) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    

    
    
    
}
