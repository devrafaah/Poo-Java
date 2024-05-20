/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myactivitys.atividade7_1;

/**
 *
 * @author MobDi
 */
public class Aluno extends Pessoa {
    private String rgm;

    public String getRgm() {
        return rgm;
    }

    public void setRgm(String rgm) {
        this.rgm = rgm;
    }
    
    public Aluno(){
        
    }
    
    @Override
    public String mostraClasse(){
        return "Classe Aluno";
    }
}
