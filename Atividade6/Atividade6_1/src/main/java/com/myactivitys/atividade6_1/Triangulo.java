/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade6_1;

import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Triangulo extends Forma {
    float base, altura;

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public Triangulo(float b, float a){
        this.base =b;
        this.altura = a;
    }
    
    @Override
    public float Area(){
        float area = (float)(base * altura);
        return area;
    }
    
    @Override
    public void Mostrar(){
        JOptionPane.showMessageDialog(null, "Dados do Triangulo\nArea: "+Area());
    }
}
