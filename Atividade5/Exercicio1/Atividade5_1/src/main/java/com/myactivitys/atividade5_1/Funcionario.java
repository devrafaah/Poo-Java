/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade5_1;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;
    
    
    // Construtor sem paramêtros fazendo a atribuição para o atributo cargo = Assistente.
    public Funcionario(){
        this.cargo = "Assistente";
    }
    
    // Construtor completo recebendo os valores e fazendo a atribuição.
    public Funcionario(int c, float s, String car){
        this.cracha = c;
        this.salario = s;
        this.cargo = car;
    }
    
    // Métodos getters e setters
    public int getCracha(){ return cracha; }
    public void setCracha(int c){ this.cracha = c; }

    
    public float getSalario(){ return salario; }
    public void setSalario(float s){ this.salario = s; }
    
    public String getCargo(){ return cargo; }
    public void setCargo(String c){ this.cargo = c; }
    
    
    public void calculaAumento(float porcentagem){
        salario = (salario * porcentagem/100) + salario;
        JOptionPane.showMessageDialog(null, "Salario ajustado para "+salario + " por receber aumento de "+porcentagem + "%");
    }
    
    public void calculaAumento(int tempo){
        int acrescimoSalario = tempo * 150;
        salario = salario + acrescimoSalario;
        JOptionPane.showMessageDialog(null,"Tempo de trabalho: "+tempo +" anos\nCorresponde a um aumento de R$ "+acrescimoSalario+ " reais em cima do seu salario\nPARABENS!!");
        JOptionPane.showMessageDialog(null,"Seu novo salario: "+salario);
    }
}
