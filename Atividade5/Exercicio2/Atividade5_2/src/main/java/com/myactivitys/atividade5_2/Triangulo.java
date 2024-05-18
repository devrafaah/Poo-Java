/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade5_2;

/**
 *
 * @author MobDi
 */
public class Triangulo {
    private double base;
    private double altura;
    
    
    // sem parametros
    public Triangulo() {
        
    }
    public Triangulo(double b, double a) {
        this.base = b;
        this.altura = a;
    }
    
    public double getBase() { return base; }
    public void setBase(double base) {
        this.base = base;
    }
    
    
    
    public double getAltura() { return altura; }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    public double calculaArea() {
        double area = base*altura/2;
        return area;
    }
    public void imprimeDados() {
        System.out.println("Base: "+getBase()+"\nAltura: "+getAltura()+"\nArea total: "+calculaArea());
    }
}
