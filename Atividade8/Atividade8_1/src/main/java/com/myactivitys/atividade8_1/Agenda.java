/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade8_1;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Agenda {

    private String[][] dados;

    
    public String[][] getDados() {
        return dados;
    }

    public void setDados(String[][] dados) {
        this.dados = dados;
    }

    public Agenda() {
        this.dados = new String[0][2];
    }

    public Agenda(String[][] dados) {
        this.dados = dados;
    }

    public void entDados() {
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        String telefone = JOptionPane.showInputDialog("Cadastre o seu telefone");
        
        String[][] newData = new String[dados.length + 1][2];
        for(int i = 0; i < dados.length; i++){
            newData[i] = dados[i];
        }
        newData[dados.length] = new String[]{nome, telefone};
        dados = newData;
    }

    public void imprimir() {
        for (String[] contato : dados) {
            System.out.println("Nome: "+contato[0] + ", Telefone: "+contato[1]);
        }
    }

    public String buscar(String nome) {
        for (String[] contato : dados) {
            if(contato[0].equalsIgnoreCase(nome)) {
                return "Telefone de "+ nome + ": "+ contato[1];
            }
        }
        return "Nome nao encontrado na agenda.";
    }
}
