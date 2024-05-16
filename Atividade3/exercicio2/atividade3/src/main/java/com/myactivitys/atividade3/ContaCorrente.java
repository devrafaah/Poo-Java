/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade3;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class ContaCorrente {
    String nome;
    float saldo;
    float limite;
    char tipo;
    
    ContaCorrente(String n, float s, float l, char t) {
        
    }
    ContaCorrente(String n, float s, char t) {
        
    }
    ContaCorrente() {
        
    }
    void CadastraDados(String n, float s, float l, char t) {
        this.nome = n;
        this.saldo = s;
        this.limite = l;
        this.tipo = t;
    }
    String ImprimeDados() {
        return "Dados Bancarios do cliente\nNome do Cliente: "+nome +"\nSaldo: "+saldo+"\nLimite: "+limite+"\nTipo de Conta Bancaria: "+tipo;
    }
    void Depositar(float valor) {
        JOptionPane.showMessageDialog(null,"Deposito de "+ valor +" realizada...");
        saldo = saldo + valor;
    }
    void Sacar(float valor) {
        if(valor > saldo) {
            JOptionPane.showMessageDialog(null, "O valor "+ valor +" está indisponivel na sua conta",
                                   "ERROR", JOptionPane.ERROR_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(null,"Saque de "+ valor +" realizado...");
            saldo = saldo - valor;    
        }
    }
}
