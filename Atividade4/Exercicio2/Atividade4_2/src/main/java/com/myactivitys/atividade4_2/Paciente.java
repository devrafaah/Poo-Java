/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade4_2;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Paciente {
    String nome;
    String rg;
    String endereco;
    String telefone;
    int anoNascimento;
    String profissao;
    
    public Paciente() {}
    
    public Paciente(String n){
        this.nome = n;
    }
    public void cadastraDados(String n, String r, String e, String t, int aN, String p) {
        this.nome = n;
        this.rg = r;
        this.endereco = e;
        this.telefone = t;
        this.anoNascimento = aN;
        this.profissao = p;
    }
    public void imprimeDados(int idade) {
        JOptionPane.showMessageDialog(null, "Novo Paciente"+ "\nNome: "+nome+ "\nRg: "+rg+"\nEndereco: "+endereco+"\nTelefone: "+telefone+"\nAno Nascimento: "+anoNascimento+"\nProfissao: "+profissao+"\nIdade: "+idade);
    }
    public int calculaIdade(int anoAtual) {
        return anoAtual - anoNascimento;
    }
}
