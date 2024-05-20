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
public class Retangulo extends Triangulo {

    public Retangulo(float b, float a) {
        super(b, a);
    }
    
    
    @Override
    public float Area(){
        float area = (float)(altura * base);
        return area;
    }
    
    @Override
    public float Perimetro(){
        float perimetro = (float)(base * altura) * 2;
        return perimetro;
    }
    
    @Override
    public void Mostrar(){
        JOptionPane.showMessageDialog(null, "Dados do Retangulo\nBase: "+base+"\nAltura: "+altura+"\nArea: "+Area()+"\nPerimetro: "+Perimetro());
    }
}