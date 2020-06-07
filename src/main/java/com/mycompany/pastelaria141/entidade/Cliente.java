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
public class Cliente extends Pessoa {

    private String email;
    private String id;
    /**
     *
     * @param id
     * @param nome
     * @param cpf
     * @param endereco
     */
    public Cliente(String nome, String cpf, String endereco, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;

    }

    public Cliente(String nome, String cpf, String endereco, String email, String id) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.id = id;
    }

    public Cliente() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    

}
