/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade7_2;

/**
 *
 * @author MobDi
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public Funcionario(){
        
    }
    public Funcionario(String n, String c, double s){
        this.nome = n;
        this.cpf = c;
        this.salario = s;
    }
    public boolean autentica() {
        return false;
    }
    public double bonificacao() {
        double bonification;
        if(salario > 1200){
            bonification = 200;
            salario = salario + bonification;
            return bonification;
        }else {
            return 0;
        }
    }
    
}
