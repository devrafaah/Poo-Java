/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade7_2;

/**
 *
 * @author MobDi
 */
public class Gerente extends Funcionario {
    private int senha;
    private int funcionariosGerenciados;

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getFuncionariosGerenciados() {
        return funcionariosGerenciados;
    }

    public void setFuncionariosGerenciados(int funcionariosGerenciados) {
        this.funcionariosGerenciados = funcionariosGerenciados;
    }
    
    
    public Gerente() {
        
    }
    public Gerente(int s,  int fG) {
        this.senha =s;
        this.funcionariosGerenciados = fG;
    }
    
    @Override
    public double bonificacao() {
        return 2000.0;
    }
    @Override
    public boolean autentica() {
        return true;
    }
    
}
