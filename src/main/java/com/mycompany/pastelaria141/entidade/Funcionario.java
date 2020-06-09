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
public class Funcionario extends Pessoa {

    private String cargo;
    private String salario;
    private String id;

    /**
     *
     * @param id
     * @param nome
     * @param cpf
     * @param endereco
     */
    public Funcionario(String nome, String cpf, String endereco, String cargo, String salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    public Funcionario(String nome, String cpf, String endereco, String cargo, String salario, String id) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cargo = cargo;
        this.salario = salario;
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
}
