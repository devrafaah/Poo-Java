/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade_2;

/**
 *
 * @author MobDi
 */
public class DataFormart {
    int dia;
    int mes;
    int ano;
    
    DataFormart(){}
    
    DataFormart(int d,int m,int a) {
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }
    
    String DataFormatada(int d, int m, int a) {
        return d + "/" + m + "/" + a;
    }
}
