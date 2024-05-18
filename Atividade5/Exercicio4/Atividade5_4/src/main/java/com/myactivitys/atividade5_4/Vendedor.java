/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade5_4;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Vendedor {
    private float vendas;
    private float salario;
    private String nome;
    private int falta;
    
    Vendedor(float v, float s, String n, int f){
        this.vendas = v;
        this.salario = s;
        this.nome = n;
        this.falta = f;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFalta(int falta) {
        this.falta = falta;
    }

    public float getVendas() {
        return vendas;
    }

    public float getSalario() {
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public int getFalta() {
        return falta;
    }
    float calcularComissao(){
        float comissao;
        if(vendas >= 1000 && vendas < 2000){
            comissao = (salario * 10/100);
            return comissao;
        }else if(vendas >= 2000) {
            comissao = (salario * 15/100);
            return comissao;
        }else{
            comissao = 0f;
            return comissao;
        }
    }
    float descontoFalta(){
        float desconto = (salario/30)*falta;
        return desconto;
    }
    public void calculaSalario() {
        float comissao = calcularComissao();
        float descontoFalta = descontoFalta();
        
        salario = salario + comissao - descontoFalta;
    }
    public void imprimirDados(){
        JOptionPane.showMessageDialog(null, "Dados do Vendedor\nNome: "+nome+"\nVendas: "+vendas+"\nFalta: "+falta+"\nSalario: "+salario);
    }
}
