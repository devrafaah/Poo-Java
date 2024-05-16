/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade3;

/**
 *
 * @author MobDi
 */
public class Data {
    int dia;
    int mes;
    int ano;
    
    public Data() {
        
    }
    public Data(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    
    void cadastrarDados(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    void imprimirDados() {
        System.out.println("Data de criacao: "+ dia + "/" + mes + "/" + ano);
    }
}
