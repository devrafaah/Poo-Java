/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade5_3;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Torneio {
    private String nome;
    private int idade;
    
    Torneio(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    String verificaCategoria(){
        if(idade >=5 && idade <= 7){
            return "Categoria Infantil";
        }else if(idade>=8 && idade <=10){
            return "Categoria Juvenil";
        }else if(idade>=11 && idade <=15){
            return "Categoria Adolescente";
        }else if(idade>=16 && idade <=30){
            return "Categoria Adulto";
        }else {
            return "Categoria Sênior";
        }
    }
    public void imprimeDados() {
        JOptionPane.showMessageDialog(null, "Dados do Atleta\n" +"Nome: "+nome+"\nIdade: "+idade+"\nCategoria: "+verificaCategoria());
    }
    
    
}
