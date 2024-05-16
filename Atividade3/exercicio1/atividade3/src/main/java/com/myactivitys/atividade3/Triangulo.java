/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade3;

/**
 *
 * @author MobDi
 */
public class Triangulo {
    float base;
    float altura;
    
    Triangulo() {
        
    }
    
    Triangulo(float b, float a) {
        this.base = b;
        this.altura = a;
    }
    
    float calcularArea(float b, float a) {
        return (b * a)/2;
    }
    
    String imprimirDados() {
        return "A area total: " + calcularArea(base,altura);
    }
}
