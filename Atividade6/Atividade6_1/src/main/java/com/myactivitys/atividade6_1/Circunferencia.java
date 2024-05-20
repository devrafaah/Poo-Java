/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade6_1;

import static java.lang.Math.PI;
import javax.swing.JOptionPane;

/**
 *
 * @author MobDi
 */
public class Circunferencia extends Forma {
    private float raio;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
    
    public void Circunferencia(float raio) {
        this.raio = raio;
    }
    
    public void setCircunferencia(float r) {
        this.raio = r;
    }
    public float getCircunferencia() {
        return raio;
    }
    
    
    
    @Override
    public float Area(){
        float area = (float)(PI * (raio*raio));
        return area;
    }
    @Override
    public float Perimetro(){
        float perimetro = (float)(2 * PI * raio);
        return perimetro;
    }
    @Override
    public void Mostrar(){
        JOptionPane.showMessageDialog(null, "Dados:\nRaio: "+raio+"\nArea: "+Area()+"\nPerimetro: "+Perimetro());
    }
}
