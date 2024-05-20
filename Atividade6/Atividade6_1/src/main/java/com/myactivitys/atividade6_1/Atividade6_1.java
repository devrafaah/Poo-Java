/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.myactivitys.atividade6_1;

/**
 *
 * @author MobDi
 */
public class Atividade6_1 {

    public static void main(String[] args) {
        
        Circunferencia c1 = new Circunferencia();
        c1.setCircunferencia(10f);
        
        c1.Area();
        c1.Perimetro();
        c1.Mostrar();
        
        Retangulo r1 = new Retangulo(10f,20f);
        r1.altura = 10f;
        r1.base = 10f;
        
        r1.Area();
        r1.Perimetro();
        r1.Mostrar();
    }
}
